package com.ces2.acciondedibujar.controlador;

import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.EstadisticaDibujos;
import com.ces2.acciondedibujar.modelo.FilaCoincidenciasDibujos;
import com.ces2.acciondedibujar.modelo.FilaColoresDibujos;
import com.ces2.acciondedibujar.modelo.FilaMayorTrazo;
import com.ces2.acciondedibujar.modelo.Figura;
import com.ces2.acciondedibujar.repositories.Dibujos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class DibujoControlador {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("peticion1")
    public String peticion1(Model model) {

        String nombres = Dibujos.lista.stream()
                .map(Figura::getNombre)
                .collect(Collectors.joining(", "));

        model.addAttribute("nombres", nombres);

        return "vista1";
    }

    @GetMapping("peticion2")
    public String peticion2(Model model) {

        List<EstadisticaDibujos> estadisticas = new ArrayList<>();

        for (Figura figura : Dibujos.lista) {

            IntSummaryStatistics stats = figura.getDibujos().stream()
                    .collect(Collectors.summarizingInt(Dibujo::getGrosorTrazo));

            estadisticas.add(new EstadisticaDibujos(
                    figura.tipo(),
                    figura.getNombre(),
                    stats.getCount(),
                    (int) stats.getSum(),
                    stats.getAverage(),
                    stats.getCount() == 0 ? 0 : stats.getMin(),
                    stats.getCount() == 0 ? 0 : stats.getMax()));
        }

        model.addAttribute("estadisticas", estadisticas);

        return "vista2";
    }

    @GetMapping("peticion3")
    public String peticion3(Model model) {

        List<FilaColoresDibujos> filas = new ArrayList<>();

        for (Figura figura : Dibujos.lista) {

            List<String> colores = figura.getDibujos().stream()
                    .map(Dibujo::getColor)
                    .collect(Collectors.toList());

            filas.add(new FilaColoresDibujos(figura.tipo(), figura.getNombre(), colores));
        }

        model.addAttribute("filas", filas);

        return "vista3";
    }

    @GetMapping("peticion4")
    public String peticion4(Model model) {

        List<FilaCoincidenciasDibujos> filas = new ArrayList<>();

        for (Figura figura : Dibujos.lista) {

            boolean algunDibujoConRelleno = figura.getDibujos().stream()
                    .anyMatch(Dibujo::isRelleno);

            boolean algunDibujoConTrazoGrueso = figura.getDibujos().stream()
                    .anyMatch(dibujo -> dibujo.getGrosorTrazo() > 3);

            boolean ningunDibujoConTrazoExtremo = figura.getDibujos().stream()
                    .noneMatch(dibujo -> dibujo.getGrosorTrazo() > 10);

            filas.add(new FilaCoincidenciasDibujos(
                    figura.tipo(),
                    figura.getNombre(),
                    algunDibujoConRelleno,
                    algunDibujoConTrazoGrueso,
                    ningunDibujoConTrazoExtremo));
        }

        model.addAttribute("filas", filas);

        return "vista4";
    }

    @GetMapping("peticion5")
    public String peticion5(Model model) {

        List<FilaMayorTrazo> filas = new ArrayList<>();

        for (Figura figura : Dibujos.lista) {

            Optional<Dibujo> mayorTrazo = figura.getDibujos().stream()
                    .max(Comparator.comparingInt(Dibujo::getGrosorTrazo));

            String descripcion = mayorTrazo
                    .map(dibujo -> dibujo.getNombre() + " (trazo " + dibujo.getGrosorTrazo() + " px)")
                    .orElse("Sin dibujos en la lista");

            filas.add(new FilaMayorTrazo(figura.tipo(), figura.getNombre(), descripcion));
        }

        model.addAttribute("filas", filas);

        return "vista5";
    }
}

package com.ces2.acciondedibujar.controlador;

import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.Figura;
import com.ces2.acciondedibujar.repositories.Dibujos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

        Map<String, Map<String, Number>> estadisticas = Dibujos.lista.stream()
                .collect(Collectors.toMap(
                        figura -> figura.getNombre() + " (" + figura.tipo() + ")",
                        figura -> {
                            IntSummaryStatistics stats = figura.getDibujos().stream()
                                    .collect(Collectors.summarizingInt(Dibujo::getGrosorTrazo));
                            Map<String, Number> datos = new LinkedHashMap<>();
                            datos.put("conteo", stats.getCount());
                            datos.put("suma", stats.getSum());
                            datos.put("promedio", stats.getAverage());
                            datos.put("minimo", stats.getCount() == 0 ? 0 : stats.getMin());
                            datos.put("maximo", stats.getCount() == 0 ? 0 : stats.getMax());
                            return datos;
                        },
                        (primero, segundo) -> primero,
                        LinkedHashMap::new));

        model.addAttribute("estadisticas", estadisticas);

        return "vista2";
    }

    @GetMapping("peticion3")
    public String peticion3(Model model) {

        List<Dibujo> dibujos = Dibujos.lista.stream()
                .flatMap(figura -> figura.getDibujos().stream())
                .toList();

        List<String> coloresDibujos = Dibujos.lista.stream()
                .flatMap(figura -> figura.getDibujos().stream().map(Dibujo::getColor))
                .toList();

        model.addAttribute("dibujos", dibujos);
        model.addAttribute("coloresDibujos", coloresDibujos);

        return "vista3";
    }

    @GetMapping("peticion4")
    public String peticion4(Model model) {

        Boolean algunaSinDibujos = Dibujos.lista.stream()
                .anyMatch(figura -> figura.getDibujos().isEmpty());

        Boolean algunaConMasDeDos = Dibujos.lista.stream()
                .anyMatch(figura -> figura.getDibujos().size() > 2);

        Boolean todasConCincoOMenos = Dibujos.lista.stream()
                .allMatch(figura -> figura.getDibujos().size() <= 5);

        Boolean ningunaConSeisOMas = Dibujos.lista.stream()
                .noneMatch(figura -> figura.getDibujos().size() >= 6);

        model.addAttribute("algunaSinDibujos", algunaSinDibujos);
        model.addAttribute("algunaConMasDeDos", algunaConMasDeDos);
        model.addAttribute("todasConCincoOMenos", todasConCincoOMenos);
        model.addAttribute("ningunaConSeisOMas", ningunaConSeisOMas);

        return "vista4";
    }

    @GetMapping("peticion5")
    public String peticion5(Model model) {

        List<Dibujo> dibujos = Dibujos.lista.stream()
                .flatMap(figura -> figura.getDibujos().stream())
                .toList();

        Optional<Dibujo> mayorTrazo = dibujos.stream()
                .max(Comparator.comparing(Dibujo::getGrosorTrazo));

        model.addAttribute("dibujos", dibujos);
        model.addAttribute("mayorTrazo", mayorTrazo.orElse(null));

        return "vista5";
    }
}

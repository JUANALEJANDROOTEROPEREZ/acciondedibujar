package com.ces2.acciondedibujar.controlador;

import com.ces2.acciondedibujar.modelo.Circulo;
import com.ces2.acciondedibujar.modelo.Cuadrado;
import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.Figura;
import com.ces2.acciondedibujar.modelo.ResultadoFigura;
import com.ces2.acciondedibujar.modelo.Triangulo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DibujoControlador {

    @GetMapping("/")
    public String mostrarDibujos(Model model) {

        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(
                new Dibujo("Circulo A", "rojo", 2, true, "cm"), 5));
        figuras.add(new Circulo(
                new Dibujo("Circulo B", "azul", 3, false, "cm"), 8.5));
        figuras.add(new Circulo(
                new Dibujo("Circulo C", "verde", 1, true, "mm"), 12));

        figuras.add(new Cuadrado(
                new Dibujo("Cuadrado A", "negro", 2, false, "cm"), 4));
        figuras.add(new Cuadrado(
                new Dibujo("Cuadrado B", "amarillo", 4, true, "cm"), 7));
        figuras.add(new Cuadrado(
                new Dibujo("Cuadrado C", "morado", 3, true, "m"), 2));

        figuras.add(new Triangulo(
                new Dibujo("Triangulo A", "naranja", 2, true, "cm"), 6, 4));
        figuras.add(new Triangulo(
                new Dibujo("Triangulo B", "gris", 1, false, "cm"), 10, 3));
        figuras.add(new Triangulo(
                new Dibujo("Triangulo C", "cyan", 5, true, "mm"), 8, 8));

        List<ResultadoFigura> resultados = new ArrayList<>();
        for (Figura figura : figuras) {
            Dibujo dibujo = figura.getDibujo();
            resultados.add(new ResultadoFigura(
                    figura.tipo(),
                    dibujo.getNombre(),
                    figura.dibujar(dibujo),
                    figura.colorear(dibujo),
                    figura.mostrarPropiedades(dibujo)));
        }

        model.addAttribute("titulo", "Trabajo 1 - Polimorfismo: la accion de dibujar");
        model.addAttribute("resultados", resultados);
        return "resultado";
    }
}

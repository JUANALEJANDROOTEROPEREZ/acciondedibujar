package com.ces2.acciondedibujar.modelo;

import java.util.List;

public class Circulo implements Figura {

    private final String nombre;
    private final List<Dibujo> dibujos;
    private final double radio;

    public Circulo(String nombre, List<Dibujo> dibujos, double radio) {
        this.nombre = nombre;
        this.dibujos = dibujos;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String dibujar(List<Dibujo> dibujos) {
        return "[Circulo] " + nombre + " traza con compas " + dibujos.size()
                + " dibujo(s), radio " + radio + ".";
    }

    @Override
    public String colorear(List<Dibujo> dibujos) {
        return "[Circulo] " + nombre + " colorea " + dibujos.size() + " dibujo(s) del lote.";
    }

    @Override
    public String mostrarPropiedades(List<Dibujo> dibujos) {
        return "[Circulo] " + nombre + ": radio " + radio + ", area " + String.format("%.2f", area())
                + ", perimetro " + String.format("%.2f", perimetro()) + ", " + dibujos.size() + " dibujo(s) en la lista.";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Dibujo> getDibujos() {
        return dibujos;
    }

    @Override
    public String tipo() {
        return "Circulo";
    }
}

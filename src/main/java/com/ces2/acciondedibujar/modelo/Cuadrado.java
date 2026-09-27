package com.ces2.acciondedibujar.modelo;

import java.util.List;

public class Cuadrado implements Figura {

    private final String nombre;
    private final List<Dibujo> dibujos;
    private final double lado;

    public Cuadrado(String nombre, List<Dibujo> dibujos, double lado) {
        this.nombre = nombre;
        this.dibujos = dibujos;
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String dibujar(List<Dibujo> dibujos) {
        return "[Cuadrado] " + nombre + " traza con regla " + dibujos.size()
                + " dibujo(s), lado " + lado + ".";
    }

    @Override
    public String colorear(List<Dibujo> dibujos) {
        return "[Cuadrado] " + nombre + " pinta " + dibujos.size() + " dibujo(s) del lote.";
    }

    @Override
    public String mostrarPropiedades(List<Dibujo> dibujos) {
        return "[Cuadrado] " + nombre + ": lado " + lado + ", area " + String.format("%.2f", area())
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
        return "Cuadrado";
    }
}

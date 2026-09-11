package com.ces2.acciondedibujar.modelo;

public class Cuadrado implements Figura {

    private final Dibujo dibujo;
    private double lado;

    public Cuadrado(Dibujo dibujo, double lado) {
        this.dibujo = dibujo;
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String dibujar(Dibujo dibujo) {
        return "[Cuadrado] Se dibuja " + dibujo.getNombre() + " con regla y escuadra, lado "
                + lado + " " + dibujo.getUnidad() + " y trazo de " + dibujo.getGrosorTrazo() + " px.";
    }

    @Override
    public String colorear(Dibujo dibujo) {
        return "[Cuadrado] " + dibujo.getNombre() + " se pinta de " + dibujo.getColor()
                + (dibujo.isRelleno() ? " rellenando toda la superficie." : " dejando el centro vacio.");
    }

    @Override
    public String mostrarPropiedades(Dibujo dibujo) {
        return "[Cuadrado] " + dibujo.getNombre() + ": lado " + lado + " " + dibujo.getUnidad()
                + ", area " + String.format("%.2f", area())
                + ", perimetro " + String.format("%.2f", perimetro()) + ".";
    }

    @Override
    public Dibujo getDibujo() {
        return dibujo;
    }

    @Override
    public String tipo() {
        return "Cuadrado";
    }
}

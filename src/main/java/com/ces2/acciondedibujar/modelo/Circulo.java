package com.ces2.acciondedibujar.modelo;

public class Circulo implements Figura {

    private final Dibujo dibujo;
    private double radio;

    public Circulo(Dibujo dibujo, double radio) {
        this.dibujo = dibujo;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String dibujar(Dibujo dibujo) {
        return "[Circulo] Se dibuja " + dibujo.getNombre() + " con un compas, radio "
                + radio + " " + dibujo.getUnidad() + " y trazo de " + dibujo.getGrosorTrazo() + " px.";
    }

    @Override
    public String colorear(Dibujo dibujo) {
        return "[Circulo] " + dibujo.getNombre() + " se colorea de " + dibujo.getColor()
                + (dibujo.isRelleno() ? " con relleno total." : " solo el borde.");
    }

    @Override
    public String mostrarPropiedades(Dibujo dibujo) {
        return "[Circulo] " + dibujo.getNombre() + ": radio " + radio + " " + dibujo.getUnidad()
                + ", area " + String.format("%.2f", area())
                + ", perimetro " + String.format("%.2f", perimetro()) + ".";
    }

    @Override
    public Dibujo getDibujo() {
        return dibujo;
    }

    @Override
    public String tipo() {
        return "Circulo";
    }
}

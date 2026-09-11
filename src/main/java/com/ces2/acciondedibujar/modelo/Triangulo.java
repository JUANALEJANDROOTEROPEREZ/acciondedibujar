package com.ces2.acciondedibujar.modelo;

public class Triangulo implements Figura {

    private final Dibujo dibujo;
    private double base;
    private double altura;

    public Triangulo(Dibujo dibujo, double base, double altura) {
        this.dibujo = dibujo;
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String dibujar(Dibujo dibujo) {
        return "[Triangulo] Se dibuja " + dibujo.getNombre() + " uniendo tres puntos, base "
                + base + " y altura " + altura + " " + dibujo.getUnidad()
                + ", trazo de " + dibujo.getGrosorTrazo() + " px.";
    }

    @Override
    public String colorear(Dibujo dibujo) {
        return "[Triangulo] " + dibujo.getNombre() + " se sombrea de " + dibujo.getColor()
                + (dibujo.isRelleno() ? " en toda su area." : " solo en los lados.");
    }

    @Override
    public String mostrarPropiedades(Dibujo dibujo) {
        return "[Triangulo] " + dibujo.getNombre() + ": base " + base + ", altura " + altura
                + " " + dibujo.getUnidad() + ", area " + String.format("%.2f", area()) + ".";
    }

    @Override
    public Dibujo getDibujo() {
        return dibujo;
    }

    @Override
    public String tipo() {
        return "Triangulo";
    }
}

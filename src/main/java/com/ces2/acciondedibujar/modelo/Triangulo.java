package com.ces2.acciondedibujar.modelo;

import java.util.List;

public class Triangulo implements Figura {

    private final String nombre;
    private final List<Dibujo> dibujos;
    private final double base;
    private final double altura;

    public Triangulo(String nombre, List<Dibujo> dibujos, double base, double altura) {
        this.nombre = nombre;
        this.dibujos = dibujos;
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String dibujar(List<Dibujo> dibujos) {
        return "[Triangulo] " + nombre + " une tres puntos para " + dibujos.size()
                + " dibujo(s), base " + base + " altura " + altura + ".";
    }

    @Override
    public String colorear(List<Dibujo> dibujos) {
        return "[Triangulo] " + nombre + " sombrea " + dibujos.size() + " dibujo(s) del lote.";
    }

    @Override
    public String mostrarPropiedades(List<Dibujo> dibujos) {
        return "[Triangulo] " + nombre + ": base " + base + ", altura " + altura
                + ", area " + String.format("%.2f", area()) + ", " + dibujos.size() + " dibujo(s) en la lista.";
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
        return "Triangulo";
    }
}

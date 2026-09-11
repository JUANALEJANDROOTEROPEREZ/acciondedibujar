package com.ces2.acciondedibujar.modelo;

public class Dibujo {

    private String nombre;
    private String color;
    private int grosorTrazo;
    private boolean relleno;
    private String unidad;

    public Dibujo(String nombre, String color, int grosorTrazo, boolean relleno, String unidad) {
        this.nombre = nombre;
        this.color = color;
        this.grosorTrazo = grosorTrazo;
        this.relleno = relleno;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getGrosorTrazo() {
        return grosorTrazo;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public String getUnidad() {
        return unidad;
    }

    public String ficha() {
        return "Dibujo " + nombre + ", color " + color + ", trazo " + grosorTrazo
                + " px, relleno " + (relleno ? "si" : "no") + ", unidad " + unidad;
    }
}

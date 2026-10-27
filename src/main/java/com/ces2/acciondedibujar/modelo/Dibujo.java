package com.ces2.acciondedibujar.modelo;

import java.util.Stack;
import java.util.function.Function;

public class Dibujo {

    private String nombre;
    private String color;
    private int grosorTrazo;
    private boolean relleno;
    private String unidad;
    private EnumDibujo tipo;
    private Categoria categoria;
    private Stack<Integer> conteo = new Stack<>();

    public Dibujo() {
    }

    public Dibujo(String nombre, String color, int grosorTrazo, boolean relleno, String unidad,
                  EnumDibujo tipo, Categoria categoria) {
        this.nombre = nombre;
        this.color = color;
        this.grosorTrazo = grosorTrazo;
        this.relleno = relleno;
        this.unidad = unidad;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public void agregarConteo(Integer... trazos) {
        for (Integer cantidad : trazos) {
            conteo.push(cantidad);
        }
    }

    public String verTotales(Function<Dibujo, Integer> funcion) {
        return "El dibujo " + nombre + " acumula en total " + funcion.apply(this)
                + " trazos en " + conteo.size() + " sesiones.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGrosorTrazo() {
        return grosorTrazo;
    }

    public void setGrosorTrazo(int grosorTrazo) {
        this.grosorTrazo = grosorTrazo;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public EnumDibujo getTipo() {
        return tipo;
    }

    public void setTipo(EnumDibujo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Stack<Integer> getConteo() {
        return conteo;
    }

    public void setConteo(Stack<Integer> conteo) {
        this.conteo = conteo;
    }

    public String ficha() {
        return "Dibujo " + nombre + ", color " + color + ", trazo " + grosorTrazo
                + " px, relleno " + (relleno ? "si" : "no") + ", unidad " + unidad
                + ", tipo " + tipo + ", categoria " + categoria + ", conteo " + conteo;
    }
}

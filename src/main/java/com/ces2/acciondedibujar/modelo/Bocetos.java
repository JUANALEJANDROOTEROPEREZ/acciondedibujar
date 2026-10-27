package com.ces2.acciondedibujar.modelo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bocetos {

    private String nombre;
    private String autor;
    private EnumDibujo tipo;
    private Categoria categoria;
    private Deque<Dibujo> dibujos = new ArrayDeque<>();

    public Bocetos() {
    }

    public Bocetos(String nombre, String autor, EnumDibujo tipo, Categoria categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public void agregarDibujo(Dibujo dibujo) {
        dibujos.addLast(dibujo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public Deque<Dibujo> getDibujos() {
        return dibujos;
    }

    public void setDibujos(Deque<Dibujo> dibujos) {
        this.dibujos = dibujos;
    }
}

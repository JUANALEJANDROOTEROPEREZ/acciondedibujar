package com.ces2.acciondedibujar.modelo;

public class FilaMayorTrazo {

    private String tipo;
    private String nombre;
    private String dibujoConMayorTrazo;

    public FilaMayorTrazo(String tipo, String nombre, String dibujoConMayorTrazo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dibujoConMayorTrazo = dibujoConMayorTrazo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDibujoConMayorTrazo() {
        return dibujoConMayorTrazo;
    }
}

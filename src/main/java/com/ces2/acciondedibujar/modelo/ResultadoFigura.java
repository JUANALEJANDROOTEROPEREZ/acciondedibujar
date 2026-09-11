package com.ces2.acciondedibujar.modelo;

public class ResultadoFigura {

    private String tipo;
    private String nombreDibujo;
    private String mensajeDibujar;
    private String mensajeColorear;
    private String mensajePropiedades;

    public ResultadoFigura(String tipo, String nombreDibujo, String mensajeDibujar,
                           String mensajeColorear, String mensajePropiedades) {
        this.tipo = tipo;
        this.nombreDibujo = nombreDibujo;
        this.mensajeDibujar = mensajeDibujar;
        this.mensajeColorear = mensajeColorear;
        this.mensajePropiedades = mensajePropiedades;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombreDibujo() {
        return nombreDibujo;
    }

    public String getMensajeDibujar() {
        return mensajeDibujar;
    }

    public String getMensajeColorear() {
        return mensajeColorear;
    }

    public String getMensajePropiedades() {
        return mensajePropiedades;
    }
}

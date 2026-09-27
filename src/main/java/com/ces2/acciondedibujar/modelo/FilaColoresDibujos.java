package com.ces2.acciondedibujar.modelo;

import java.util.List;

public class FilaColoresDibujos {

    private String tipo;
    private String nombre;
    private List<String> coloresDibujos;

    public FilaColoresDibujos(String tipo, String nombre, List<String> coloresDibujos) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.coloresDibujos = coloresDibujos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getColoresDibujos() {
        return coloresDibujos;
    }
}

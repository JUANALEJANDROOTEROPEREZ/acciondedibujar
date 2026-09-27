package com.ces2.acciondedibujar.modelo;

public class FilaCoincidenciasDibujos {

    private String tipo;
    private String nombre;
    private boolean algunDibujoConRelleno;
    private boolean algunDibujoConTrazoGrueso;
    private boolean ningunDibujoConTrazoExtremo;

    public FilaCoincidenciasDibujos(String tipo, String nombre, boolean algunDibujoConRelleno,
                                     boolean algunDibujoConTrazoGrueso,
                                     boolean ningunDibujoConTrazoExtremo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.algunDibujoConRelleno = algunDibujoConRelleno;
        this.algunDibujoConTrazoGrueso = algunDibujoConTrazoGrueso;
        this.ningunDibujoConTrazoExtremo = ningunDibujoConTrazoExtremo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAlgunDibujoConRelleno() {
        return algunDibujoConRelleno;
    }

    public boolean isAlgunDibujoConTrazoGrueso() {
        return algunDibujoConTrazoGrueso;
    }

    public boolean isNingunDibujoConTrazoExtremo() {
        return ningunDibujoConTrazoExtremo;
    }
}

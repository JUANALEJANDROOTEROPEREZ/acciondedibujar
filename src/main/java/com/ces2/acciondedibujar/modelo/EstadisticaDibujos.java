package com.ces2.acciondedibujar.modelo;

public class EstadisticaDibujos {

    private String tipo;
    private String nombre;
    private long conteo;
    private int sumaTotal;
    private double promedio;
    private int minimo;
    private int maximo;

    public EstadisticaDibujos(String tipo, String nombre, long conteo, int sumaTotal,
                               double promedio, int minimo, int maximo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.conteo = conteo;
        this.sumaTotal = sumaTotal;
        this.promedio = promedio;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public long getConteo() {
        return conteo;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }
}

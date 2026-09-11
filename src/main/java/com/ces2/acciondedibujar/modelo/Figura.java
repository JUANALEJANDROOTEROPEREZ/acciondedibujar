package com.ces2.acciondedibujar.modelo;

public interface Figura extends Dibujable, Coloreable, Describible {

    Dibujo getDibujo();

    String tipo();
}

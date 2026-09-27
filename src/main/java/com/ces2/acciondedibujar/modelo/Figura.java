package com.ces2.acciondedibujar.modelo;

import java.util.List;

public interface Figura extends Dibujable, Coloreable, Describible {

    String getNombre();

    List<Dibujo> getDibujos();

    String tipo();
}

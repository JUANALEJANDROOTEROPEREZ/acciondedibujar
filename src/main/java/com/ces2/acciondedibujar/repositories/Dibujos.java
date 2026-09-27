package com.ces2.acciondedibujar.repositories;

import com.ces2.acciondedibujar.modelo.Circulo;
import com.ces2.acciondedibujar.modelo.Cuadrado;
import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.Figura;
import com.ces2.acciondedibujar.modelo.Triangulo;

import java.util.Arrays;
import java.util.List;

public class Dibujos {

    private static final List<Dibujo> POOL = List.of(
            new Dibujo("Boceto-1", "rojo", 2, true, "cm"),
            new Dibujo("Boceto-2", "azul", 3, false, "cm"),
            new Dibujo("Boceto-3", "verde", 1, true, "mm"),
            new Dibujo("Boceto-4", "negro", 5, false, "cm"),
            new Dibujo("Boceto-5", "amarillo", 4, true, "m")
    );

    public static final List<Figura> lista = Arrays.asList(
            new Circulo("Circulo-1", POOL.subList(0, 0), 5),
            new Circulo("Circulo-2", POOL.subList(0, 1), 8.5),
            new Circulo("Circulo-3", POOL.subList(0, 2), 12),
            new Circulo("Circulo-4", POOL.subList(0, 3), 3.2),

            new Cuadrado("Cuadrado-1", POOL.subList(0, 2), 4),
            new Cuadrado("Cuadrado-2", POOL.subList(0, 3), 7),
            new Cuadrado("Cuadrado-3", POOL.subList(0, 4), 2),
            new Cuadrado("Cuadrado-4", POOL.subList(0, 5), 6),

            new Triangulo("Triangulo-1", POOL.subList(0, 0), 6, 4),
            new Triangulo("Triangulo-2", POOL.subList(0, 1), 10, 3),
            new Triangulo("Triangulo-3", POOL.subList(0, 4), 8, 8),
            new Triangulo("Triangulo-4", POOL.subList(0, 5), 5, 5)
    );
}

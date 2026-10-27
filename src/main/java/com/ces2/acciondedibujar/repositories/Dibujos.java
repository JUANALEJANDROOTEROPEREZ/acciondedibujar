package com.ces2.acciondedibujar.repositories;

import com.ces2.acciondedibujar.modelo.Categoria;
import com.ces2.acciondedibujar.modelo.Circulo;
import com.ces2.acciondedibujar.modelo.Cuadrado;
import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.EnumDibujo;
import com.ces2.acciondedibujar.modelo.Figura;
import com.ces2.acciondedibujar.modelo.Triangulo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Dibujos {

    private static final String[] COLORES = {"rojo", "azul", "verde", "negro", "amarillo"};
    private static final int[] GROSORES = {2, 3, 1, 5, 4};
    private static final boolean[] RELLENOS = {true, false, true, false, true};
    private static final String[] UNIDADES = {"cm", "cm", "mm", "cm", "m"};
    private static final EnumDibujo[] TIPOS = {EnumDibujo.LAPIZ, EnumDibujo.ACUARELA, EnumDibujo.TINTA,
            EnumDibujo.CARBONCILLO, EnumDibujo.PASTEL};
    private static final Categoria[] CATEGORIAS = {Categoria.TECNICO, Categoria.ARTISTICO, Categoria.DECORATIVO,
            Categoria.ARTISTICO, Categoria.DECORATIVO};

    private static List<Dibujo> dibujos(String prefijo, int cantidad) {
        return IntStream.range(0, cantidad)
                .mapToObj(i -> new Dibujo(prefijo + "-D" + (i + 1), COLORES[i], GROSORES[i], RELLENOS[i],
                        UNIDADES[i], TIPOS[i], CATEGORIAS[i]))
                .toList();
    }

    public static final List<Figura> lista = Arrays.asList(
            new Circulo("Circulo-1", dibujos("Circulo-1", 0), 5),
            new Circulo("Circulo-2", dibujos("Circulo-2", 1), 8.5),
            new Circulo("Circulo-3", dibujos("Circulo-3", 2), 12),
            new Circulo("Circulo-4", dibujos("Circulo-4", 3), 3.2),

            new Cuadrado("Cuadrado-1", dibujos("Cuadrado-1", 2), 4),
            new Cuadrado("Cuadrado-2", dibujos("Cuadrado-2", 3), 7),
            new Cuadrado("Cuadrado-3", dibujos("Cuadrado-3", 4), 2),
            new Cuadrado("Cuadrado-4", dibujos("Cuadrado-4", 5), 6),

            new Triangulo("Triangulo-1", dibujos("Triangulo-1", 0), 6, 4),
            new Triangulo("Triangulo-2", dibujos("Triangulo-2", 1), 10, 3),
            new Triangulo("Triangulo-3", dibujos("Triangulo-3", 4), 8, 8),
            new Triangulo("Triangulo-4", dibujos("Triangulo-4", 5), 5, 5)
    );
}

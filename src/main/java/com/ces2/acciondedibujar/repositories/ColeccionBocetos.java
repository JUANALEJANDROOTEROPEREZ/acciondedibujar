package com.ces2.acciondedibujar.repositories;

import com.ces2.acciondedibujar.modelo.Bocetos;
import com.ces2.acciondedibujar.modelo.Categoria;
import com.ces2.acciondedibujar.modelo.Dibujo;
import com.ces2.acciondedibujar.modelo.EnumDibujo;

import java.util.Stack;

public class ColeccionBocetos {

    public static final Stack<Dibujo> pilaDibujos = new Stack<>();

    public static final Bocetos bocetos = new Bocetos();

    static {
        Dibujo paisaje = new Dibujo("Paisaje", "verde", 2, true, "cm",
                EnumDibujo.CARBONCILLO, Categoria.ARTISTICO);

        Dibujo retrato = new Dibujo("Retrato", "negro", 3, false, "cm",
                EnumDibujo.CARBONCILLO, Categoria.ARTISTICO);
        retrato.agregarConteo(14);

        Dibujo naturalezaMuerta = new Dibujo("Naturaleza muerta", "rojo", 2, true, "cm",
                EnumDibujo.CARBONCILLO, Categoria.ARTISTICO);
        naturalezaMuerta.agregarConteo(20, 35);

        Dibujo bocetoUrbano = new Dibujo("Boceto urbano", "gris", 4, false, "mm",
                EnumDibujo.CARBONCILLO, Categoria.ARTISTICO);
        bocetoUrbano.agregarConteo(10, 25, 40);

        Dibujo caricatura = new Dibujo("Caricatura", "amarillo", 5, true, "cm",
                EnumDibujo.CARBONCILLO, Categoria.ARTISTICO);
        caricatura.agregarConteo(8, 12, 18, 30);

        pilaDibujos.push(paisaje);
        pilaDibujos.push(retrato);
        pilaDibujos.push(naturalezaMuerta);
        pilaDibujos.push(bocetoUrbano);
        pilaDibujos.push(caricatura);

        bocetos.setNombre("Cuaderno de bocetos");
        bocetos.setAutor("Juan Alejandro Otero");
        bocetos.setTipo(EnumDibujo.CARBONCILLO);
        bocetos.setCategoria(Categoria.ARTISTICO);

        pilaDibujos.forEach(bocetos::agregarDibujo);
    }
}

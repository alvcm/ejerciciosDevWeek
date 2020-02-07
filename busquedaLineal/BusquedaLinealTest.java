package com.alvaro;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BusquedaLinealTest {

    @Test
    public void testBuscarLinealmente() {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);

        int datoBuscado = 60;
        BusquedaLineal instancia = new BusquedaLineal();
        boolean result = instancia.buscarLinealmente(lista, datoBuscado);
        assertEquals(true, result);

    }
}
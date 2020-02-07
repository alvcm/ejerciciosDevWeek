package com.alvaro;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BusquedaBinariaTest {

    @Test
    public void testBuscarEnBinario() {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(15);
        lista.add(21);
        lista.add(30);
        lista.add(54);
        lista.add(65);
        lista.add(81);

        //Ordenando lista
        lista.sort(Integer::compareTo);

        int datoBuscado = 54;
        BusquedaBinaria instancia = new BusquedaBinaria();
        boolean resultado = instancia.buscarEnBinario(lista, 1, lista.size(), datoBuscado);

        assertEquals(true, resultado);

    }
}
package com.alvaro;

import java.util.ArrayList;
import java.util.Collection;

public class BusquedaBinaria {

     public static boolean buscarEnBinario(ArrayList<Integer> lista, int inicioLista, int finalLista, int datoBuscado) {


        if (inicioLista > finalLista) {
            return false;
        }

        int mitad = (inicioLista + finalLista)/2;

        if (lista.get(mitad) == datoBuscado) {
            return true;
        }

        if (lista.get(mitad) < datoBuscado) {
            return buscarEnBinario(lista, mitad + 1, finalLista, datoBuscado);
        } else {
            return buscarEnBinario(lista, inicioLista, mitad - 1, datoBuscado);
        }

    }
}

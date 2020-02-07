package com.alvaro;

import java.util.ArrayList;

public class BusquedaLineal {

    public boolean buscarLinealmente(ArrayList<Integer> lista, int dato){
        boolean respuesta = false;
        for (int i: lista) {
            if (i == dato){
                respuesta = true;
            }
        }
        return respuesta;
    }

    public void cargarLista(){
        
    }
}

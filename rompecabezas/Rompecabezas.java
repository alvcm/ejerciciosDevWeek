package com.alvaro;

import java.util.ArrayList;

public class Rompecabezas {

    private int piezas = 9;

    public Rompecabezas(int piezas) {

        if(esCuadradoPerfecto(piezas)){
            this.piezas = piezas;
        }

    }

    public int getPiezas() {
        return piezas;
    }

    public boolean esCuadradoPerfecto(int cantidadPiezas) {

        int raiz = (int) (Math.sqrt(cantidadPiezas));

        if (cantidadPiezas == (raiz * raiz)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int[][] generarRompecabezas(){

        int dimensionMatriz = (int)Math.sqrt(this.piezas);
        int[][] matriz = new int[dimensionMatriz][dimensionMatriz];

        int secuenciaPiezas = 0;

        for (int i = 0; i < dimensionMatriz ; i++) {
            for (int j = 0; j < dimensionMatriz; j++) {

                matriz[i][j] = secuenciaPiezas;
                secuenciaPiezas++;
            }
        }
        return matriz;
    }

    public int[][] desordenarRompecabezas(int[][] rompecabezas) {

        int dimension = rompecabezas.length;
        int aleatorioFila, aleatorioColumna, aux;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension ; j++) {
                aleatorioFila = (int) (Math.random() * dimension - 1);
                aleatorioColumna = (int) (Math.random() * dimension - 1);
                aux = rompecabezas[i][j];
                rompecabezas[i][j] = rompecabezas[aleatorioFila][aleatorioColumna];
                rompecabezas[aleatorioFila][aleatorioColumna] = aux;
            }

        }

        return rompecabezas;

    }

    public PosicionPieza obtenerPosicion(int[][] rompecabezas, int pieza) {

        int dimension = rompecabezas.length;
        PosicionPieza posicion = new PosicionPieza();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(rompecabezas[i][j] == pieza) {
                    posicion.setFila(i);
                    posicion.setColumna(j);
                }
            }
        }

        return posicion;
    }


    public boolean validarMovimiento(PosicionPieza espacio, PosicionPieza movimiento){

        int filaEspacio = espacio.getFila();
        int columnaEspacio = espacio.getColumna();

        int filaMovimiento = movimiento.getFila();
        int columnaMovimiento = movimiento.getColumna();

        if (filaEspacio == filaMovimiento){
            if(columnaEspacio == columnaMovimiento + 1 || columnaEspacio == columnaMovimiento - 1){
                return true;
            }
        }

        if(columnaEspacio == columnaMovimiento) {
            if(filaEspacio == filaMovimiento + 1 || filaEspacio == filaMovimiento - 1){
                return true;
            }
        }

        return false;

    }

    public int[][] realizarMovimiento(int[][] rompecabezas, int pieza){

        PosicionPieza espacioVacio = obtenerPosicion(rompecabezas, 0);
        PosicionPieza piezaAMover = obtenerPosicion(rompecabezas, pieza);

        if(validarMovimiento(espacioVacio, piezaAMover)) {
            rompecabezas[espacioVacio.getFila()][espacioVacio.getColumna()] = pieza;
            rompecabezas[piezaAMover.getFila()][piezaAMover.getColumna()] = 0;
        }

        return rompecabezas;

    }

}

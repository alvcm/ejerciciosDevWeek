package com.alvaro;

import java.util.ArrayList;

public class SumaEcuaciones {

    public ArrayList<Termino> sumarEcuaciones(ArrayList<Termino> ecuacion1, ArrayList<Termino> ecuacion2) {

        int terminosEnLaEcuacion = ecuacion1.size();

        ArrayList<Termino> resultadoEcuacion = new ArrayList<>();

        for (int i = 0; i < terminosEnLaEcuacion; i++) {

            int numeroSumado = ecuacion1.get(i).getNumero() + ecuacion2.get(i).getNumero();
            char letra;
            Termino dato = new Termino();

            switch(i) {
                case 0:
                    dato = new Termino(numeroSumado, 'x');
                    break;
                case 1:
                    dato = new Termino(numeroSumado, 'y');
                    break;
                default:
                    dato = new Termino(numeroSumado);
            }

            resultadoEcuacion.add(dato);
        }

        return resultadoEcuacion;

    }


}

package com.alvaro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RompecabezasTest {

    @Test
    public void testrealizarMovimiento() {
        Rompecabezas rompecabezas = new Rompecabezas(44);

        int [][] matriz = {{4,1,2},{3,0,5},{6,7,8}};
        int limite = 3;

        System.out.println("\n\n\n Matriz despues del movimiento");

        for (int i = 0; i <limite ; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("      ");
            }
            System.out.println("\n ------------------");

        }

        System.out.println("\n\n\n Matriz despues del movimiento");

        int [][] matrizMovida = rompecabezas.realizarMovimiento(matriz, 5);
        for (int i = 0; i <limite ; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matrizMovida[i][j]);
                System.out.print("      ");
            }
            System.out.println("\n ------------------");

        }
    }
}
package com.alvaro;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumaEcuacionesTest {

    @Test
    public void testSumarEcuaciones() {

        Termino dato1 = new Termino(2, 'x');
        Termino dato2 = new Termino(9, 'y');
        Termino dato3 = new Termino(2);

        Termino dato4 = new Termino(16, 'x');
        Termino dato5 = new Termino(5, 'y');
        Termino dato6 = new Termino(36);

        ArrayList<Termino> ecuacion1 = new ArrayList<>();

        ecuacion1.add(dato1);
        ecuacion1.add(dato2);
        ecuacion1.add(dato3);

        ArrayList<Termino> ecuacion2 = new ArrayList<>();

        ecuacion2.add(dato4);
        ecuacion2.add(dato5);
        ecuacion2.add(dato6);

        SumaEcuaciones ecuaciones = new SumaEcuaciones();

        ArrayList<Termino> listaResultado = new ArrayList<>();

        listaResultado = ecuaciones.sumarEcuaciones(ecuacion1, ecuacion2);


        int terminoResultado1 = listaResultado.get(0).getNumero();
        int terminoResultado2 = listaResultado.get(1).getNumero();
        int terminoResultado3 = listaResultado.get(2).getNumero();

        Assert.assertEquals(18, terminoResultado1);
        Assert.assertEquals(14, terminoResultado2);
        Assert.assertEquals(38, terminoResultado3);

    }
}
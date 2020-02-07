package com.alvaro;

public class Termino {

    private int numero;
    private char letra;

    public Termino() {

    }
    public Termino(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public Termino(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}

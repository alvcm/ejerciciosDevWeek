import java.text.DecimalFormat;

public class DecimalABinario {

     public double convertirDecimalABinario(int numero) {
        int  exponente = 0, digito;
        double binario = 0;

        while(numero > 0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente++;
            numero = numero/2;
        }
        return binario;
    }
}

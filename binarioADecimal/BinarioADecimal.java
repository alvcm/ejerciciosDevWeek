public class BinarioADecimal {
    
    public static int convertirBinarioADecimal(int binario){
        int decimal = 0;
        int exponente = 0;
        int ultimoDigito;

        while (binario != 0) {
            ultimoDigito= binario % 10;
            decimal += ultimoDigito * Math.pow(2, exponente);
            exponente++;
            binario = binario / 10;
        }

        return decimal;
    }
}

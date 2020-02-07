public class InvertirNumero {

    public static int invertir(int numero){
        int invertido = 0, resto;

        while(numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
            
        }

        return invertido;

    }
}

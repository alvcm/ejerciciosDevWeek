import java.util.ArrayList;

public class ConvertirAscii {
    
    public String convertirAsciiCaracter(int dato) {
        char caracter = (char)dato;
        //System.out.println(caracter);
        return String.valueOf(caracter);
    }

    public String decifrarMensaje(int[] mensaje) {
        String mensajeConvertido = "";
        for (int i = 0; i < mensaje.length; i++) {
            mensajeConvertido = mensajeConvertido + convertirAsciiCaracter(mensaje[i]) ;
            System.out.println(mensaje[i]);
        }
        //System.out.println(mensajeConvertido);

        return mensajeConvertido;

    }
}

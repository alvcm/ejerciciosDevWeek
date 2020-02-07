import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertirAsciiTest {

    ConvertirAscii instancia = new ConvertirAscii

    int[] mensaje = {70, 54, 68, 85, 89};

    @Test
    public void convertir_ascii_a_caracter() {
        Assert.assertEquals("S", instancia.convertirAsciiCaracter(83));
    }

    @Test
    public void dicifrar_mensaje_ascii_a_caracter() {
        Assert.assertEquals("F6DUY", instancia.decifrarMensaje(mensaje));
    }
}
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalABinarioTest {

    DecimalABinario instancia = new DecimalABinario();

    @Test
    public static void convertir_numero_decimal_a_binario(){
        Assert.assertEquals(1111101, DecimalABinario.convertirDecimalABinario(125));
    }
}
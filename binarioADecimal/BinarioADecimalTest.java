import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarioADecimalTest {

    BinarioADecimal instancia = new BinarioADecimal();
    @Test
    public void test_convertir_binario_a_decimal() {
        Assert.assertEquals(42,instancia.convertirBinarioADecimal(101010));
    }

}
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertirNumeroTest {

    InvertirNumero instancia = new InvertirNumero();
    
    @Test
    public void invertir_numero_positivo() {
        Assert.assertEquals(321, instancia.invertir(123));
    }
    @Test
    public void invertir_numero_segunda_prueba() {
        Assert.assertEquals(1546544, instancia.invertir(4456451));
    }

}
import org.example.ConversorMoeda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ConversorMoedaTest {

    @Test
    public void realParaDolarTest(){
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        assertEquals(583.19, conversorMoeda.realParaDolar(110, 5.30), 1);
    }

    @Test
    public void realParaDolarNegativo(){
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        assertThrows(RuntimeException.class, () -> conversorMoeda.realParaDolar(-50, 1.36));
    }

    @Test
    public void realParaDolarZero(){
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        assertThrows(RuntimeException.class, () -> conversorMoeda.realParaDolar(50, 0));
    }
}

import org.example.CalculadoraMedia;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalcularMediaTest {

    @Test
    public void calcularMediaTest(){
        CalculadoraMedia calculadoraMedia = new CalculadoraMedia();
        int[] lista = {5,6,8,9,4,2};

        assertEquals(5.66, calculadoraMedia.calcularMedia(lista), 0.01);
    }

    @Test
    public void calcularMediaTest2(){
        CalculadoraMedia calculadoraMedia = new CalculadoraMedia();
        int[] lista = {5};

        assertEquals(5, calculadoraMedia.calcularMedia(lista), 0.01);
    }

    @Test
    public void calcularMediaTest3(){
        CalculadoraMedia calculadoraMedia = new CalculadoraMedia();
        int[] lista = {};

        assertEquals(0, calculadoraMedia.calcularMedia(lista), 0.01);
    }
}

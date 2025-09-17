import org.example.Tabuada;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TabuadaTest {

    @Test
    public void gerarTabuadaTest(){
        Tabuada tabuada = new Tabuada();
        int[] expected = {5,10,15,20,25,30,35,40,45,50};
        int[] result = tabuada.gerarTabuada(5);

        assertEquals(10, result.length);
        assertArrayEquals(expected, result);
    }
}

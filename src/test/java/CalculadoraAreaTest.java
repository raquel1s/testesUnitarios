import org.example.CalculadoraArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraAreaTest {

    @Test
    public void areaQuadradoTest(){
        CalculadoraArea calculadoraArea = new CalculadoraArea();

        assertEquals(16, calculadoraArea.areaQuadrado(4), 0.01);
    }

    @Test
    public void areaRetanguloTest(){
        CalculadoraArea calculadoraArea = new CalculadoraArea();

        assertEquals(16, calculadoraArea.areaRetangulo(8,2), 0.01);
    }

    @Test
    public void areaCirculo(){
        CalculadoraArea calculadoraArea = new CalculadoraArea();

        assertEquals(50.24, calculadoraArea.areaCirculo(4), 0.01);
    }
}

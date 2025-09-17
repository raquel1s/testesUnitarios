import org.example.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraIMCTest {

    @Test
    public void calcularIMCTest(){
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        double imc = calculadoraIMC.calcularIMC(45.0, 1.53);

        assertEquals(19.22, imc, 0.01);
    }

    @Test
    public void calcularIMCZero(){
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();

        assertThrows(RuntimeException.class, () -> {
            calculadoraIMC.calcularIMC(75, 0);
        });
    }
}

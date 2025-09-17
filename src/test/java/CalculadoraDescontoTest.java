import org.example.CalculadoraDesconto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    public void aplicarDescontoTest(){
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        assertEquals(50, calculadoraDesconto.aplicarDesconto(100, 50), 0.01);
    }

    @Test
    public void aplicarDescontoTest2(){
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        assertEquals(100, calculadoraDesconto.aplicarDesconto(100, 0), 0.01);
    }

    @Test
    public void aplicarDescontoTest3(){
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        assertEquals(0, calculadoraDesconto.aplicarDesconto(100, 100), 0.01);
    }

    @Test
    public void aplicarDescontoTest4(){
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        assertThrows(RuntimeException.class, () -> calculadoraDesconto.aplicarDesconto(100, 105));
    }
}

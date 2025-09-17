import org.example.ConversorTemperatura;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorTemperaturaTest {

    @Test
    public void celsiusParaFahrenheitTest(){
        ConversorTemperatura c = new ConversorTemperatura();

        assertEquals("0°C deve ser 32°F", 32.0, c.celsiusParaFahrenheit(0), 0.001);
        assertEquals("-3°C deve ser 26.6°F", 26.6, c.celsiusParaFahrenheit(-3), 0.1);
    }

    @Test
    public void fahrenheitParaCelsiusTest(){
        ConversorTemperatura c = new ConversorTemperatura();

        assertEquals(0, c.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, c.fahrenheitParaCelsius(212), 0.001);
        assertEquals(37, c.fahrenheitParaCelsius(98.6), 0.1);
    }
}

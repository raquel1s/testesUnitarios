import org.example.ValidadorEmail;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidadorEmailTest {

    @Test
    public void validarTest(){
        ValidadorEmail validadorEmail = new ValidadorEmail();

        assertFalse(validadorEmail.validar("raquelgmail"));
    }

    @Test
    public void validarTest2(){
        ValidadorEmail validadorEmail = new ValidadorEmail();

        assertTrue(validadorEmail.validar("alguem@dominio.com"));
    }
}

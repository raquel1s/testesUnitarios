import org.example.ValidadorSenha;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidadorSenhaTest {

    @Test
    public void validarTest(){
        ValidadorSenha validadorSenha = new ValidadorSenha();

        assertTrue(validadorSenha.validar("Raquel23"));
    }

    @Test
    public void validarTest2(){
        ValidadorSenha validadorSenha = new ValidadorSenha();
        assertFalse(validadorSenha.validar("78965412"));
    }

    @Test
    public void validarTest3(){
        ValidadorSenha validadorSenha = new ValidadorSenha();
        assertFalse(validadorSenha.validar("45"));
    }
}

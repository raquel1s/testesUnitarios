import org.example.ContadorCaracteres;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContadorCaracteresTest {

    @Test
    public void contarTest1(){
        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();

        assertEquals(3 , contadorCaracteres.contar("A amizade consegue ser tão complexa. " +
                "Deixa uns desanimados, outros bem felizes. " +
                "É a alimentação dos fracos. É o reino dos fortes.", 'c'));
    }

    @Test
    public void contarTest2(){
        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();

        assertEquals(3 , contadorCaracteres.contar("", 'c'));
    }

    @Test
    public void contarTest3(){
        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();

        assertEquals(3 , contadorCaracteres.contar("Eu já dei risada até a barriga doer", ' '));
    }

    @Test
    public void contarTest4(){
        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();

        assertEquals(3 , contadorCaracteres.contar("Eu já dei risada até a barriga doer", 'e'));
    }
}

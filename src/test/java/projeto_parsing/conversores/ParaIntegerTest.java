package projeto_parsing.conversores;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParaIntegerTest {

    @Test
    public void test(){
        ParaInteger paraInteger = new ParaInteger();
        int resposta = paraInteger.ConverterParaInteger("1");
        int esperado = 1;
        assertEquals(resposta, esperado);
    }

}
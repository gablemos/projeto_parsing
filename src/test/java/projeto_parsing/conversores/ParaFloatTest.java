package projeto_parsing.conversores;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParaFloatTest {

    @Test
    public void test(){
        ParaFloat paraFloat = new ParaFloat();
        float resposta = paraFloat.ConverterParaFloat("200.14");
        float esperado = 200.14f;
        int delta = 0;
        assertEquals(resposta, esperado, delta);
    }

}
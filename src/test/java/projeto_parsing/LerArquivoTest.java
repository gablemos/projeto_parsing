package projeto_parsing;

import org.junit.Test;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LerArquivoTest {

    @Test
    public void testLeitura() throws IOException {
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        List<String> valorLido = la.mensagemLida(filePath,fileName);

        List<String> valorEsperado = Arrays.asList(
                "1",
                "16/12/2005 20:00:00",
                "John Howard",
                "58    158.20      10/11/1980  FC3E3444D   8",
                "63    200.14      06/04/1991  ABC123EFG   7",
                "20    314.74      02/02/2010  DAC942FFF   4");

        assertThat(valorEsperado, is(valorLido));
    }

}
package projeto_parsing;

import org.junit.Test;
import projeto_parsing.Configuracoes.Configuracao;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ParsingTest {

    @Test
    public void testeIdCabecalho() throws IOException {
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";
        LerArquivo lerArquivo = new LerArquivo(filePath, fileName);

        Parsing parsing = new Parsing(lerArquivo);

        int valorEsperado = 1;
        int valorRecebido = parsing.getCabecalho().getConfigId();
        assertEquals(valorEsperado, valorRecebido);

    }

    @Test
    public void testeDataCabecalho() throws IOException {
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";
        LerArquivo lerArquivo = new LerArquivo(filePath, fileName);

        Parsing parsing = new Parsing(lerArquivo);

        LocalDateTime valorEsperado = LocalDateTime.of(2005, 12, 16, 20, 0, 0);
        LocalDateTime valorRecebido = parsing.getCabecalho().getDataHoraArquivo();
        assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void testeUsuarioCabecalho() throws IOException {
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";
        LerArquivo lerArquivo = new LerArquivo(filePath, fileName);

        Parsing parsing = new Parsing(lerArquivo);

        String valorEsperado = "John Howard";
        String valorRecebido = parsing.getCabecalho().getUsuarioArquivo();
        assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void testeCorpo() throws IOException {
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";
        LerArquivo lerArquivo = new LerArquivo(filePath, fileName);

        Parsing parsing = new Parsing(lerArquivo);

        for (Configuracao config : parsing.getCorpo()){
            System.out.println(config);
        }



    }
}
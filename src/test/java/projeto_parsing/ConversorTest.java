package projeto_parsing;

import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ConversorTest {

    @Test
    public void testeConverterParaInteger() throws IOException {


        Conversor conversor = new Conversor();

        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";
        LerArquivo la = new LerArquivo(filePath, fileName);

        String valorParaConverter = la.getLinhasLidas().get(0);

        int valorEsperado = 1;
        int valorLido = conversor.ConverterParaInteger(valorParaConverter);

        assertEquals(valorLido, valorEsperado);
    }

    @Test
    public void testeConverterParaFloat(){
        Conversor conversor = new Conversor();

        String valorParaConverter = "158.20";

        float valorEsperado = 158.20f;
        float valorLido = conversor.ConverterParaFloat(valorParaConverter);

        assertEquals(valorLido, valorEsperado, 0);
    }

    @Test
    public void testeConverterParaByte(){
        Conversor conversor = new Conversor();

        String valorParaConverter = "1";

        byte valorEsperado = 1;
        byte valorLido = conversor.ConverterParaByte(valorParaConverter);

        assertEquals(valorLido, valorEsperado);
    }

    @Test
    public void testeConverterParaDate(){
        Conversor conversor = new Conversor();

        String valorParaConverter = "10/11/1980";

        LocalDate valorEsperado = LocalDate.of(1980, 11, 10);
        LocalDate valorLido = conversor.ConverterParaData(valorParaConverter);

        assertEquals(valorLido, valorEsperado);
    }

    @Test
    public void testeConverterParaDateTime(){
        Conversor conversor = new Conversor();

        String valorParaConverter = "16/12/2005 20:00:00";

        LocalDateTime valorEsperado = LocalDateTime.of(2005, 12, 16, 20, 0, 0);
        LocalDateTime valorLido = conversor.ConverterParaDataHora(valorParaConverter);

        assertEquals(valorLido, valorEsperado);
    }



}
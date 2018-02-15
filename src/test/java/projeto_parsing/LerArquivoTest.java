package projeto_parsing;

import org.junit.Test;

import static org.junit.Assert.*;

public class LerArquivoTest {

    @Test
    public void testLeituraLinha1(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("1"), 0);
    }

    @Test
    public void testLeituraLinha2(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("16/12/2005 20:00:00"), 1);
    }

    @Test
    public void testLeituraLinha3(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("John Howard"), 2);
    }

    @Test
    public void testLeituraLinha4(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("58    158.20      10/11/1980  FC3E3444D   8"), 3);
    }

    @Test
    public void testLeituraLinha5(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("63    200.14      06/04/1991  ABC123EFG   7"), 4);
    }

    @Test
    public void testLeituraLinha6(){
        LerArquivo la = new LerArquivo();
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste.txt";

        assertEquals(la.mensagemLida(filePath,fileName).indexOf("20    314.74      02/02/2010  DAC942FFF   4"), 5);
    }

}
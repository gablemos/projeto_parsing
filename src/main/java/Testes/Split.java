package Testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split {
    public static void main(String[] args) {
        String mensagem = "58    158.20      10/11/1980  FC3E3444D   8";
        String[] mensagemSplitada = mensagem.split("\t");
        for (String s : mensagemSplitada){
            System.out.println(s);
        }

        List<String> mensagens  = Arrays.asList(
                "58    158.20      10/11/1980  FC3E3444D   8",
                "63    200.14      06/04/1991  ABC123EFG   7",
                "20    314.74      02/02/2010  DAC942FFF   4");

        for (String s : mensagens){
            String[] mensagensSplitadas = s.split("\t");
            for (String st : mensagensSplitadas){
                System.out.println(s);
            }
        }
    }
}

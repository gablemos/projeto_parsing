package Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Curso {

    public static void main(String[] args) throws ParseException {
        String dataRecebida = "23/11/2015";
        /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataRecebida);
        System.out.println(dataRecebida);
        System.out.println(dataFormatada);
        System.out.println(formato.format(dataFormatada));*/


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data = LocalDate.parse(dataRecebida, formato);

        System.out.println(data);
    }

}

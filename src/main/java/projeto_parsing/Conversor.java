package projeto_parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {

    public Byte ConverterParaByte(final String valorParaSerConvertido) throws NumberFormatException{
        return Byte.parseByte(valorParaSerConvertido);
    }

    public Float ConverterParaFloat(final String valorParaSerConvertido) throws NumberFormatException{
        return Float.parseFloat(valorParaSerConvertido);
    }

    public Integer ConverterParaInteger(final String valorParaSerConvertido) throws NumberFormatException{
        return Integer.parseInt(valorParaSerConvertido);
    }

    public LocalDate ConverterParaData(final String valorParaSerConvertido) throws NumberFormatException{
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(valorParaSerConvertido, formato);
    }

    public LocalDateTime ConverterParaDataHora(final String valorParaSerConvertido) throws NumberFormatException{
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:s");
        return LocalDateTime.parse(valorParaSerConvertido, formato);
    }
}

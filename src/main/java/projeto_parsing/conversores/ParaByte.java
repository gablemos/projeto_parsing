package projeto_parsing.conversores;

public class ParaByte {

    public Byte ConverterParaInteger(final String valorParaSerConvertido) throws NumberFormatException{
        return Byte.parseByte(valorParaSerConvertido);
    }
}

package projeto_parsing.Configuracoes;

import java.time.LocalDate;

public class Config1 extends Configuracao{

    private final int colunaUm;
    private final float colunaDois;
    private final LocalDate colunaTres;
    private final String colunaQuatro;
    private final int colunaCinco;

    public Config1(String[] coluna){
        this.colunaUm = conversor.ConverterParaInteger(coluna[0]);
        this.colunaDois = conversor.ConverterParaFloat(coluna[1]);
        this.colunaTres = conversor.ConverterParaData(coluna[2]);
        this.colunaQuatro = coluna[3];
        this.colunaCinco = conversor.ConverterParaInteger(coluna[4]);
    }

    public int getColunaUm() {
        return colunaUm;
    }

    public float getColunaDois() {
        return colunaDois;
    }

    public LocalDate getColunaTres() {
        return colunaTres;
    }

    public String getColunaQuatro() {
        return colunaQuatro;
    }

    public int getColunaCinco() {
        return colunaCinco;
    }

    @Override
    public String toString() {
        return colunaUm
                + "\t" + colunaDois
                + "\t" + colunaTres
                + "\t" + colunaQuatro
                + "\t" + colunaCinco;
    }
}

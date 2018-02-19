package projeto_parsing.Configuracoes;

public class Config2 extends Configuracao {

    private final int colunaUm;
    private final float colunaDois;

    public Config2(String[] coluna){
        this.colunaUm = conversor.ConverterParaInteger(coluna[0]);
        this.colunaDois = conversor.ConverterParaFloat(coluna[1]);
    }

    public int getColunaUm() {
        return colunaUm;
    }

    public float getColunaDois() {
        return colunaDois;
    }

    @Override
    public String toString() {
        return colunaUm
                + "\t" + colunaDois;
    }
}

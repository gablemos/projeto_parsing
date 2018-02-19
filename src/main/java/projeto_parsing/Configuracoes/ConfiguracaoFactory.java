package projeto_parsing.Configuracoes;

public class ConfiguracaoFactory {

    public Configuracao configuracao(final int configId, final String[] colunas){
        if (configId == 1) {
            return new Config1(colunas);
        } else if (configId == 2){
            return new Config2(colunas);
        } else {
            return null;
        }
    }
}

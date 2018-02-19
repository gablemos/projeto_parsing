package projeto_parsing;

import projeto_parsing.Configuracoes.Configuracao;
import projeto_parsing.Configuracoes.ConfiguracaoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parsing {

    private final LerArquivo arquivoLido;
    private final Cabecalho cabecalho;
    private final List<Configuracao> corpo;
    private final ConfiguracaoFactory configuracaoFactory;


    public Parsing(final LerArquivo arquivoLido){
        this.arquivoLido = arquivoLido;
        this.cabecalho = setCabecalho();
        this.configuracaoFactory = new ConfiguracaoFactory();
        this.corpo = setCorpo();

    }

    private Cabecalho setCabecalho(){
        List<String> cabecalhoArquivo = arquivoLido.getLinhasLidas().subList(0,3);
        return new Cabecalho(cabecalhoArquivo);
    }

    private List<Configuracao> setCorpo(){
        List<Configuracao> holder = new ArrayList<>();
        List<String> corpoAquivo = arquivoLido.getLinhasLidas().subList(3, arquivoLido.getLinhasLidas().size());
        for(String linha : corpoAquivo){
            String[] colunas  = linha.split("\\s+");
            holder.add(configuracaoFactory.configuracao(cabecalho.getConfigId(), colunas));
        }
        return holder;
    }

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public List<Configuracao> getCorpo(){
        return Collections.unmodifiableList(corpo);
    }
}

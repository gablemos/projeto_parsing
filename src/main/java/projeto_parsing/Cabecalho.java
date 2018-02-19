package projeto_parsing;


import java.time.LocalDateTime;
import java.util.List;

public class Cabecalho {
    private final int configId;
    private final LocalDateTime dataHoraArquivo;
    private final String usuarioArquivo;

    public Cabecalho(List<String> arquivoCabecalho){
        Conversor conversor = new Conversor();
        this.configId = conversor.ConverterParaInteger(arquivoCabecalho.get(0));
        this.dataHoraArquivo = conversor.ConverterParaDataHora(arquivoCabecalho.get(1));
        this.usuarioArquivo = arquivoCabecalho.get(2);

    }

    public int getConfigId() {
        return configId;
    }

    public LocalDateTime getDataHoraArquivo() {
        return dataHoraArquivo;
    }

    public String getUsuarioArquivo() {
        return usuarioArquivo;
    }

    @Override
    public String toString() {
        return configId +
                "\n" + dataHoraArquivo +
                "\n" + usuarioArquivo;
    }
}

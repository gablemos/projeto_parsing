package projeto_parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LerArquivo {
    private List<String> linhasLidas;

    public LerArquivo(){
        this.linhasLidas = new ArrayList<>();
    }

    public List<String> mensagemLida(final String filePath, final String fileName) throws IOException {
        Path caminho = Paths.get(filePath.concat(fileName));
        Stream<String> linhas = Files.lines(caminho);
        linhas.forEach(linhasLidas::add);
        return Collections.unmodifiableList(linhasLidas);
    }
}

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
    private final List<String> linhasLidas;

    public LerArquivo(final String filePath, final String fileName){
        this.linhasLidas = new ArrayList<>();
        Path caminho = Paths.get(filePath.concat(fileName));
        Stream<String> linhas = null;
        try {
            linhas = Files.lines(caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
        linhas.forEach(linhasLidas::add);
    }

    public List<String> getLinhasLidas() {
        return Collections.unmodifiableList(linhasLidas);
    }
}

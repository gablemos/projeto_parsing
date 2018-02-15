package projeto_parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LerArquivo {
    private List<String> linhasLidas;

    public LerArquivo(){
        this.linhasLidas = new ArrayList<>();
    }

    public List<String> mensagemLida(final String filePath, final String fileName){
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath.concat(fileName)))) {

            //br returns as stream and convert it into a List
            linhasLidas = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return linhasLidas;
        }
    }
}

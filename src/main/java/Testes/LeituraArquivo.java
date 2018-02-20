package Testes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LeituraArquivo {
    public static void main(String[] args) throws IOException {

        List<String> linhasArquivo = new ArrayList<>();
        Path caminho = Paths.get("C:\\teste.txt");
        Stream<String> linhas = Files.lines(caminho);
        linhas.forEach(linhasArquivo::add);
        //linhasArquivo.forEach(System.out::println);
    }
}

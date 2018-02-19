import projeto_parsing.LerArquivo;
import projeto_parsing.Parsing;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Focusnetworks\\Documents\\GitHub\\projeto_parsing\\";
        String fileName = "teste2.txt";

        LerArquivo lerArquivo = new LerArquivo(filePath, fileName);

        Parsing parsing = new Parsing(lerArquivo);

        System.out.println(parsing.getCabecalho());

        for (Object o : parsing.getCorpo()){
            System.out.println(o);
        }
    }
}

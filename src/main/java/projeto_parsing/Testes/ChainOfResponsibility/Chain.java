package projeto_parsing.Testes.ChainOfResponsibility;

public interface Chain {

    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}

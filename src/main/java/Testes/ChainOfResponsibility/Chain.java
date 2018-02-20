package Testes.ChainOfResponsibility;

public interface Chain {

    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}

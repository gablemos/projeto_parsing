package projeto_parsing.Testes.ChainOfResponsibility;

public class DemoChain {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc4.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2, "mult");
        chainCalc1.calculate(request);
    }
}

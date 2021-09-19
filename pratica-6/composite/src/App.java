public class App {
    public static void main(String[] args) throws Exception {
        ExpressaoAritmetica a = new NumericOperand(0);
        System.out.println("A) " + a.getResultado());
        System.out.println();
        
        System.out.println("B) 1 + 2 =");
        ExpressaoAritmetica b = new Operacao(new NumericOperand(1), Operacao.Operations.ADD, new NumericOperand(2));
        System.out.println("B) " + b.getResultado());
        System.out.println();
        
        System.out.println("C) 1 * (2 + 3) =");
        ExpressaoAritmetica cInterm = new Operacao(new NumericOperand(2), Operacao.Operations.ADD, new NumericOperand(3));
        ExpressaoAritmetica c = new Operacao(new NumericOperand(1), Operacao.Operations.MUL, cInterm);
        System.out.println("C) " + c.getResultado());
        System.out.println();
        
        
        
        System.out.println("D) (2 * 3) + (4 / (5 - 3)) =");
        // interm1 = 2 * 3
        ExpressaoAritmetica dInterm1 = new Operacao(new NumericOperand(2), Operacao.Operations.MUL, new NumericOperand(3));
        // interm2 = 5 - 3
        ExpressaoAritmetica dInterm2 = new Operacao(new NumericOperand(5), Operacao.Operations.SUB, new NumericOperand(3));
        // interm3 = 4/(5 - 3)
        ExpressaoAritmetica dInterm3 = new Operacao(new NumericOperand(4), Operacao.Operations.DIV, dInterm2);
        // d = (2*3) + (4/(5 - 3))
        ExpressaoAritmetica d = new Operacao(dInterm1, Operacao.Operations.ADD, dInterm3);
        System.out.println("D) " + d.getResultado());
        System.out.println();
    }
}

public class Operacao extends ExpressaoAritmetica {
    public enum Operations {
        ADD, SUB, MUL, DIV
    }

    private ExpressaoAritmetica op1;
    private ExpressaoAritmetica op2;
    private Operations operation;

    public Operacao(ExpressaoAritmetica op1, Operations operation, ExpressaoAritmetica op2){
        this.op1 = op1;
        this.op2 = op2;
        this.operation = operation;
    }

    public double getResultado(){
        switch (operation) {
            case ADD:
                return op1.getResultado() + op2.getResultado();
            case SUB:
                return op1.getResultado() - op2.getResultado();
            case MUL:
                return op1.getResultado() * op2.getResultado();
            case DIV:
                return op1.getResultado() / op2.getResultado();
            default:
                return 0;
        }
    }
}

public class NumericOperand extends ExpressaoAritmetica{
    private double value;

    public NumericOperand(double value){
        this.value = value;
    }

    public double getResultado() {
        return value;
    }
}

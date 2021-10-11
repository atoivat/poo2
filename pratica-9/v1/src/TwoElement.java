public class TwoElement implements NumberElement {
    int a, b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}

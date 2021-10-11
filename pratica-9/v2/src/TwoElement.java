public class TwoElement implements NumberElement {
    int a, b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }

    public int totalSum() {
        int sum = a + b;
        System.out.println("Adding " + a + "+" + b + "=" + sum + " to total");
        return sum;
    }
}

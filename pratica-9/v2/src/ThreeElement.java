public class ThreeElement implements NumberElement {
    int a, b, c;

    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void sum() {
        int sum = a + b + c;
        System.out.println(a + "+" + b + "+" + c + "=" + sum);
    }

    public int totalSum(){
        int sum = a + b + c;
        System.out.println("Adding " + a + "+" + b + "+" + c + "=" + sum + " to total");
        return sum;
    }
}

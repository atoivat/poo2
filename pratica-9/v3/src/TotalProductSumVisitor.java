import java.util.List;

public class TotalProductSumVisitor implements NumberVisitor {
    int totalProductSum = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int product = twoElement.a * twoElement.b;
        System.out.println("Adding " + twoElement.a + "*" + twoElement.b + "=" + product + " to total");
        totalProductSum += product;
    }
    
    @Override
    public void visit(ThreeElement threeElement) {
        int product = threeElement.a * threeElement.b * threeElement.c;
        System.out.println("Adding " + threeElement.a + "*" + threeElement.b + "*" + threeElement.c + "=" + product + " to total");
        totalProductSum += product;
    }
    
    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement numberElement: elementList){
            numberElement.accept(this);
        }
    }

    public int getTotalProductSum() {
        return totalProductSum;
    }

}

import java.util.ArrayList;
import java.util.List;

public class NumberElementList implements NumberElement {
    private List<NumberElement> list = new ArrayList<NumberElement>();

    public void add(NumberElement numberElement){
        list.add(numberElement);
    }

    public void sum() {
        for (NumberElement numberElement: list) {
            numberElement.sum();
        }
    }
    
    public int totalSum(){
        int totalSum = 0;
        for (NumberElement numberElement: list) {
            totalSum += numberElement.totalSum();
        }
        return totalSum;
    }
}

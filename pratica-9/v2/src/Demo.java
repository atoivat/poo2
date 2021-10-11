public class Demo {
    public static void main(String[] args) throws Exception {
        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);

        NumberElementList numberElements = new NumberElementList();
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);
        
        System.out.println("Visiting element list to get individual sums");
        numberElements.sum();
        
        System.out.println("\nVisiting element list to get total sum");
        System.out.println("Total sum:" + numberElements.totalSum());
    }
}

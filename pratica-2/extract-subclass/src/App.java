public class App {
    public static void main(String[] args) throws Exception {
        // Somewhere in client code
        Employee kent = new Employee(50);
        JobItem j1 = new JobItem(5, 0, true, kent);
        JobItem j2 = new JobItem(15, 10, false, null);
        int total = j1.getTotalPrice() + j2.getTotalPrice();
        
        System.out.println(total);
    }
}

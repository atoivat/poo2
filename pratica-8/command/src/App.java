public class App {
    public static void main(String[] args) throws Exception {
        DocumentInvoker instance = new DocumentInvoker();
        instance.Write("This is the original text.");
        
        instance.Write(" Here is some other text.");
        System.out.println(instance.Read());
        System.out.println();

        
        instance.Undo(1);
        System.out.println(instance.Read());
        System.out.println();
        
        
        instance.Redo(1);
        System.out.println(instance.Read());
        System.out.println();
        
        
        instance.Write(" And a little more text.");
        System.out.println(instance.Read());
        instance.Undo(2);
        System.out.println(instance.Read());
        instance.Redo(2);
        System.out.println(instance.Read());
        instance.Undo(1);
        System.out.println(instance.Read());
    }
}

import java.util.ArrayList;

public class DocumentInvoker {
    private ArrayList<Command> _commands = new ArrayList<Command>();
    private Document _doc = new Document();

    public void Redo(int level) {
        System.out.println("---- Redo " + level + " level");
        _commands.get(level).Redo();
    }
    
    public void Undo(int level) {
        System.out.println("---- Undo " + level + " level");
        _commands.get(level).Undo();
    }


    public void Write(String text) {
        DocumentEditCommand cmd = new DocumentEditCommand(_doc, text);
        _commands.add(cmd);
    }

    public String Read() {
        return _doc.ReadDocument();
    }
}

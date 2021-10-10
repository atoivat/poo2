public class DocumentEditCommand extends Command {
    private Document _editableDoc;
    private String _text;

    public DocumentEditCommand(Document doc, String text) {
        _editableDoc = doc;
        _text = text;
        _editableDoc.Write(_text);
    }

    public void Redo(){
        _editableDoc.Write(_text);
    }

    public void Undo(){
        _editableDoc.Erase(_text);
    }
    
}

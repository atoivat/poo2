import java.util.ArrayList;

public class Document {
    private ArrayList<String> _textArray = new ArrayList<String>();

    public void Write(String text){
        _textArray.add(text);
    }
    
    public void Erase(String text){
        _textArray.remove(text);
    }
    
    public void Erase(int textLevel){
        _textArray.remove(textLevel);
    }

    public String ReadDocument(){
        String returnString = "";
        for(String txt: _textArray){
            returnString += txt;
        }
        return returnString;
    }
}

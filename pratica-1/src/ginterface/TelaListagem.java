package ginterface;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import domain.Material;

public class TelaListagem extends TelaBase {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public TelaListagem() {
        super("Listagem");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        textArea = new JTextArea(50, 50);
        textArea.setBounds(10, 70, 580, 220);
        contentPane.add(textArea);
        textArea.setColumns(10);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 70, 580, 190);

        contentPane.add(scrollPane);
    }

    public void setDisplay(List<Material> listagem) {
        textArea.setEditable(true);
        String displayString = "";
        for(Material item: listagem){
            displayString += item + "\n";
        }
        textArea.setText(displayString);
        textArea.setEditable(false);
    }
}

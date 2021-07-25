package ginterface;

import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JTextArea;

import domain.Livro;
import domain.Material;
import domain.Revista;

public class TelaListagem extends TelaBase {
    private JTextArea textArea;

    public TelaListagem(List<Material> listagem) {
        super("Listagem");

        textArea= new JTextArea();
		textArea.setBounds(10, 70, 580, 220);
		contentPane.add(textArea);
		textArea.setColumns(10);
        textArea.setEditable(false);

        String displayString = "";
        for(Material item: listagem){
            displayString += item + "\n";
        }
        textArea.setText(displayString);
    }

    public static void main(String[] args) {
        LinkedList<Material> listTestes = new LinkedList<Material>();

        listTestes.add(new Material("teste-titulo", 2012));
        listTestes.add(new Livro("teste-titulo", "teste-autor", 2009));
        listTestes.add(new Revista("teste-titulo", "teste-org", 1, 1, 2001));

        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagem frame = new TelaListagem(listTestes);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}

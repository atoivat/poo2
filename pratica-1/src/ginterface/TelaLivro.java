package ginterface;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import domain.Livro;
import domain.Material;


public class TelaLivro extends TelaIncluirBase {
    public TelaLivro(List<Material> list) {
        super("Livros", "Revistas", "Titulo", "Autor", "Ano");

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String titulo = firstTextField.getText();
				String autor = secondTextField.getText();
				String ano = thirdTextField.getText();
				try{
					Livro l = new Livro(titulo, autor, ano);
					list.add(l);

					successPanel("Livro adicionado com sucesso!");

					firstTextField.setText("");
					secondTextField.setText("");
					thirdTextField.setText("");
				} catch (Exception exc) {
					errorPanel(exc.getMessage());
				}
			}
		});
    }
}

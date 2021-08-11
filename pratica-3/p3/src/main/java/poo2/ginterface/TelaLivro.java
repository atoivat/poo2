package poo2.ginterface;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import poo2.entity.Livro;
import poo2.repository.LivroRepository;


public class TelaLivro extends TelaIncluirBase {
    private LivroRepository livroRepository;

    public TelaLivro(LivroRepository livroRepository) {
        super("Livros", "Revistas", "Titulo", "Autor", "Ano");
        this.livroRepository = livroRepository;

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String titulo = firstTextField.getText();
                String autor = secondTextField.getText();
                String ano = thirdTextField.getText();
                try{
                    Livro l = new Livro(titulo, autor, ano);
                    livroRepository.save(l);

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

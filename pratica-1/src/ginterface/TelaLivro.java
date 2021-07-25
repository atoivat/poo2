package ginterface;

import java.awt.EventQueue;

public class TelaLivro extends TelaIncluirBase {
    public TelaLivro() {
        super("Livros", "Revistas", "Titulo", "Autor", "Ano");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLivro frame = new TelaLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}

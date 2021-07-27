import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import domain.Material;
import ginterface.TelaListagem;
import ginterface.TelaLivro;
import ginterface.TelaRevista;

public class App {
    private LinkedList<Material> list = new LinkedList<Material>();
    private TelaLivro iLivro = new TelaLivro(list);
    private TelaRevista iRevista = new TelaRevista(list);
    private TelaListagem iListagem = new TelaListagem();

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.iLivro.setVisible(true);
        app.iLivro.getToggleButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.iLivro.setVisible(false);
                app.iRevista.setVisible(true);
            }
        });
        app.iRevista.getToggleButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.iRevista.setVisible(false);
                app.iLivro.setVisible(true);
            }
        });
        
        ActionListener listagemActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.iListagem.setDisplay(app.list);
                app.iListagem.setVisible(true);
                app.iListagem.repaint();
            }
        };

        app.iRevista.getListButton().addActionListener(listagemActionListener);
        app.iLivro.getListButton().addActionListener(listagemActionListener);
    }
}

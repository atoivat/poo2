package poo2;

import java.util.LinkedList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import poo2.entity.Material;
import poo2.ginterface.TelaListagem;
import poo2.ginterface.TelaLivro;
import poo2.ginterface.TelaRevista;
import poo2.repository.LivroRepository;
import poo2.repository.RevistaRepository;

public class App {
    private EntityManagerFactory entityManagerFactoryLivro = Persistence.createEntityManagerFactory("Livro");
    private EntityManager entityManagerLivro = entityManagerFactoryLivro.createEntityManager();
    
    private EntityManagerFactory entityManagerFactoryRevista = Persistence.createEntityManagerFactory("Revista");
    private EntityManager entityManagerRevista = entityManagerFactoryRevista.createEntityManager();

    private LivroRepository livroRepository = new LivroRepository(entityManagerLivro);
    private RevistaRepository revistaRepository = new RevistaRepository(entityManagerRevista);


    private TelaLivro iLivro = new TelaLivro(livroRepository);
    private TelaRevista iRevista = new TelaRevista(revistaRepository);
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
                LinkedList<Material> list = new LinkedList<Material>();
                list.addAll(app.livroRepository.findAll());
                list.addAll(app.revistaRepository.findAll());
                app.iListagem.setDisplay(list);
                app.iListagem.setVisible(true);
                app.iListagem.repaint();
            }
        };

        app.iRevista.getListButton().addActionListener(listagemActionListener);
        app.iLivro.getListButton().addActionListener(listagemActionListener);
    }
}
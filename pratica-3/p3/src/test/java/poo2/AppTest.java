package poo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import poo2.entity.Livro;
import poo2.entity.Revista;
import poo2.repository.LivroRepository;
import poo2.repository.RevistaRepository;


public class AppTest 
{
    @Test
    public void consegueInstanciarOApp()
    {
        assertNotNull(new App());
    }
    
    @Test
    public void consegueSalvarERecuperarLivro()
    {
        EntityManagerFactory entityManagerFactoryLivro = Persistence.createEntityManagerFactory("Livro");
        EntityManager entityManagerLivro = entityManagerFactoryLivro.createEntityManager();

        LivroRepository livroRepository = new LivroRepository(entityManagerLivro);

        Livro l = new Livro("Teste", "teste", "2012");
        livroRepository.save(l);

        Optional<Livro> l2 = livroRepository.findById(l.getId());
        assertNotNull(l2);
        assertEquals(l, l2.get());
    }
    
    @Test
    public void consegueSalvarERecuperarRevista()
    {
        EntityManagerFactory entityManagerFactoryRevista = Persistence.createEntityManagerFactory("Revista");
        EntityManager entityManagerRevista = entityManagerFactoryRevista.createEntityManager();
    
        RevistaRepository revistaRepository = new RevistaRepository(entityManagerRevista);
    
        Revista r = new Revista("Teste", "1", "1", "1", "2012");
        revistaRepository.save(r);
    
        Optional<Revista> r2 = revistaRepository.findById(r.getId());
        assertNotNull(r2);
        assertEquals(r, r2.get());
    }
}

package poo2.repository;

import poo2.entity.Livro;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

public class LivroRepository {
    private EntityManager entityManager;
    
    public LivroRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Optional<Livro> save(Livro livro){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(livro);
            entityManager.getTransaction().commit();
            return Optional.of(livro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Livro> findAll() {
        return entityManager.createQuery("from Livro").getResultList();
    }

    public Optional<Livro> findById(Integer id) {
        Livro livro = entityManager.find(Livro.class, id);
        return livro != null ? Optional.of(livro) : Optional.empty();
    }
}

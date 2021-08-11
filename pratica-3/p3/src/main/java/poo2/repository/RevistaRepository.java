package poo2.repository;

import poo2.entity.Revista;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

public class RevistaRepository {
    private EntityManager entityManager;
    
    public RevistaRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Optional<Revista> save(Revista revista){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(revista);
            entityManager.getTransaction().commit();
            return Optional.of(revista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Revista> findAll() {
        return entityManager.createQuery("from Revista").getResultList();
    }

    public Optional<Revista> findById(Integer id) {
        Revista revista = entityManager.find(Revista.class, id);
        return revista != null ? Optional.of(revista) : Optional.empty();
    }
}

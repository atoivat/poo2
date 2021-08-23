package poo2.repository;

import poo2.entity.Game;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;


public class GameRepository {
    private EntityManager entityManager;
    
    public GameRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Optional<Game> save(Game game){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(game);
            entityManager.getTransaction().commit();
            return Optional.of(game);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Game> findAll() {
        return entityManager.createQuery("from Game").getResultList();
    }

    public Optional<Game> findByKey(String game_key) {
        Game game = entityManager.find(Game.class, game_key);
        return game != null ? Optional.of(game) : Optional.empty();
    }
}

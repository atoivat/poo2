package poo2;

import java.util.LinkedList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import poo2.entity.Game;
import poo2.repository.GameRepository;

public class App {
    private EntityManagerFactory entityManagerFactoryGame = Persistence.createEntityManagerFactory("Game");
    private EntityManager entityManagerGame = entityManagerFactoryGame.createEntityManager();

    private GameRepository gameRepository = new GameRepository(entityManagerGame);

    public static void main(String[] args) throws Exception {
        App app = new App();

        // Game game = new Game("ABCD", "XX-O-----", 1);
        // app.gameRepository.save(game);
        // Game game2 = new Game("ABCE", "--XX-O---", 0);
        // app.gameRepository.save(game2);
        
        // LinkedList<Game> games = new LinkedList<Game>();
        // games.addAll(app.gameRepository.findAll());

        // for(Game g: games){
        //     System.out.println(g);
        // }
        
        System.out.println(app.gameRepository.findByKey("ABC"));
        System.out.println(app.gameRepository.findByKey("ABCD"));
        System.out.println(app.gameRepository.findByKey("ABCE"));
        System.out.println(app.gameRepository.findByKey("teste"));
    }
}
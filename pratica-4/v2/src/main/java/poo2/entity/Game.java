package poo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="game")
public class Game {
    @Id
    @Column(name="game_key")
    private String game_key;
    
    @Column(name="state")
    private String state;
    
    @Column(name="current_player")
    private int current_player;

    public Game(String game_key, String state, int current_player){
        this.game_key = game_key;
        this.state = state;
        this.current_player = current_player;
    }

    public Game(){}

    public String getKey() {
        return game_key;
    }

    public void setKey(String game_key) {
        this.game_key = game_key;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCurrent_player() {
        return current_player;
    }

    public void setCurrent_player(int current_player) {
        this.current_player = current_player;
    }

    @Override
    public String toString() {
        return "Game [current_player=" + current_player + ", game_key=" + game_key + ", state=" + state + "]";
    }
}

package poo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="livro")
public class Livro extends Material{
    @Column(name = "autor")
    private String autor;

    public Livro(String titulo, String autor, String ano) throws IllegalArgumentException {
        super(titulo, ano);
        setAutor(autor);
    }

    public Livro(){}
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = validateString(autor, "autor");
    }

    public String toString() {
        return "Livro [titulo=" + this.getTitulo() + ", autor=" + autor + ", ano=" + this.getAno() + "]";
    }
}

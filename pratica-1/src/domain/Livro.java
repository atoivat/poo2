package domain;

public class Livro extends Material{
    private String autor;

    public Livro(String titulo, String autor, String ano) throws IllegalArgumentException {
        super(titulo, ano);
        setAutor(autor);
    }
    
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

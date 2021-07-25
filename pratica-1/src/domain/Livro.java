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
        if(autor == null || autor.isBlank()){
            throw new IllegalArgumentException("Argumento inválido 'autor'");
        }
        this.autor = autor;
    }

    public String toString() {
        return "Livro [titulo=" + this.getTitulo() + ", autor=" + autor + ", ano=" + this.getAno() + "]";
    }

    public static void main(String[] args) {
        // Testes básicos de exceptions
        try {
            new Livro("teste", "", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Livro("", "teste", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Livro("teste", "    ", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Livro("teste", "teste", "");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        Livro b = new Livro("teste", "teste", "2012");
        System.out.println("SUCCESS: " + b);
    }   
}

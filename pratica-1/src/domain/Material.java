package domain;

public class Material {
    private String titulo;
    private int ano;

    public Material(String titulo, String ano) throws IllegalArgumentException {
        setTitulo(titulo);
        setAno(ano);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Argumento inválido 'titulo'");
        }
        this.titulo = titulo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(String ano) {
        int intAno;
        try{
            intAno = Integer.parseInt(ano);
        } catch(Exception e) {
            throw new IllegalArgumentException("Argumento inválido 'ano'");
        }
        if(intAno <= 0) {
            throw new IllegalArgumentException("Argumento inválido 'ano'");
        }
        this.ano = intAno;
    }

    public String toString() {
        return "Material [titulo=" + titulo + ", ano=" + ano + "]";
    }
    
    public static void main(String[] args) {
        // Testes básicos de exceptions
        try {
            new Material("", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        try {
            new Material("    ", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Material(null, "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Material("teste", "");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        Material m = new Material("teste", "2012");
        System.out.println("SUCCESS: " + m);
    }
}

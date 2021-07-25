package domain;

public class Material {
    private String titulo;
    private int ano;

    public Material(String titulo, int ano) throws IllegalArgumentException {
        setTitulo(titulo);
        setAno(ano);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Invalid argument 'titulo'");
        }
        this.titulo = titulo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        if(ano <= 0) {
            throw new IllegalArgumentException("Invalid argument 'ano'");
        }
        this.ano = ano;
    }

    public String toString() {
        return "Material [titulo=" + titulo + ", ano=" + ano + "]";
    }
    
    public static void main(String[] args) {
        try {
            Material m = new Material("", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        try {
            Material m = new Material("    ", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Material m = new Material(null, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Material m = new Material("teste", 0);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        Material m = new Material("teste", 2012);
        System.out.println("SUCCESS: " + m);
    }
}

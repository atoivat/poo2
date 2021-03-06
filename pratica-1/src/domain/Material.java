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
        this.titulo = validateString(titulo, "título");
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(String ano) {
        this.ano = validadeInteger(ano, "ano");
    }

    public String toString() {
        return "Material [titulo=" + titulo + ", ano=" + ano + "]";
    }

    public static int validadeInteger(String integerString, String attrName) throws IllegalArgumentException {
        int integer;
        try{
            integer = Integer.parseInt(integerString);
        } catch(Exception e) {
            throw new IllegalArgumentException("Argumento inválido '" + attrName + "'");
        }
        if(integer <= 0) {
            throw new IllegalArgumentException("Argumento inválido '" + attrName + "'");
        }
        return integer;
    }

    public static String validateString(String toValidade, String attrName) throws IllegalArgumentException {
        if(toValidade == null || toValidade.isBlank()) {
            throw new IllegalArgumentException("Argumento inválido '" + attrName + "'");
        }
        return toValidade.strip();
    }
}

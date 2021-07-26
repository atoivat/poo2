package domain;

public class Revista extends Material{
    private String org;
    private int vol;
    private int nro;

    public Revista(String titulo, String org, String vol, String nro, String ano) throws IllegalArgumentException {
        super(titulo, ano);
        setOrg(org);
        setVol(vol);
        setNro(nro);
    }
    
    public String getOrg() {
        return org;
    }
    
    public void setOrg(String org) {
        this.org = validateString(org, "org");
    }

    public int getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = validadeInteger(vol, "vol");
    }

    public int getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = validadeInteger(nro, "nro");
    }

    public String toString() {
        return "Revista [titulo=" + this.getTitulo() + ", org=" + org + ", nro=" + nro + ", vol=" + vol + ", ano=" + this.getAno() + "]";
    }

    public static void main(String[] args) {
        // Testes básicos de exceptions
        try {
            new Revista("titulo", " ", "1", "1", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Revista("titulo", "org", "", "1", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Revista("titulo", "org", "1", "", "2012");
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        Revista b = new Revista("titulo", "org", "1", "1", "2012");
        System.out.println("SUCCESS: " + b);
    }   
}

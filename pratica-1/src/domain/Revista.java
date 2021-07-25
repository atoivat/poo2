package domain;

public class Revista extends Material{
    private String org;
    private int vol;
    private int nro;

    public Revista(String titulo, String org, int vol, int nro, int ano) throws IllegalArgumentException {
        super(titulo, ano);
        setOrg(org);
        setVol(vol);
        setNro(nro);
    }
    
    public String getOrg() {
        return org;
    }
    
    public void setOrg(String org) {
        if(org == null || org.isBlank()){
            throw new IllegalArgumentException("Invalid argument 'org'");
        }
        this.org = org;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        if(vol <= 0) {
            throw new IllegalArgumentException("Invalid argument 'vol'");
        }
        this.vol = vol;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        if(nro <= 0) {
            throw new IllegalArgumentException("Invalid argument 'nro'");
        }
        this.nro = nro;
    }

    public String toString() {
        return "Revista [titulo=" + this.getTitulo() + ", org=" + org + ", nro=" + nro + ", vol=" + vol + ", ano=" + this.getAno() + "]";
    }

    public static void main(String[] args) {
        try {
            new Revista("titulo", " ", 1, 1, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Revista("titulo", "org", 0, 1, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            new Revista("titulo", "org", 1, 0, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        Revista b = new Revista("titulo", "org", 1, 1, 2012);
        System.out.println("SUCCESS: " + b);
    }   
}

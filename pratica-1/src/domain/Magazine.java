package domain;

public class Magazine extends Material{
    private String org;
    private int vol;
    private int nro;

    public Magazine(String title, String org, int vol, int nro, int year) throws IllegalArgumentException {
        super(title, year);
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

    public static void main(String[] args) {
        try {
            Magazine b = new Magazine("title", " ", 1, 1, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Magazine b = new Magazine("title", "org", 0, 1, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Magazine b = new Magazine("title", "org", 1, 0, 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        Magazine b = new Magazine("title", "org", 1, 1, 2012);
        System.out.println("SUCCESS: " + b);
    }   
}

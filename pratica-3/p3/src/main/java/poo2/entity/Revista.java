package poo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="revista")
public class Revista extends Material{
    @Column(name = "org")
    private String org;
    
    @Column(name = "vol")
    private int vol;

    @Column(name = "nro")
    private int nro;

    public Revista(String titulo, String org, String vol, String nro, String ano) throws IllegalArgumentException {
        super(titulo, ano);
        setOrg(org);
        setVol(vol);
        setNro(nro);
    }

    public Revista(){}
    
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
}

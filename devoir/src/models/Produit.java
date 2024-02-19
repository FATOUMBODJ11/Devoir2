package models;

public class Produit {
    private int id;
    private String libelle;
    private String prixunitaire;
    private String qtestock;

    
    public Produit() {
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getLibelle() {
        return libelle;
    }


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public String getPrixunitaire() {
        return prixunitaire;
    }


    public void setPrixunitaire(String prixunitaire) {
        this.prixunitaire = prixunitaire;
    }


    public String getQtestock() {
        return qtestock;
    }


    public void setQtestock(String qtestock) {
        this.qtestock = qtestock;
    }


    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", prixunitaire=" + prixunitaire + ", qtestock="
                + qtestock + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produit other = (Produit) obj;
        if (libelle == null) {
            if (other.libelle != null)
                return false;
        } else if (!libelle.equals(other.libelle))
            return false;
        return true;
    }


    
}

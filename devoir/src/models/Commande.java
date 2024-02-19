package models;

import java.sql.Date;

public class Commande{
    private int id;
    private Date date;
    private String montant;

    
    public Commande() {
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getMontant() {
        return montant;
    }


    public void setMontant(String montant) {
        this.montant = montant;
    }


    @Override
    public String toString() {
        return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + "]";
    }


    public void setDate(String nextLine) {
    }


    
}
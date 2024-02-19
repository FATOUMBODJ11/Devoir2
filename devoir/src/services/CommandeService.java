package services;

import models.Commande;

public class CommandeService {
    public final int N=10;//constantes
    private Commande[] tabCommande=new Commande[N];
    int nbreCommande=0;
    public CommandeService(){

    }

    public void ajouterUneCommande(Commande commande){
        tabCommande[nbreCommande]=commande;
        nbreCommande++;
    }
    
}

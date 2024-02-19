import java.util.Scanner;

import models.Commande;

public class App {
    public static void main(String[] args) throws Exception {
        int choix; 
        Scanner sc;
        sc=new Scanner(System.in);
    
        do{
            System.out.println("1-Ajouter une commande");
            System.out.println("2-Ajouter client");
            System.out.println("3-Lister les commandes d'un client");
            System.out.println("4-Quitter");

            choix=sc.nextInt();
            switch (choix) {
                case 1:
                    Commande commande=new Commande();
                    System.out.println("Entrer l'id");
                    commande.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Entrer la date");
                    commande.setDate(sc.nextLine());
                    System.out.println("Entrer le montant");
                    commande.setMontant(sc.nextLine());
                    
                    break;

            }while (choix!=4);
        sc.close();
        }
    
  }

}


    
          


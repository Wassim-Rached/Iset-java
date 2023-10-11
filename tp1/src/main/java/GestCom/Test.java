package GestCom;

import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Product P1,P2;

        P1 = new Product();
        P2 = new Product();

        P1.initProd("hp204",15,1800,22);
        P2.initProd("hp205",4,4800,14);

        P1.ChangerTaux(2.45);

        P1.Affiche();
        P2.Affiche();

        System.out.println("prix P1 : "+P1.CalculPrix());
        System.out.println("prix P2 : "+P2.CalculPrix());

        // question 2
        Product tabProduit[] = new Product[6];

        for (int i = 0; i < tabProduit.length; i++) {
            Scanner scanner = new Scanner(System.in);
            tabProduit[i] = new Product();
            String reference;
            int quantite;
            double prix,taux;

            System.out.println("entre reference :");
            reference = scanner.nextLine();

            System.out.println("entre quantite");
            quantite = scanner.nextInt();

            System.out.println("entre prix :");
            prix = scanner.nextDouble();

            System.out.println("entre taux :");
            taux = scanner.nextDouble();

            tabProduit[i].initProd(reference,quantite,prix,taux);
        }

        System.out.println("le liste de produit est : ");
        for (int i = 0 ; i < tabProduit.length ; i++)
            tabProduit[i].Affiche();


        double total = 0;
        for (int i = 0 ; i < tabProduit.length ; i++)
            total += tabProduit[i].CalculPrix();

        System.out.println("le moyen de prix est : "+ String.format("%.2f",total/tabProduit.length));
    }
}

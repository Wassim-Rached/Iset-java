package com.tp4;

public class TestLabo {
    public static void main(String[] args) {
        // Testing the "Ordinateur" class
        System.out.println("Testing the Ordinateur class:");
        Ordinateur ordinateur1 = new Ordinateur("12345", "Dell", 1000, 50);
        Ordinateur ordinateur2 = new Ordinateur("67890", "HP", 800, 40);

        // show both pc's
        System.out.println("Ordinateur 1:");
        ordinateur1.Affiche();
        System.out.println("Ordinateur 2:");
        ordinateur2.Affiche();

        // Testing the "Labo" class
        System.out.println("\nTesting the Labo class:");

        // we create new instance of "Labo"
        Labo labo = new Labo(1, "Computer Science", 5);

        // we print its information
        System.out.println("Labo Information:");
        System.out.println(labo);

        // we add two pc's
        System.out.println("\nAdding Ordinateurs to Labo:");
        labo.AjoutOrdi(ordinateur1);
        labo.AjoutOrdi(ordinateur2);

        // we show all pc's with labo methode 
        System.out.println("List of Ordinateurs in the Labo:");
        labo.AfficheOrdi();

        // we show the whole cost of pc's in the lab
        System.out.println("\nTotal cost of Ordinateurs in the Labo: $" + labo.coutTotal());

        // we test to find certain pc by "numSerie"
        System.out.println("\nSearching for an Ordinateur by serial number '12345':");
        Ordinateur foundOrdinateur = labo.RechercheOrdi("12345");
        if (foundOrdinateur != null) {
            // it should be found
            System.out.println(foundOrdinateur);
        } else {
            System.out.println("ERROR : Ordinateur not found.");
        }

        // we delete pc with "numSerie" 67890
        System.out.println("\nDeleting the Ordinateur with serial number '67890':");
        labo.SuppOrdi("67890");

        // we show the list of pc's
        System.out.println("Updated List of Ordinateurs in the Labo:");
        labo.AfficheOrdi();

        // show all the pc's
        System.out.println("\nGetting a list of Dell Computers in the Labo:");
        Ordinateur[] dellComputers = labo.ListeMarque("Dell");
        
        for (Ordinateur computer : dellComputers) {
            System.out.println(computer);
        }
        
        // clear the list
        System.out.println("\nClearing the Labo:");
        labo.viderLabo();

        System.out.println("Updated Labo Information:");
        System.out.println(labo);

    }
}
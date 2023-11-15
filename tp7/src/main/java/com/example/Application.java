package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(10, 10);
        
        int choix;

        do {
            System.out.println("========================");
            System.out.println("1. Ajouter un ouvrage");
            System.out.println("2. Ajouter un abonne");
            System.out.println("3. Emprunter un ouvrage");
            System.out.println("4. Rendre un ouvrage");
            System.out.println("5. Liste des Videos");
            System.out.println("6. Liste des Livres");
            System.out.println("7. Quitter");
            System.out.println("========================");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    Application.createOuvrage(bibliotheque);
                    break;
                
                case 2:
                    Application.createAbonne(bibliotheque);
                    break;
                
                case 3:
                    Application.emprunte(bibliotheque);
                    break;

                case 4:
                    Application.render(bibliotheque);
                    break;

                case 5:
                    Application.listeVideos(bibliotheque);
                    break;

                case 6:
                    Application.listeLivres(bibliotheque);
                    break;
                
                case 7:
                    Application.quitter();
                    break;

                default:
                    break;
            }
        } while (choix != 7);
   }



    private static void createOuvrage(Bibliotheque bibliotheque) {
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Ajouter une video");

        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Titre :");
                String titre_livre = sc.nextLine();
                System.out.println("Date de creation :");
                String dateCreation_livre = sc.nextLine();
                System.out.println("Auteur :");
                String auteur = sc.nextLine();

                Livre livre = new Livre(titre_livre, dateCreation_livre, auteur);
                bibliotheque.ajoutOuvrage(livre);
                break;
            case 2:
                System.out.println("Titre :");
                String titre_video = sc.nextLine();
                System.out.println("Date de creation :");
                String dateCreation_video = sc.nextLine();
                System.out.println("Editeur :");
                String editeur = sc.nextLine();
                System.out.println("Duree :");
                double duree = sc.nextDouble();

                Video video = new Video(titre_video, dateCreation_video, editeur, duree);
                bibliotheque.ajoutOuvrage(video);
                break;
            default:
                break;
        }
   }

    private static void createAbonne(Bibliotheque bibliotheque){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom :");
        String nom = sc.nextLine();
        System.out.println("Numero :");
        int numero = sc.nextInt();
        System.out.println("numAbonnement :");
        int numAbonnement = sc.nextInt();

        Abonne abonne = new Abonne(numero, nom, numAbonnement,null);
        bibliotheque.ajoutAbonne(abonne);
    }

    private static void emprunte(Bibliotheque bibliotheque){
        Scanner sc = new Scanner(System.in);

        System.out.println("Titre :");
        String titre = sc.nextLine();
        System.out.println("Numero :");
        int numero = sc.nextInt();

        bibliotheque.emprunter(titre, numero);
    }

    private static void render(Bibliotheque bibliotheque){
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero :");
        int numero = sc.nextInt();

        bibliotheque.rendre(numero);
    }

    private static void listeLivres(Bibliotheque bibliotheque) {
        Bibliotheque bibLivre = bibliotheque.BibLivre();
        // bibLivre.listeOuvrage
    }

    private static void listeVideos(Bibliotheque bibliotheque) {
        Video[] listeVideos = bibliotheque.ListeVideos();
        System.out.println(Arrays.toString(listeVideos));
    }

    private static void quitter() {
        System.out.println("Au revoir !");
    }
}


    //     Bibliotheque bibliotheque = new Bibliotheque(10, 10);


    //     // 
    //     Livre livre1 = new Livre("Le Petit Prince", "1943", "Antoine de Saint-Exupéry");
    //     Livre livre2 = new Livre("1984", "1949", "George Orwell");
    //     Livre livre3 = new Livre("Le Seigneur des Anneaux", "1954", "J.R.R. Tolkien");

    //     Video video1 = new Video("The Shawshank Redemption", "1994", "Castle Rock Entertainment", 142.0);
    //     Video video2 = new Video("The Godfather", "1972", "Paramount Pictures", 175.0);
    //     Video video3 = new Video("The Dark Knight", "2008", "Warner Bros. Pictures", 152.0);

    //     bibliotheque.ajoutOuvrage(livre1);
    //     bibliotheque.ajoutOuvrage(livre2);
    //     bibliotheque.ajoutOuvrage(livre3);
        
    //     bibliotheque.ajoutOuvrage(video1);
    //     bibliotheque.ajoutOuvrage(video2);
    //     bibliotheque.ajoutOuvrage(video3);


    //     // 
    //     Abonne abonne1 = new Abonne(1, "John Doe", 123, null);
    //     Abonne abonne2 = new Abonne(2, "Jane Smith", 456, null);
    //     Abonne abonne3 = new Abonne(3, "Bob Johnson", 789, null);

    //     bibliotheque.ajoutAbonne(abonne1);
    //     bibliotheque.ajoutAbonne(abonne2);
    //     bibliotheque.ajoutAbonne(abonne3);


    //     //
    //     System.out.println("Liste des ouvrages :");
    //     System.out.println(bibliotheque.getOuvrage("Le Petit Prince"));
    //     System.out.println(bibliotheque.getOuvrage("Le Grand Prince"));
    //     System.out.println(bibliotheque.getOuvrage("The Dark Knight"));
    //     System.out.println("");
        
    //     System.out.println("Liste des abonnes :");
    //     System.out.println(bibliotheque.getAbonne(1));
    //     System.out.println(bibliotheque.getAbonne(6748));
    //     System.out.println("");


    //     // 
    //     bibliotheque.emprunter("Le Petit Prince", 1);
    //     bibliotheque.emprunter("The Godfather", 2);
    //     bibliotheque.emprunter("Bob Johnson", 3);

    //     bibliotheque.rendre(1);

    //     //
    //     System.out.println("Info de 'bibliotheque':");
    //     bibliotheque.Info();
    //     System.out.println("");
        
        
    //     // 
    //     System.out.println("Liste des videos :");
    //     Video ListeVideos[] = bibliotheque.ListeVideos();
    //     System.out.println(Arrays.toString(ListeVideos));
    //     System.out.println("");

        
    //     // 
    //     System.out.println("Info de 'bibLivre':");
    //     Bibliotheque bibLivre = bibliotheque.BibLivre();
    //     bibLivre.Info();
 
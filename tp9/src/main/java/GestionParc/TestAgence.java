package GestionParc;

public class TestAgence {
    public static void main(String[] args) {

		final int MAX_SIZE = 12;
		Agence agence = new Agence(MAX_SIZE);

		Voiture voiture1 = new Voiture("Renault", 1, 1000, "Rouge", "100");
		Voiture voiture2 = new Voiture("Peugeot", 2, 2000, "Bleu", "200");
		Voiture voiture3 = new Voiture("Citroen", 3, 3000, "Vert", "300");
		Voiture voiture4 = new Voiture("Fiat", 4, 4000, "Jaune", "400");

		VoituresUtilitaire utilitaire1 = new VoituresUtilitaire("Renault", 5, 5000, 500);
		VoituresUtilitaire utilitaire2 = new VoituresUtilitaire("Peugeot", 6, 6000, 600);
		VoituresUtilitaire utilitaire3 = new VoituresUtilitaire("Citroen", 7, 7000, 700);
		VoituresUtilitaire utilitaire4 = new VoituresUtilitaire("Fiat", 8, 8000, 800);

		Bus bus1 = new Bus("Renault", 9, 9000, 9);
		Bus bus2 = new Bus("Peugeot", 10, 10000, 10);
		Bus bus3 = new Bus("Citroen", 11, 11000, 11);
		Bus bus4 = new Bus("Fiat", 12, 12000, 12);


		// Ajout des vehicules (voitures)
		agence.AjoutVeh(voiture1);
		agence.AjoutVeh(voiture4);
		agence.AjoutVeh(voiture3);
		agence.AjoutVeh(voiture2);
		// Ajout des vehicules (utilitaires)
		agence.AjoutVeh(utilitaire2);
		agence.AjoutVeh(utilitaire1);
		agence.AjoutVeh(utilitaire4);
		agence.AjoutVeh(utilitaire3);
		// Ajout des vehicules (bus)
		agence.AjoutVeh(bus4);
		agence.AjoutVeh(bus2);
		agence.AjoutVeh(bus1);
		agence.AjoutVeh(bus3);

		// Affichage des vehicules
		agence.InventaireVeh();

		

	}

}

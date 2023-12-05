package examen_java;

public class BaseDeFichiers {
	public static void main(String[] args) {
		Chanson chanson1 = new Chanson("chanson_titre1", "Rock", 120);
		Chanson chanson2 = new Chanson("chanson_titre2", "Rock", 140);
		// 
		Chanson chanson3 = new Chanson("chanson_titre3", "Rap", 240);
		// 
		Chanson chanson4 = new Chanson("chanson_titre4","pop",300);
		Chanson chanson5 = new Chanson("chanson_titre5", "pop", 130);
		Chanson chanson6 = new Chanson("chanson_titre6", "pop", 60);
	
		// 
		Disque disque1  = new Disque("disque_titre1", "Rock", 120);
		Disque disque2  = new Disque("disque_titre2", "pop", 140);

		// 
		disque1.ajouterChanson(chanson1);
		disque1.ajouterChanson(chanson2);
		//
		disque2.ajouterChanson(chanson4);
		disque2.ajouterChanson(chanson5);
		disque2.ajouterChanson(chanson6);

		// 
		Artiste artiste = new Artiste("AR12", "John Doe", "French", 3);

		// 
		artiste.produire(disque1);
		artiste.produire(disque2);
		artiste.produire(chanson3);
	
		// 
		System.out.println("");
		System.out.println("********** Affichage de artiste **********");
		artiste.AfficherArtiste();
		
		// 
		System.out.println("");
		System.out.println("********** Nombre de disques **********");
		System.out.println("Nombre de disques : " + artiste.nombreDisques());
		
		// 
		System.out.println("");
		System.out.println("********** Disques de genre pop **********");
		Disque[] tabDisques = artiste.disqueGenre("pop");
		System.out.println("Nombre de disques pop : " + tabDisques.length);
		
		// 
		System.out.println("");
		System.out.println("********** Nombre Total des Chansons **********");
		System.out.println("Nombre total de chansons : " + artiste.nombreTotalDesChansons());
		
		// 
		System.out.println("");
		System.out.println("********** Liste des chansons **********");
		Chanson[] tabChansons = artiste.listeChansons();
		for (int i = 0; i < tabChansons.length; i++) {
			tabChansons[i].afficher();
		}
	}
}

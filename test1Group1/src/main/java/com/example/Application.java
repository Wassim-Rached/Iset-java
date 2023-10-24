package com.example;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
		Specialite spec1 = new Specialite("Informatique");
		Specialite spec2 = new Specialite("Gestion");

		Participant p1 = new Participant(100,"Mohamed",spec1);
		Participant p2 = new Participant(200,"Samia",spec2);

		Formation f = new Formation(123, "Initiation aux bases de donnes", 10);

		if(f.ajouterParticipant(p1)){
			System.out.println("Ajout Effectue");
		}else{
			System.out.println("Nombre maximum atteint");
		}

		if(f.ajouterParticipant(p1)){
			System.out.println("Ajout Effectue");
		}else{
			System.out.println("Nombre maximum atteint");
		}	
		
		if(f.existeParticipant(p1))
			System.out.println("Participant deja existant");
		
		if(f.existeParticipant(p2))
			System.out.println("Participant deja existant");

		Specialite[] specialites_spec1_liste = f.listeSpecialite("Informatique");
		int specialites_spec1_nb = f.totalSpecialite("Informatique");


		System.out.println(Arrays.toString(specialites_spec1_liste));

		System.out.println("nombre de participant de specialite 'Informatique' : "+ specialites_spec1_nb);

		f.Affiche();
	} 
}

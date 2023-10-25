package com.example;

import java.util.Arrays;

public class Application {
	public static void main(String[] args){
		Categorie cat1 = new Categorie("Mecanique");
		Categorie cat2 = new Categorie("Electrique");

		Produit p1 = new Produit(100,"pompe",cat1);
		Produit p2 = new Produit(200,"batterie",cat2);

		Depot d = new Depot(159,"Charguia 2",15);

		if(d.ajouterProduit(p1)){
			System.out.println("p1 : Ajout effectue");
		}else{
			System.out.println("p1 : Nombre maximum atteint");
		}

		if(d.existeProduit(p1))
			System.out.println("p1 : Produit deja existant");

		if(d.ajouterProduit(p2)){
			System.out.println("p2 : Ajout effectue");
		}else{
			System.out.println("p2 : Nombre maximum atteint");
		}

		if(d.existeProduit(p2))
			System.out.println("p2 : Produit deja existant");

		Produit[] liste_produits_cat1 = d.listeProduits(cat1.getNom());
		int nombre_produits_cat1 = d.totalCategorie(cat1.getNom());

		System.out.println(Arrays.toString(liste_produits_cat1));
		System.out.println("nombre de prduit cat1 : " + nombre_produits_cat1);

		d.affiche();

	}
}

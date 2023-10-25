package com.example;

import java.util.Arrays;

public class Depot {
	private int code;
	private String adr;
	private Produit[] tab;
	private int nb;

	public Depot(int code, String adr, int max){
		this.code = code;
		this.adr = adr;
		this.tab = new Produit[max];
		this.nb = 0;
	}

	public boolean existeProduit(Produit p){
		for(int i = 0; i < this.nb; i++){
			if(this.tab[i].equals(p))
				return true;
		}
		return false;
	}

	public boolean ajouterProduit(Produit p){
		if(this.nb < this.tab.length){
			if(!this.existeProduit(p))
				this.tab[nb++] = p;
			return true;
		}

		return false;
	}
	
	public boolean ajouterProduit(int reference , String lib , Categorie cat){
		return this.ajouterProduit(new Produit(reference, lib, lib));
	}

	public int totalCategorie(String nom){
		int total = 0;
			for(int i = 0 ; i < this.nb ; i++){
				if(this.tab[i].getCat().getNom().equals(nom))
					total++;
			}

		return total;
	}

	public Produit[] listeProduits(String nom){
		Produit[] produits = new Produit[this.totalCategorie(nom)];

		int k = 0;
		for (int i = 0; i < this.nb; i++) {
			if(this.tab[i].getCat().getNom().equals(nom))
				produits[k++] = this.tab[i];
		}

		return produits;
	}

	public void affiche(){
		System.out.println("{" +
			" code='" + this.code + "'" +
			", adr='" + this.adr + "'" +
			", nb='" + this.nb + "'" +
			", tab='" + Arrays.toString(this.tab) + "'" +
			"}");
	}
}

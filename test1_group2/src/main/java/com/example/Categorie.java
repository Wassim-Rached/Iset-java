package com.example;

public class Categorie {
	private static int nbCat;
	private int num;
	private String nom;

	public Categorie(String nom){
		this.nom = nom;
		this.num = ++Categorie.nbCat;
	}

	public int getNbCat() {
		return Categorie.nbCat;
	}

	public String getNom() {
		return this.nom;
	}

	@Override
	public String toString() {
		return "{" +
			" num='" + this.num + "'" +
			", nom='" + getNom() + "'" +
			"}";
	}

}

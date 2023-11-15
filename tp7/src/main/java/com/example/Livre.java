package com.example;

public class Livre extends Ouvrage {
	private String auteur;
	
	public Livre(String titre, String dateCreation,String auteur) {
		super(titre, dateCreation);
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "{" +
			" auteur='" + this.auteur + "'" +
			"ouvrage=" + super.toString() +
			"}";
	}
}

package com.example;

public class Video extends Ouvrage{
	private String editeur;
	private double duree;

	public Video(String titre, String dateCreation, String editeur, double duree) {
		super(titre, dateCreation);
		this.editeur = editeur;
		this.duree = duree;
	}


	@Override
	public String toString() {
		return "{" +
			" editeur='" + this.editeur + "'" +
			", duree='" + this.duree + "'" +
			", ouvrage=" + super.toString() +
			"}";
	}

}

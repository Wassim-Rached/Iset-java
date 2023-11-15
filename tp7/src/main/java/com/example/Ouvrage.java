package com.example;

public abstract class Ouvrage {
	protected String titre;
	protected String dateCreation;
	protected boolean existe; 

	public Ouvrage(String titre, String dateCreation) {
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.existe = true;
	}

	@Override
	public String toString() {
		return "{" +
			" titre='" + this.titre + "'" +
			", dateCreation='" + this.dateCreation + "'" +
			"}";
	}
}


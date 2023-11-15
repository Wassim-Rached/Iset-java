package com.example;

public class Personne {
	private int numId;
	private String nom;
	
	public Personne(int numId, String nom) {
		this.numId = numId;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "{" +
			" numId='" + this.numId + "'" +
			", nom='" + this.nom + "'" +
			"}";
	}

	public int getNumId() {
		return this.numId;
	}

}

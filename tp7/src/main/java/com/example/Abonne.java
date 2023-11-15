package com.example;

public class Abonne extends Personne{
	private int numAbonnement;
	private Ouvrage OuvragePris;

	public Abonne(int numId, String nom, int numAbonnement, Ouvrage OuvragePris) {
		super(numId, nom);
		this.numAbonnement = numAbonnement;
		this.OuvragePris = OuvragePris;
	}


	@Override
	public String toString() {
		return "{" +
			" numAbonnement='" + this.numAbonnement + "'" +
			", OuvragePris='" + this.OuvragePris + "'" +
			", personne=" + super.toString() +
			"}";
	}


	public int getNumAbonnement() {
		return this.numAbonnement;
	}

	public Ouvrage getOuvragePris() {
		return this.OuvragePris;
	}

	public void setOuvragePris(Ouvrage OuvragePris) {
		this.OuvragePris = OuvragePris;
	}

}

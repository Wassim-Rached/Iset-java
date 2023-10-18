package com.example;

public class Abonne {
	private String nom;
	private String[] numTel;
	private int nbNum;
	private int numDef;
	private boolean favoris;

	public Abonne() {
	}

	public Abonne(String nom, int nbNum, int numDef, boolean favoris) {
		this.nom = nom;
		this.nbNum = nbNum;
		this.numDef = numDef;
		this.favoris = favoris;
		this.numTel = new String[5];
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String[] getNumTel() {
		return this.numTel;
	}

	public void setNumTel(String numTel[]) {
		this.numTel = numTel;
	}

	public int getNbNum() {
		return this.nbNum;
	}

	public void setNbNum(int nbNum) {
		this.nbNum = nbNum;
	}

	public int getNumDef() {
		return this.numDef;
	}

	public void setNumDef(int numDef) {
		this.numDef = numDef;
	}

	public boolean isFavoris() {
		return this.favoris;
	}

	public boolean getFavoris() {
		return this.favoris;
	}

	public void setFavoris(boolean favoris) {
		this.favoris = favoris;
	}

	@Override
	public boolean equals(Object o) {
		return true;
	}

	@Override
	public String toString() {
		return "{" +
			" nom='" + getNom() + "'" +
			", numTel[]='" + getNumTel() + "'" +
			", nbNum='" + getNbNum() + "'" +
			", numDef='" + getNumDef() + "'" +
			", favoris='" + isFavoris() + "'" +
			"}";
	}

}

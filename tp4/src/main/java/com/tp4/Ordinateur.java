package com.tp4;

public class Ordinateur {

	private String numSerie;
	private String marque;
	private double prix;
	private double coutInstallation;


	public Ordinateur() {
	}

	public Ordinateur(String numSerie, String marque, double prix, double coutInstallation) {
		this.numSerie = numSerie;
		this.marque = marque;
		this.prix = prix;
		this.coutInstallation = coutInstallation;
	}

	public String getNumSerie() {
		return this.numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getCoutInstallation() {
		return this.coutInstallation;
	}

	public void setCoutInstallation(double coutInstallation) {
		this.coutInstallation = coutInstallation;
	}

	public boolean equals(Ordinateur o) {
		return this.getNumSerie().equals(o.getNumSerie()); 
	}

	@Override
	public String toString() {
		return "{" +
			" numSerie='" + getNumSerie() + "'" +
			", marque='" + getMarque() + "'" +
			", prix='" + getPrix() + "'" +
			", coutInstallation='" + getCoutInstallation() + "'" +
			"}";
	}

	public double Cout(){
		return this.getCoutInstallation() + this.getPrix();
	}

	public void Affiche(){
		System.out.println(this);
	}
}

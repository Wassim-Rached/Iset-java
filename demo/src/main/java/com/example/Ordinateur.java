package com.example;

public class Ordinateur {
	private String numSerie;
	private String marque;
	private double prix;
	private double coutInstallation;
	
	public Ordinateur(String numSerie, String marque, double prix, double coutInstallation) {
		this.numSerie = numSerie;
		this.marque = marque;
		this.prix = prix;
		this.coutInstallation = coutInstallation;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getCoutInstallation() {
		return coutInstallation;
	}

	public void setCoutInstallation(double coutInstallation) {
		this.coutInstallation = coutInstallation;
	}
	
	public double cout()
	{
		return this.prix+this.coutInstallation;
		
	}

	@Override
	public String toString() {
		return "Ordinateur [numSerie=" + numSerie + ", marque=" + marque + ", prix=" + prix + ", coutInstallation="
				+ coutInstallation + "]";
	}
	
	public void  Affiche()
	{
		System.out.println(this);
	}
	
	public boolean equals(Ordinateur o)
	{
		if (o==null)
			return false;
		return this.numSerie.equals(o.numSerie);
	}
	

}

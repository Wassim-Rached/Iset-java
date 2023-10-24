package com.example;

public class Participant {
	private int marticule;
	private String nom;
	private Specialite spec;

	public Specialite getSpec(){
		return this.spec;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public Participant(int marticule,String nom , Specialite spec){
		this.marticule = marticule;
		this.setNom(nom);
		this.spec = spec;
	}
	
	public Participant(int marticule,String nom , String spec){
		this.marticule = marticule;
		this.setNom(nom);
		this.spec = new Specialite(spec);
	}

	public boolean equals(Participant p) {
		return this.marticule == p.marticule;
	}
	

	@Override
	public String toString() {
		return "{" +
			" marticule='" + this.marticule + "'" +
			", nom='" + this.nom + "'" +
			", spec='" + this.getSpec() + "'" +
			"}";
	}
	
}

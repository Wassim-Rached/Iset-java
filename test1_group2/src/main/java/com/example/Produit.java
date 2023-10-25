package com.example;

public class Produit {
	private int reference;
	private String lib;
	private Categorie cat;

	public Produit(int reference,String lib,Categorie cat){
		this.reference = reference;
		this.setLib(lib);
		this.cat = cat;
	}
	
	public Produit(int reference,String lib,String cat){
		this.reference = reference;
		this.setLib(lib);
		this.cat = new Categorie(cat);
	}


	public void setLib(String lib) {
		this.lib = lib;
	}
	
	public Categorie getCat() {
		return this.cat;
	}

	public boolean equals(Produit p){
		return this.reference == p.reference;
	}


	@Override
	public String toString() {
		return "{" +
			" reference='" + this.reference + "'" +
			", lib='" + this.lib + "'" +
			", cat='" + this.getCat() + "'" +
			"}";
	}


}

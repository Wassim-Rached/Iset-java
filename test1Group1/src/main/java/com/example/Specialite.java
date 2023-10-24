package com.example;

public class Specialite {
	static private int nbSpec;
	private int num;
	private String lib;
	

	public int getNbSpec() {
		return Specialite.nbSpec;
	}

	public String getLib() {
		return this.lib;
	}

	public Specialite(String lib){
		this.lib = lib;
		Specialite.nbSpec++;
		this.num = Specialite.nbSpec;
	}

	@Override
	public String toString() {
		return "{" +
			" num='" + this.num + "'" +
			", lib='" + this.getLib() + "'" +
			"}";
	}
}

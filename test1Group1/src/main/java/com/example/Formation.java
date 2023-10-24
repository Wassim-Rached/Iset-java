package com.example;

import java.util.Arrays;

public class Formation {
	private int code;
	private String des;
	private Participant[] tab;
	private int nb;

	public Formation(int code,String des,int max){
		this.code = code;
		this.des = des;
		this.tab = new Participant[max];
		this.nb = 0;
	}

	public boolean existeParticipant(Participant p){
		for(int i = 0; i < this.nb; i++){
			if(this.tab[i].equals(p))
				return true;
		}
		return false;
	} 

	public boolean ajouterParticipant(Participant p){
		if(this.nb < this.tab.length){
			if(!this.existeParticipant(p))
				this.tab[this.nb++] = p;
			return true;
		}else{
			return false;
		}
	}

	public boolean ajouterParticipant(int marticule,String nom,Specialite spec){
		return this.ajouterParticipant(new Participant(marticule, nom, nom));
	}

	public int totalSpecialite(String lib){
		int total = 0;
		for(int i=0;i<this.nb;i++){
			if(this.tab[i].getSpec().getLib().equals(lib))
				total++;
		}
		return total;
	}

	public Specialite[] listeSpecialite(String lib){
		Specialite[] specialites;

		int numberOfResults = 0;
		for(int i=0;i<this.nb;i++){
			if(this.tab[i].getSpec().getLib().equals(lib))
				numberOfResults++;
		}
		
		specialites = new Specialite[numberOfResults];

		int k = 0;
		for(int i=0;i<this.nb;i++){
			if(this.tab[i].getSpec().getLib().equals(lib))
				specialites[k++] = this.tab[i].getSpec();
		}

		return specialites;
	}


	public void Affiche() {
		System.out.println("{" +
			" code='" + this.code + "'" +
			", des='" + this.des + "'" +
			", nb='" + this.nb + "'" +
			", tab='" + Arrays.toString(this.tab) + "'" +
			"}");
	}
}

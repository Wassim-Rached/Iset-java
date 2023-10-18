package com.example;

import java.util.Arrays;

public class Abonne {
	private String nom;
	private String[] numTel;
	private int nbNum;
	private int numDef;
	private boolean favoris;

	public Abonne() {
	}

	public Abonne(String nom, int numDef, boolean favoris,String numTel) {
		this.nom = nom;
		this.numDef = numDef;
		this.favoris = favoris;
		this.numTel = new String[5];
		this.numTel[this.nbNum++]=numTel;
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

	public int getNbNum() {
		return this.nbNum;
	}


	public int getNumDef() {
		return this.numDef;
	}

	public void setNumDef(int numDef) {
		this.numDef = numDef;
	}


	public boolean getFavoris() {
		return this.favoris;
	}

	public void setFavoris(boolean favoris) {
		this.favoris = favoris;
	}


	@Override
	public String toString() {
		return "{" +
			" nom='" + getNom() + "'" +
			", numTel[]='" + Arrays.toString(getNumTel()) + "'" +
			", nbNum='" + getNbNum() + "'" +
			", numDef='" + getNumDef() + "'" +
			", favoris='" + getFavoris() + "'" +
			"}";
	}

	public String getNumDefault(){
		return numTel[numDef];
	}

	public int indiceNum(String phoneNumber){
		// we loop for the whole numTel liste
		for (int i = 0; i < this.nbNum; i++) {
			// if we find the number we return it immediately
			if(this.numTel[i].equals(phoneNumber)) return i;
		}

		// if we got here it means the phone number is not found
		// we return -1 as result
		return -1;
	}

	public boolean addNum(String phoneNumber){
		// if the array of phone numbers is full we back off with false
		if(this.nbNum >= this.nbNum ) return false;
		// if the phone number already exists we back off with false too
		if(indiceNum(phoneNumber) != -1) return false;

		// otherwise we add the phone number and return true
		this.numTel[this.nbNum++] = phoneNumber;
		return true;
	}

	public boolean modifNum(int index,String phoneNumber){
		// if the index is out of range we return null
		if(index < 0 || index > 4) return false;

		// otherwise we update the phone number and return true
		this.numTel[index] = phoneNumber;
		return true;
	}

	public boolean isCommun(Abonne abonne){
		// we loop for the whole 'abonne' Number of telephones
		for (String phoneNumber__abonne : abonne.getNumTel()) {

			// we need to check if the instance isn't null
			if(phoneNumber__abonne == null) continue;
			
			// and we loop for the whole 'this' Number of telephones
			// for each phone number of the 'abonne'
			for (String phoneNumber__this : this.getNumTel()) {
				
				// we need to check if the instance isn't null here too
				if(phoneNumber__this == null) continue;
				
				// now we compare every single phone number of 'abonne'
				// to every other phone number of 'this'
				// and when we find a common phone number we return true
				if(phoneNumber__abonne.equals(phoneNumber__this)) return true;
			}
		}

		// if we got to this point we know that there is not single common
		// phone number so we return false
		return false;
	}



}

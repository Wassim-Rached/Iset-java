package com.tp4;

import java.util.ArrayList;
import java.util.List;

public class Labo {
	private int num;
	private String specialite;
	private Ordinateur[] listeOrdi;
	private int nbreOrdi;

	public Labo() {
	}
	
	public	Labo(int num, String specialite, int capacite){
		this.num = num;
		this.specialite = specialite;
		this.listeOrdi = new Ordinateur[capacite];
		this.nbreOrdi = 0;
	}
	
	public Ordinateur[] getListeOrdi() {
		return this.listeOrdi;
	}

	public void setListeOrdi(Ordinateur[] listeOrdi) {
		this.listeOrdi = listeOrdi;
	}

	public int getNbreOrdi() {
		return this.nbreOrdi;
	}

	public void setNbreOrdi(int nbreOrdi) {
		this.nbreOrdi = nbreOrdi;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	@Override
	public String toString() {
		return "{" +
			" num='" + getNum() + "'" +
			", specialite='" + getSpecialite() + "'" +
			", nombre d'ordinateur='" + getNbreOrdi() + "'" +
			"}";
	}

	public void AfficheOrdi(Ordinateur new_ordinateur){
		for (Ordinateur ordinateur : this.getListeOrdi()) {
			ordinateur.Affiche();
		}
	}

	public double coutTotal(){
		// set a counter to 0
		double counter = 0;

		for (Ordinateur ordinateur : this.getListeOrdi()) {
			// then increment it with every cost of pc's
			counter+=ordinateur.Cout();
		}

		return counter;
	}

	public void AjoutOrdi(Ordinateur new_ordinateur){
		// if the liste is alread full we back off
		if (this.getListeOrdi().length == this.getNbreOrdi()) return;
		
		// if the PC is alread exists we back off
		for (Ordinateur ordinateur : this.getListeOrdi()) {
			if(ordinateur.equals(new_ordinateur)) return;
		}

		// otherwise we add the new pc
		listeOrdi[this.getNum()] = new_ordinateur;

		// then we increment the number of pc's
		this.setNbreOrdi(this.getNbreOrdi()+1);
	}

	public void AjoutOrdi(String numSerie, String marque, double prix, double coutInstallation){
		// we create new instance with the arguments
		Ordinateur new_ordinateur = new Ordinateur(numSerie, marque, prix, coutInstallation);
		
		// then we add it 
		this.AjoutOrdi(new_ordinateur);
	}

	public int RechercheIndice(String numSerie){
		// we loop the whole liste
		for(int i=0; i<this.getListeOrdi().length;i++){
			// we return the index the moment we find it 
			if(this.getListeOrdi()[i].getNumSerie().equals(numSerie)) return i; 
		}

		// if we didnt find the pc we return -1
		return -1;
	}

	public Ordinateur RechercheOrdi(String numSerie){
		// get the index 
		int index = this.RechercheIndice(numSerie);
		
		// back off if the pc wasnt found
		if(index == -1) return null;
		
		// otherwise we return the pc
		return this.getListeOrdi()[index];
	}

	public void SuppOrdi(int indice){
		// if the liste is empty then we back off
		if (this.getNbreOrdi() == 0) return;

		// if the index is off the limit then we back off
		if (indice >= this.getNbreOrdi() || indice < 0) return; 

		
		// Shift elements to the left, overwriting the element at the specified index.
		for (int i = indice; i < this.getListeOrdi().length - 1; i++) {
				this.getListeOrdi()[i] = this.getListeOrdi()[i + 1];
		}
	}

	public void SuppOrdi(String numSerie){
		// we search the index
		int index = this.RechercheIndice(numSerie);
		
		// then we use the class methode to delete it
		this.SuppOrdi(index);
	}

	public Ordinateur[] ListeMarque(String marque){
		// we set our counter to 0 first
		int number_of_results = 0;

		// we loop for the whole liste
		for (Ordinateur ordinateur : this.getListeOrdi()) {
			// incrementing the counter for each valid pc marque
			if(ordinateur.getMarque().equals(marque)) number_of_results++;
		}
		
		// we use the counter to initialize the result array
		Ordinateur[] liste_of_ordinateur_of_marque = new Ordinateur[number_of_results];

		int i = 0;
		// we loop the whole list again
		for (Ordinateur ordinateur : this.getListeOrdi()) {
			// filling it with the pc's with the wanted "marque"
			if(ordinateur.getMarque().equals(marque))
				liste_of_ordinateur_of_marque[i] = ordinateur;
		}
		
		return liste_of_ordinateur_of_marque;
	} 


	public void viderLabo(){
		// we loop for the whole list
		for (int i = 0; i < this.getNbreOrdi(); i++) {
					// making its vlues
			this.getListeOrdi()[i] = null;
			}
		
		// we set the number of items in the list to 0 
		this.setNbreOrdi(0);
	}
}


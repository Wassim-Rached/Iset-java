package com.example;

import java.util.Arrays;

public class Repertoire {
	private Abonne[] tabAbonne;
	private int nbre;
	
	public Repertoire(int nombreMaximum){
		this.tabAbonne = new Abonne[nombreMaximum];
		this.nbre = 0;
	}

	public Abonne[] getTabAbonne(){
		return this.tabAbonne;
	}
	
	@Override
	public String toString() {
		return "{" +
			" tabAbonne='" + Arrays.toString(getTabAbonne()) + "'" +
			", nbre='" + getNAbonnes() + "'" +
			"}";
	}
	
	public boolean addAbonne(Abonne newAbonne){
		// we loop through the whole 'abonne' array
		for(int i = 0; i < this.nbre ; i++){
			// if we find common phone number between this 'abonne'
			// and the new 'abonne' we back off and return false
			if(this.tabAbonne[i].isCommun(newAbonne)) return false;
		}

		// otherwise we add the new 'abonne' and return true
		this.tabAbonne[this.nbre++] = newAbonne; 
		return true;
	}

	public String getNumero(String nom){
		// we loop through the whole list
		for (int i = 0; i < this.nbre; i++) {
			// if we find a match we return its default phone number
			Abonne abonne = this.tabAbonne[i];
			if (abonne.getNom().equals(nom)) return abonne.getNumDefault();
		}
		
		// if we didn't find a match we just return null
		return null;
	}
	
	public int getNAbonnes(){
		return this.nbre;
	}

	public Repertoire getFavoris(){
		// we make variable to store the result 'Repertoire.nbre'
		int onlyFavoritesRepertoire__size = 0;
		
		// we loop through the whole list values
		for (int i = 0; i < this.nbre; i++) {
			// for each time we find a match for favorite 'abonne'
			if(tabAbonne[i].getFavoris()){
				//  we increment the size 
				onlyFavoritesRepertoire__size++;
			} 
		}
		
		// we use the size we just calculated to initialize 
		// the result 'Repertoire'
		Repertoire onlyFavoritesRepertoire = new Repertoire(onlyFavoritesRepertoire__size);
		
		// we loop through the whole list values
		for (int i = 0; i < this.nbre; i++) {
			// for each time we find a match for favorite 'abonne'
			if(tabAbonne[i].getFavoris()){
				//  we add the 'abonne' instance to the result 'Repertoire'
				onlyFavoritesRepertoire.addAbonne(tabAbonne[i]);
			}
		}
		
		// finally we return the result 'Repertoire'
		return onlyFavoritesRepertoire;
	}
	
	public Abonne getAbonne(String phoneNumber){
		// we loop through the whole list values
		for (int i = 0; i < this.nbre; i++) {
			// if we find the default phone number is the same as
			// the parameter phone number we return the 'abonne' instance
			Abonne abonne = this.tabAbonne[i];
			System.out.println("abonne.getNumDefault() : "+abonne.getNumDefault());
			if(abonne.getNumDefault().equals(phoneNumber)) return abonne;
		}

		// otherwise if we didn't find any matches we return null
		return null;
	}

	public boolean addFavoris(String phoneNumber){
		// first we get the 'abonne' instance
		Abonne abonne = this.getAbonne(phoneNumber);

		// we back off and return false if the instance is null
		if(abonne == null) return false;

		// otherwise we set the 'abonne.favoris' to true and return true
		abonne.setFavoris(true);
		return true;
	}
}

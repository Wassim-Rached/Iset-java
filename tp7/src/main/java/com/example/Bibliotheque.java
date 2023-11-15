package com.example;

public class Bibliotheque {
	private Ouvrage[] listeOuvrage;
	private Abonne[] listeAbonne;
	private int nbreOuvrage;
	private int nbreAbonne;

	public Bibliotheque(int taille_listeOuvrage, int taille_listeAbonne) {
		this.listeOuvrage = new Ouvrage[taille_listeOuvrage];
		this.listeAbonne = new Abonne[taille_listeAbonne];
		this.nbreOuvrage = 0;
		this.nbreAbonne = 0;
	}

	public boolean ajoutOuvrage(Ouvrage ouvrage){
		if(this.nbreOuvrage >= this.listeOuvrage.length) return false;
		
		boolean isFound = false; 

		for(int i=0;i<this.nbreOuvrage;i++){
			if (this.listeOuvrage[i].titre.equals(ouvrage.titre)){
				isFound = true;
				break;
			}
		}
	
		if (isFound) return false;

		this.listeOuvrage[this.nbreOuvrage++] = ouvrage;
		return true;
	}

	public Ouvrage getOuvrage(String titre){
		for(int i=0;i<this.nbreOuvrage;i++){
			if (this.listeOuvrage[i].titre.equals(titre)){
				return this.listeOuvrage[i];
			}
		}
		return null;
	}
	
	public boolean ajoutAbonne(Abonne abonne){
		if(this.nbreAbonne >= this.listeAbonne.length) return false;
		
		boolean isFound = false; 

		for(int i=0;i<this.nbreAbonne;i++){
			if (this.listeAbonne[i].getNumAbonnement() == abonne.getNumAbonnement()){
				isFound = true;
				break;
			}
		}
	
		if (isFound) return false;

		this.listeAbonne[this.nbreAbonne++] = abonne;
		return true;
	}
	
	public Abonne getAbonne(int numId){
		for(int i=0;i<this.nbreAbonne;i++){
			if (this.listeAbonne[i].getNumId() == numId){
				return this.listeAbonne[i];
			}
		}
		return null;
	}

	public boolean emprunter(String titre,int numId){
		Ouvrage ouvrage = this.getOuvrage(titre);
		Abonne abonne = this.getAbonne(numId);
		
		if (ouvrage == null || abonne == null) return false;
		if (abonne.getOuvragePris() != null) return false;
		if (!ouvrage.existe) return false;
		
		abonne.setOuvragePris(ouvrage);
		ouvrage.existe = false;
		return true;
	}

	public void rendre(int numId){
		Abonne abonne = this.getAbonne(numId);
		if (abonne == null) return;
		
		Ouvrage ouvrage = abonne.getOuvragePris();
		if (ouvrage == null) return;
		
		ouvrage.existe = true;
		abonne.setOuvragePris(null);
	} 

	public void Info(){
		System.out.println("Liste des ouvrages :");
		for(int i=0;i<this.nbreOuvrage;i++){
			System.out.println(this.listeOuvrage[i].toString());
		}

		System.out.println("Liste des abonnes :");
		for(int i=0;i<this.nbreAbonne;i++){
			if (this.listeAbonne[i].getOuvragePris() != null){
				System.out.println(this.listeAbonne[i].toString()+" a emprunte "+this.listeAbonne[i].getOuvragePris().toString());
			}
		}
	}

	public Video[] ListeVideos(){
		int listeVideoLength = 0;
		for(int i=0;i<this.nbreOuvrage;i++){
			if (this.listeOuvrage[i] instanceof Video){
				listeVideoLength++;
			}
		}

		Video[] listeVideo = new Video[listeVideoLength];
		
		int nbreVideo = 0;
		for(int i=0;i<this.nbreOuvrage;i++){
			if (this.listeOuvrage[i].getClass().getSimpleName().equals("Video")){
				listeVideo[nbreVideo++] = (Video) this.listeOuvrage[i];
			}
		}

		return listeVideo;
	}
	
	public Bibliotheque BibLivre(){
		Bibliotheque bibLivre = new Bibliotheque(this.nbreOuvrage,this.nbreAbonne);
		
		for(int i=0;i<this.nbreOuvrage;i++){
			if (this.listeOuvrage[i].getClass().getSimpleName().equals("Livre")){
				bibLivre.ajoutOuvrage(this.listeOuvrage[i]);
			}
		}
		
		// for(int i=0;i<this.nbreAbonne;i++){
		// 	bibLivre.ajoutAbonne(this.listeAbonne[i]);
		// }
		
		return bibLivre;
	}

}

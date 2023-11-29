package GestionParc;

public class Agence {
	Vehicule[] ListVeh;
	int nbreVeh;

	public Agence(int max) {
		this.ListVeh = new Vehicule[max];
		this.nbreVeh = 0;
	}

	public int RechercheVeh(int numId){
		for (int i = 0; i < this.nbreVeh; i++) {
			if (this.ListVeh[i].getNumId() == numId) {
				return i;
			}
		}
		return -1;
	}

	public boolean AjoutVeh (Vehicule vehiculeAjoute){
		if (this.nbreVeh >= this.ListVeh.length) return false;
		if (this.RechercheVeh(vehiculeAjoute.getNumId()) != -1) return false;
		
		int i = 0;
		
		while (i < this.nbreVeh && this.ListVeh[i].getNumId() < vehiculeAjoute.getNumId()) {
			i++;
		}
		
		for (int j = this.nbreVeh; j > i; j--) {
			this.ListVeh[j] = this.ListVeh[j - 1];
		}
		
		this.ListVeh[i] = vehiculeAjoute;
		this.nbreVeh++;

		return true;
	}

	public void SupprimVeh (int numId){
		int index = this.RechercheVeh(numId);
		if (index == -1) return;
		
		for (int j = index; j < this.nbreVeh - 1; j++) {
			this.ListVeh[j] = this.ListVeh[j + 1];
		}
		
		this.nbreVeh--;
	}

	public void InventaireVeh(){
		for (Vehicule vehicule : ListVeh) {
			if (vehicule != null) 
				vehicule.Edition();
		}
	}

	public double getTotalTTC(){
		double total = 0;
		for (Vehicule vehicule : ListVeh) {
			if (vehicule != null) 
				total += vehicule.ChiffreAffairesTTC();
		}
		return total;
	}

	public double getTotalTaxe(){
		double total = 0;
		for (Vehicule vehicule : ListVeh) {
			if (vehicule != null) 
				total += vehicule.ChiffreAffairesTTC() - vehicule.getChiffreAffairesHT();
		}
		return total;
	}

	public Voiture[] listeVoitureParCouleur(String couleur){
		int nbreVoiture = 0;
		
		for(Vehicule vehicule : ListVeh) {
			if (vehicule == null) continue;
			if (!(vehicule instanceof Voiture)) continue;
			
			Voiture voiture = (Voiture) vehicule;
			if (voiture.getCouleur().equals(couleur)) {
				nbreVoiture++;
			}
		}

		Voiture[] listeVoiture = new Voiture[nbreVoiture];

		int k = 0;
		for (Vehicule vehicule : ListVeh) {
			if (vehicule == null) continue;
			if (!(vehicule instanceof Voiture)) continue;
			
			Voiture voiture = (Voiture) vehicule;
			if (voiture.getCouleur().equals(couleur)) {
				listeVoiture[k++] = voiture;
			}
		}

		return listeVoiture;
	}

	public Agence AgenceBus (){
		int busCounter = 0;
		
		for(Vehicule vehicule : this.ListVeh){
			if (vehicule == null) continue;
			if (!(vehicule instanceof Bus)) continue;

			busCounter++;
		}

		Agence agence = new Agence(busCounter);
		
		for(Vehicule vehicule : this.ListVeh){
			if (vehicule == null) continue;
			if (!(vehicule instanceof Bus)) continue;

			agence.AjoutVeh(vehicule);
		}


		return agence;
	}

}

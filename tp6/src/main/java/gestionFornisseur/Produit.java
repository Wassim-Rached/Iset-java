package gestionFornisseur;

public class Produit {
	private String codeP;
	private double prixHT;
	private double taxe;
	private int qte;
	private boolean livraison;


	public Produit(String codeP, double prixHT, double taxe, int qte, boolean livraison) {
		this.setCodeP(codeP);
		this.setPrixHT(prixHT);
		this.setTaxe(taxe);
		this.setQte(qte);
		this.setLivraison(livraison);;
	}

	public String getCodeP() {
		return this.codeP;
	}

	public void setCodeP(String codeP) {
		this.codeP = codeP;
	}

	public double getPrixHT() {
		return this.prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public double getTaxe() {
		return this.taxe;
	}

	public void setTaxe(double taxe) {
		this.taxe = taxe;
	}

	public int getQte() {
		return this.qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public boolean isLivraison() {
		return this.livraison;
	}

	public boolean getLivraison() {
		return this.livraison;
	}

	public void setLivraison(boolean livraison) {
		this.livraison = livraison;
	}


	public double PrixTTC(){
		return this.prixHT * (1 + this.taxe);
	};
	
	public double TotalTTC(){
		return this.PrixTTC() * this.qte;
	};
	
	public boolean equals(Produit p){
		return this.codeP == p.codeP;
	};
	
	@Override
	public String toString() {
		return "{" +
			" codeP='" + getCodeP() + "'" +
			", prixHT='" + getPrixHT() + "'" +
			", taxe='" + getTaxe() + "'" +
			", qte='" + getQte() + "'" +
			", livraison='" + isLivraison() + "'" +
			"}";
	}
	
	public void Affiche(){
		System.out.println(this);
	};
}

package gestionFornisseur;

import java.util.Arrays;

public class Fournisseur {
	private int codeF;
	private String nom;
	private int nbreProd;
	private Produit tab[];

	public Fournisseur(int codeF,String nom,int nbreProdMax){
		this.codeF = codeF;
		this.nom = nom;
		this.tab = new Produit[nbreProdMax];
		this.nbreProd = 0;
	};

	public double TotalTTC(){
		double total = 0;
		for(int i=0 ; i < nbreProd ; i++){
			total += this.tab[i].TotalTTC();
		}
		return total;
	};
	
	public double TotalTTCLivre(){
		double total = 0;
		for(int i=0 ; i < nbreProd ; i++){
			if(this.tab[i].isLivraison())
				total += this.tab[i].TotalTTC();
		}
		return total;
	};
	
	public Produit Recherche(String codeP){
		for(int i=0 ; i < nbreProd ; i++){
			if(this.tab[i].getCodeP() == codeP)
				return this.tab[i];
			};	
		return null;
	};	
	
	// -1 si le produit existe, 1 si Tab est saturé et 0 si ok;
	public int AjoutProduit(Produit P){
		if( this.nbreProd >= this.tab.length ) return 1;
		if( this.Recherche(P.getCodeP()) != null ) return -1;
		
		this.tab[nbreProd++] = P;
		
		return 0;
	};

	public int AjoutProduit(String codeP, double prixHT, double taxe, int qte, boolean livraison){
		return this.AjoutProduit(new Produit(codeP, prixHT, taxe, qte, livraison));
	};
	
	public void SuppProd(String codeP){
		boolean found = false;

		for(int i=0; i < nbreProd;i++){
			if(this.tab[i].getCodeP() == codeP)
				found = true;
			
			if(found && i < nbreProd - 1)
				this.tab[i] = this.tab[i+1];
		}

		if(found) this.tab[--nbreProd] = null;
	};
	
	public void SuppProd(Produit P){
		this.SuppProd(P.getCodeP());
	};
	
	public void LivrerProduit(String codeP){
		this.Recherche(codeP).setLivraison(true);
	};

	//applique une remise de 20% sur un produit{};
	public void RemiseProduit(String codeP){
		Produit produit = this.Recherche(codeP);
		if(produit != null)
		produit.setPrixHT(produit.getPrixHT() * 0.8);
	};
	
	public void AugmenterQte(String codeP, int nbre){
		Produit produit = this.Recherche(codeP);
		if(produit != null)
			produit.setQte(produit.getQte() + nbre);
	};

	//affiche le fournisseur ainsi que ses produits{};
	public void Affiche(){
		System.out.println("{" +
			" codeF='" + this.codeF + "'" +
			", nom='" + this.nom + "'" +
			", nbreProd='" + this.nbreProd + "'" +
			", tab[]='" + Arrays.toString(this.tab) + "'" +
			"}");
	};
	
	public Produit[] ListeProduitsNonLivres(){
		Produit[] produitsNonLivres;

		int nombreProduitsNonLivres = 0;
		for (int i = 0; i < tab.length; i++) {
			if(this.tab[i].isLivraison())
				nombreProduitsNonLivres++;
		}
		
		produitsNonLivres = new Produit[nombreProduitsNonLivres];
		
		int k = 0;
		for (int i = 0; i < tab.length; i++) {
			if(this.tab[i].isLivraison())
				produitsNonLivres[k++] = this.tab[i];
		}

		return produitsNonLivres;
	};
}

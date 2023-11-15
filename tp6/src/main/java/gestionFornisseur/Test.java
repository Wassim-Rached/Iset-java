package gestionFornisseur;

import java.util.Arrays;

public class Test {

	public static void main(String[] args){
		// 
		Produit p1 = new Produit("P100",1000.800,0.20,12,false);
		Produit p2 = new Produit("P200",2000.300,0.24,15,true);
		Produit p3 = new Produit("P300",6000.200,0.27,23,true);
		Produit p4 = new Produit("P400",7000.000,0.12,32,false);
		Produit p4_another = new Produit("P400",3000.000,0.42,45,true);

		// 
		Fournisseur fournisseur = new Fournisseur(1,"Wassim",5);
	

		// 
		fournisseur.AjoutProduit(p1);
		fournisseur.AjoutProduit(p2);
		fournisseur.AjoutProduit(p3);
		fournisseur.AjoutProduit(p4);
		fournisseur.AjoutProduit("P500",8000,0.23,2,false);
	

		// 
		System.out.println("");
		System.out.println(p4.equals(p4_another) ? "p4 == p4_another": "p4 != p4_another");
		

		// 
		System.out.println("");
		double TotalTTC = fournisseur.TotalTTC();
		System.out.println("TotalTTC : " + String.format("%.2f",TotalTTC));

		
		// 
		double TotalTTCLivre = fournisseur.TotalTTCLivre();
		System.out.println("TotalTTC : " + String.format("%.2f", TotalTTCLivre));


		// 
		Produit[] listeProduitsNonLivres = fournisseur.ListeProduitsNonLivres();
		
		System.out.println("");
		System.out.println("listeProduitsNonLivres : " + Arrays.toString(listeProduitsNonLivres));


		// 
		System.out.println("");
		fournisseur.Affiche();


		// 
		fournisseur.SuppProd("P500");
		fournisseur.SuppProd(p3);
		fournisseur.SuppProd("P100");
		

		//
		fournisseur.AugmenterQte(p2.getCodeP(),5);
		fournisseur.RemiseProduit(p4.getCodeP());
		fournisseur.LivrerProduit(p4.getCodeP());

		
		// 
		System.out.println("");
		fournisseur.Affiche();
	}

}

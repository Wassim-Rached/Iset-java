package vente;

import java.util.Arrays;

import produit.Article;
import produit.ArticleLot;

public class Magasin {
	private Article[] Stock;
	private int nbarticle;

	public Magasin(int max) {
		Stock = new Article[max];
		nbarticle = 0;
	}

	public int Ajout(Article article){
		if (nbarticle >= Stock.length) return 1;
		for (int i = 0; i < nbarticle; i++) {
			if (Stock[i].equals(article)) return -1;
		}
		Stock[nbarticle++] = article;
		return 0;
	}


	public void Inventaire (){
		System.out.println(Arrays.toString(Stock));
	}

	public int NbreArticlesSimples(){
		int counter = 0;
		for (int i = 0; i < nbarticle; i++) {
			if (Stock[i].getClass().getSimpleName().equals("Article"))
				counter++;
		}
		return counter;
	}

	public ArticleLot[] ListeArticlesLot(){
		int list_size = 0;
		for (int i = 0; i < nbarticle; i++) {
			if (Stock[i].getClass().getSimpleName().equals("ArticleLot"))
				list_size++;
		}

		ArticleLot[] list = new ArticleLot[list_size];
		
		int k = 0;
		for (int i = 0; i < nbarticle; i++) {
			if (Stock[i].getClass().getSimpleName().equals("ArticleLot"))
				list[k++] = (ArticleLot) Stock[i];
		}
		return list;
	}

	public double TotalTTC(){
		double total = 0;
		for (int i = 0; i < nbarticle; i++) {
			total += Stock[i].PrixTTC();
		}
		return total;
	}

	public Article[] MemeFamille(Article article){
		int list_size = 0;
		for (int i = 0; i < nbarticle; i++) {
			if (article.memefamille(this.Stock[i]))
			list_size++;
		}

		Article[] list = new Article[list_size];
		
		int k = 0;
		for (int i = 0; i < nbarticle; i++) {
			if (article.memefamille(this.Stock[i]))
				list[k++] = Stock[i];
		}

		return list;
	}

	public Article getArticle(String code){
		for (int i = 0; i < nbarticle; i++) {
			if (Stock[i].getCode().equals(code))
				return Stock[i];
		}
		return null;
	}

	public ArticleLot[] NbrePiecesSup(ArticleLot articleLot){
		ArticleLot[] list = new ArticleLot[nbarticle];
		
		for (int i = 0; i < nbarticle; i++) {
			if(Stock[i].getClass().getSimpleName().equals("ArticleLot")){
				ArticleLot articleLot_deListe = (ArticleLot) Stock[i];
				if (articleLot_deListe.getNombreDePieces() > articleLot.getNombreDePieces())
					list[i] = articleLot_deListe;
			}
		}
		
		return list;
	}

}

package produit;

import Exceptions.PrixException;
import Exceptions.TVAException;

public class Article {
	protected String Code;
	protected String Designation;
	protected Double Prix;
	protected Double TVA;
	protected String Famille;

	public Article(String Code, String Designation, Double Prix, Double TVA, String Famille) throws TVAException,PrixException  {
		this.Code = Code;
		this.Designation = Designation;
		if (Prix < 0) throw new PrixException("Prix doit être positif");
		this.Prix = Prix;
		if (TVA < 0 || TVA > 1) {
			throw new TVAException("TVA doit être entre 0 et 1");
		}
		this.TVA = TVA;
		this.Famille = Famille;
	}

	@Override
	public String toString() {
		return "Article [Code=" + Code + ", Designation=" + Designation + ", Prix=" + Prix + ", TVA=" + TVA
				+ ", Famille=" + Famille + "]";
	}

	public boolean memefamille (Article article){
		return this.Famille.equals(article.Famille);
	}

	public double PrixTTC(){
		return this.Prix * (1 + this.TVA);
	}

	
	public boolean equals(Article article){
		return this.Code.equals(article.Code);
	}

	public String getCode(){
		return this.Code;
	}

}

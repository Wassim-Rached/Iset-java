package produit;

import Exceptions.LotException;
import Exceptions.PrixException;
import Exceptions.TVAException;

public class ArticleLot extends Article{
	private int nombreDePieces;
	private double remise;

	public ArticleLot(String Code, String Designation, Double Prix, Double TVA, String Famille, int nombreDePieces, double remise) throws TVAException, PrixException,LotException {
		super(Code, Designation, Prix, TVA, Famille);
		
		if (nombreDePieces < 2) throw new LotException("Nombre de pièces doit être supérieur à 1");
		if (remise < 0 || remise > 1) throw new LotException("Remise doit être entre 0 et 1");
		
		this.nombreDePieces = nombreDePieces;
		this.remise = remise;
	}

	@Override()
	public String toString() {
		return super.toString() + " ArticleLot [nombreDePieces=" + nombreDePieces + ", remise=" + remise + "]";
	}

	public double PrixTTC() {
		return this.Prix * (1 + this.TVA) * (1 - this.remise );
	}

	public int getNombreDePieces() {
		return this.nombreDePieces;
	}
}

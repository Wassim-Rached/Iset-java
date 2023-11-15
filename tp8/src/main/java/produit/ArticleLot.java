package produit;

public class ArticleLot extends Article{
	private int nombreDePieces;
	private double remise;

	public ArticleLot(String Code, String Designation, Double Prix, Double TVA, String Famille, int nombreDePieces, double remise) {
		super(Code, Designation, Prix, TVA, Famille);
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

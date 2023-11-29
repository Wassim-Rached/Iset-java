package GestionParc;

public class Voiture extends Vehicule{
	private String couleur;
	private String puissance;

	public Voiture(String marque, int numId, double chiffreAffairesHT, String couleur, String puissance) {
		super(marque, numId, chiffreAffairesHT);
		this.couleur = couleur;
		this.puissance = puissance;
	}

	@Override
	public double ChiffreAffairesTTC() {
		return super.getChiffreAffairesHT() * 1.15;
	}

	@Override
	public void Edition(){
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Voiture [couleur=" + couleur + ", puissance=" + puissance
				+ ", Vehicule" + super.toString() + "]";
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPuissance() {
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
}

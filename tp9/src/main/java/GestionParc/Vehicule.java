package GestionParc;

public abstract class Vehicule {
	private String marque;
	private int numId;
	private double chiffreAffairesHT;

	public Vehicule(String marque, int numId, double chiffreAffairesHT) {
		this.chiffreAffairesHT = chiffreAffairesHT;
		this.marque = marque;
		this.numId = numId;
	}

	public abstract double ChiffreAffairesTTC();

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public double getChiffreAffairesHT() {
		return chiffreAffairesHT;
	}

	public void setChiffreAffairesHT(double chiffreAffairesHT) {
		this.chiffreAffairesHT = chiffreAffairesHT;
	}

	public abstract void Edition();

	@Override
	public String toString() {
		return "Vehicule [chiffreAffairesHT=" + chiffreAffairesHT + ", marque=" + marque + ", numId=" + numId + "]";
	}

}

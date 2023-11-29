package GestionParc;

public class VoituresUtilitaire extends Vehicule{
	private int chargeUtile;

	public VoituresUtilitaire(String marque, int numId, double chiffreAffairesHT, int chargeUtile) {
		super(marque, numId, chiffreAffairesHT);
		this.chargeUtile = chargeUtile;
	}

	@Override
	public double ChiffreAffairesTTC() {
		return super.getChiffreAffairesHT() * 1.15 + this.chargeUtile * 0.015;
	}

	@Override
	public void Edition() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "VoituresUtilitaire [chargeUtile=" + chargeUtile + ", Vehicule" + super.toString() + "]";
	}

	public int getChargeUtile() {
		return chargeUtile;
	}

	public void setChargeUtile(int chargeUtile) {
		this.chargeUtile = chargeUtile;
	}
}

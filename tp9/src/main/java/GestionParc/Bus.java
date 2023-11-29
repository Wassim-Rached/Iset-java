package GestionParc;

public class Bus extends Vehicule implements ILocationBus {
	private int numPlaces;

	public Bus(String marque, int numId, double chiffreAffairesHT, int numPlaces) {
		super(marque, numId, chiffreAffairesHT);
		this.numPlaces = numPlaces;
	}

	@Override
	public double CoutLocation() {
		return 7.5 * this.numPlaces;
	}

	@Override
	public double AssuranceParLocation() {
		double percentageAssurance = this.numPlaces > 20 ? 0.20 : 0.15;
		return this.CoutLocation() * percentageAssurance; 
	}

	@Override
	public double ChiffreAffairesTTC() {
		return super.getChiffreAffairesHT() * 1.2 + this.numPlaces * 1.8;
	}

	public void Edition() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Bus [numPlaces=" + numPlaces + ", Vehicule" + super.toString() + "]";
	}

	public int getNumPlaces() {
		return numPlaces;
	}

	public void setNumPlaces(int numPlaces) {
		this.numPlaces = numPlaces;
	}
}

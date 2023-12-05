package examen_java;

public class Chanson extends OEuvre{
	private int duree;
	
	public Chanson(String titre, String genre, int duree) {
		super(titre, genre);
		this.duree = duree;
	}

	@Override
	public int getDuree() {
		return duree;
	}

	@Override
	public String toString() {
		return super.toString() + ", Duree: " + duree;
	}

}

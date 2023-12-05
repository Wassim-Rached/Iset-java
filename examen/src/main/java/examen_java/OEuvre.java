package examen_java;

public abstract class OEuvre {
	protected String titre;
	protected String genre;

	public OEuvre(String titre, String genre) {
		this.titre = titre;
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public abstract int getDuree();

	// toString
	@Override
	public String toString() {
		return "OEuvre [titre=" + titre + ", genre=" + genre + "]";
	}

	public void afficher() {
		System.out.println(this);
	}
}

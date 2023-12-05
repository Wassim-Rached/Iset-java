package examen_java;

public class Disque extends OEuvre implements INombre{
	private Chanson[] tabChansons;
	private int nbChansons;

	public Disque(String titre, String genre, int maxChansons) {
		super(titre, genre);
		this.tabChansons = new Chanson[maxChansons];
		this.nbChansons = 0;
	}

	@Override
	public int getDuree() {
		int duree = 0;
		for (int i = 0; i < nbChansons; i++) {
			duree += tabChansons[i].getDuree();
		}
		return duree;
	}

	@Override
	public int getNombreChansons() {
		return this.nbChansons;
	}

	public boolean ajouterChanson(Chanson chanson) {
		if (!chanson.genre.equals(this.genre)) return false;
		if (nbChansons >= tabChansons.length) return false;

		tabChansons[nbChansons++] = chanson;
		return true;
	}

	public Chanson getChanson(String titre) {
		for (int i = 0; i < nbChansons; i++) {
			if (tabChansons[i].titre.equals(titre)) return tabChansons[i];
		}
		return null;
	}

	public Chanson[] getChansons() {
		return tabChansons;
	}

	@Override
	public void afficher() {
		for (int i = 0; i < nbChansons; i++) {
			tabChansons[i].afficher();
		}
	}

	
}

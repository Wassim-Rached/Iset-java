package examen_java;

public class Artiste {
	private String identifiant;
	private String nom;
	private String nationalite;
	private int nbOeuvres;
	private OEuvre[] tabOeuvres;

	public Artiste(String identifiant, String nom, String nationalite, int maxOeuvres) {
		this.identifiant = identifiant;
		this.nationalite = nationalite;
		this.nom = nom;
		this.tabOeuvres = new OEuvre[maxOeuvres];
		this.nbOeuvres = 0;
	}

	public boolean produire(OEuvre oeuvre) {
		if (nbOeuvres >= tabOeuvres.length) return false;

		tabOeuvres[nbOeuvres++] = oeuvre;
		return true;
	}

	public void AfficherArtiste(){
		System.out.println("Artiste [identifiant=" + identifiant + ", nom=" + nom + ", nationalite=" + nationalite + "]");
		for (int i = 0; i < nbOeuvres; i++) {
			tabOeuvres[i].afficher();
		}
	}

	public int nombreDisques(){
		int nbDisques = 0;
		for (int i = 0; i < nbOeuvres; i++) {
			if (tabOeuvres[i] instanceof Disque) nbDisques++;
		}
		return nbDisques;
	}

	public Disque[] disqueGenre(String g){
		Disque[] tabDisques = new Disque[nombreDisques()];
		
		int nbDisques = 0;
		for (int i = 0; i < nbOeuvres; i++) {
			if (tabOeuvres[i] instanceof Disque && tabOeuvres[i].getGenre().equals(g)) {
				tabDisques[nbDisques++] = (Disque) tabOeuvres[i];
			}
		}
		return tabDisques;
	}

	public int nombreTotalDesChansons(){
		int nbChansonsCounter = 0;

		for (int i = 0; i < nbOeuvres; i++) {
			if (tabOeuvres[i] instanceof Disque) {
				nbChansonsCounter += ((Disque) tabOeuvres[i]).getNombreChansons();
			}else if (tabOeuvres[i] instanceof Chanson) {
				nbChansonsCounter++;
			}
		}

		return nbChansonsCounter;
	}

	public Chanson[] listeChansons(){
		Chanson[] tabChansons = new Chanson[this.nombreTotalDesChansons()];
		int nbChansonsCounter = 0;

		for (int i = 0; i < nbOeuvres; i++) {
			if (tabOeuvres[i] instanceof Disque) {
				Disque disque =((Disque) tabOeuvres[i]);

				Chanson[] tabChansonsDisque = disque.getChansons();
				int nbChansons = disque.getNombreChansons();

				for (int j = 0; j < nbChansons; j++) {
					tabChansons[nbChansonsCounter++] = tabChansonsDisque[j];
				}
			}else if (tabOeuvres[i] instanceof Chanson) {
				tabChansons[nbChansonsCounter++] = (Chanson) tabOeuvres[i];
			}
		}

		return tabChansons;
	}
}

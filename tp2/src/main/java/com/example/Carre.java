package main.java.com.example;

public class Carre {
	private int Cote; 
	private Point Centre;

	public Carre(int Abscisse,int Ordonnée,int Cote){
		this(Abscisse,Ordonnée);
		this.Cote=Cote;
	}

	public Carre(int Abscisse,int Ordonnée){
		this.Centre = new Point(Abscisse,Ordonnée);
	}

	public int getCote() {
		return this.Cote;
	}

	public void setCote(int Cote) {
		this.Cote = Cote;
	}

	public Point getCentre() {
		return this.Centre;
	}

	public void setCentre(Point Centre) {
		this.Centre = Centre;
	}

	@Override
	public String toString() {
		return "{" +
			" Cote='" + getCote() + "'" +
			", Centre='" + getCentre() + "'" +
			"}";
	}

	public void TranslCarreHoriz(int a){
		this.Centre.TranslHoriz(a);
	} 
	
	public void TranslCarreVert (int a){
		this.Centre.TranslVert(a);
	} 

	public void TranslationCarre (int a, int b){
		this.Centre.Translation(a,b);
	}
	
	public void TranslationCarre (int a){
		this.Centre.Translation(a);
	}

	public boolean equals (Carre C){
		return this.getCote() == C.getCote() && this.Coincide(C);
	}

	public int Surface(){
		return this.getCote()*this.getCote();
	};

	public int perimetre(){
		return this.getCote()*4;
	};

	public double diagonale(){
		return Math.sqrt(this.getCote()*this.getCote() * 2);
	};

	public Point[] CoinsDuCarre(){
		Point points[] = new Point[4];
	
		points[0] = new Point(this.getCentre().getAbscisse() + this.getCote() / 2, this.getCentre().getOrdonnée() + this.getCote() / 2);
		points[1] = new Point(this.getCentre().getAbscisse() + this.getCote() / 2, this.getCentre().getOrdonnée() - this.getCote() / 2);
		points[2] = new Point(this.getCentre().getAbscisse() - this.getCote() / 2, this.getCentre().getOrdonnée() + this.getCote() / 2);
		points[3] = new Point(this.getCentre().getAbscisse() - this.getCote() / 2, this.getCentre().getOrdonnée() - this.getCote() / 2 );
	
		return points;
	}
	;

}

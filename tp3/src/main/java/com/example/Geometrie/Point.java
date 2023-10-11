package com.example.Geometrie;

public class Point {
	private int Abscisse;
	private int Ordonnee;


	public Point(int Abscisse, int Ordonnee) {
		this.Abscisse = Abscisse;
		this.Ordonnee = Ordonnee;
	}

	public int getAbscisse() {
		return this.Abscisse;
	}

	public void setAbscisse(int Abscisse) {
		this.Abscisse = Abscisse;
	}

	public int getOrdonnee() {
		return this.Ordonnee;
	}

	public void setOrdonnee(int Ordonnee) {
		this.Ordonnee = Ordonnee;
	}

	public Point Abscisse(int Abscisse) {
		setAbscisse(Abscisse);
		return this;
	}

	public Point Ordonnee(int Ordonnee) {
		setOrdonnee(Ordonnee);
		return this;
	}


	@Override
	public String toString() {
		return
			"(" + getAbscisse() + ", "+ this.getOrdonnee() + ")";
	}

	public void SymHoriz(){
		this.Ordonnee = -this.Ordonnee;
	}

	public void SymVert(){
		this.Ordonnee = -this.Ordonnee;
	}
	
	public void Deplacer(int a , int b){
		this.Abscisse += a;
        this.Ordonnee += b;
	}

	public void Deplacer(int a){
		Deplacer(a,a);
	}

	public boolean equals (Point p) {
		return this.getAbscisse() == p.getAbscisse() && this.getOrdonnee() == p.getOrdonnee();
	}

	public double Distance(Point p){
		return Math.sqrt(
				Math.pow(this.getAbscisse() - p.getAbscisse(),2)
				+
				Math.pow(this.getOrdonnee() - p.getOrdonnee(),2)
			);
	}



}

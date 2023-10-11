package com.example.Geometrie;

public class Cercle {
    private int rayon;
    private Point centre;

    public Cercle(int abs, int ord, int rayon) {
        this.centre = new Point(abs, ord);
        this.rayon = rayon;
    }

    public Cercle(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

	public int getRayon() {
		return this.rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public Point getCentre() {
		return this.centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
    public String toString() {
        return "Centre : " + this.getCentre() + ", Rayon=" + rayon;
    }

    public void SymCercleHoriz() {
        centre.SymHoriz(); 
	}

    public void SymCercleVert() {
        centre.SymVert();
	}

    public void Translater(int a, int b) {
        centre.Deplacer(a, b); 
	}

    public void Translater(int a) {
        centre.Deplacer(a); 
	}

    public boolean equals(Cercle c) {
        return this.centre.equals(c.centre) && this.rayon == c.rayon;
    }

    public double Surface() {
        return Math.PI * rayon * rayon;
    }

}
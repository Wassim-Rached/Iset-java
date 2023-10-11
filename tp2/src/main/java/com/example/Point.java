package main.java.com.example;

import java.util.Objects;

public class Point {
	private String Nom;
	private int Abscisse;
	private int Ordonnée;

	public Point(String Nom, int Abscisse, int Ordonnée) {
		this.Nom = Nom;
		this.Abscisse = Abscisse;
		this.Ordonnée = Ordonnée;
	}

	public Point(int Abscisse, int Ordonnée) {
		this.Abscisse = Abscisse;
		this.Ordonnée = Ordonnée;
	}
	
	public Point(String Nom) {
		this.Nom = Nom;
	}

	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}

	public int getAbscisse() {
		return this.Abscisse;
	}

	public void setAbscisse(int Abscisse) {
		this.Abscisse = Abscisse;
	}

	public int getOrdonnée() {
		return this.Ordonnée;
	}

	public void setOrdonnée(int Ordonnée) {
		this.Ordonnée = Ordonnée;
	}

	@Override
	public String toString() {
		return this.getNom()+"("+this.getAbscisse()+", "+this.getOrdonnée()+")";
	}
	
	public void Affiche(){
		System.out.println(this);
	}

	public void TranslHoriz(int a){
		this.Abscisse+=a;
	}
	
	public void TranslVert(int a){
		this.Ordonnée+=a;
	}

	public void Translation(int a,int b){
		this.TranslHoriz(a);
		this.TranslVert(b);
	}
	
	public void Translation(int a){
		this.TranslHoriz(a);
		this.TranslVert(a);
	}

	public boolean Coincide (Point p){
		return this.getAbscisse() == p.getAbscisse() && this.getOrdonnée() == p.getOrdonnée();
	}


}

package com.example.Geometrie;
public class Segment {
    private Point extr1;
    private Point extr2;

    public Segment(Point extr1, Point extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }

    public Segment(int abs1, int ord1, int abs2, int ord2) {
        this.extr1 = new Point(abs1, ord1);
        this.extr2 = new Point(abs2, ord2);
    }

    public String toString() {
        return "[" + extr1.toString() + " ; " + extr2.toString() + "]";
    }

    public double Longueur() {
        return extr1.Distance(extr2);
    }

    public boolean Appartient(Point P) {
        return Math.abs(P.Distance(extr1) + P.Distance(extr2) - Longueur()) < 0.001;
    }

    public void translaterSeg(int a, int b) {
        extr1.Deplacer(a, b);
        extr2.Deplacer(a, b);
    }
}

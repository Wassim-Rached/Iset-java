package com.example;

import main.java.com.example.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point("some_point",1,1);
        
        System.out.println(point1);
        
        point1.Affiche();
        
        point1.TranslHoriz(4);
        point1.Affiche();

        point1.TranslVert(3);
        point1.Affiche();
        
        point1.Translation(3,6);
        point1.Affiche();

        point1.Translation(2);
        point1.Affiche();
        
        Point point2 = new Point("some_point2",10,12);
        
        if(point1.Coincide(point2)){
            System.out.println("Coincide");
        }else{
            System.out.println("non Coincide");
        }
    }
}
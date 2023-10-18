package com.example;

public class TestLabo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Labo lab=new Labo(206,"dev web",30);
		
		lab.AjoutOrdi("kkk444", "hp", 1540, 35);
		lab.AjoutOrdi("kkk445", "hp", 2000, 40);
		lab.AjoutOrdi("kkk446", "dell", 5540, 35);
		lab.AjoutOrdi("kkk447", "dell", 4567, 35);
		lab.AjoutOrdi("kkk448", "dell", 3540, 35);
		lab.AfficheOrdi();
		
		// Ordinateur[] T;
		// T=lab.listeMarque("hp");
		
		// for(int i=0;i<T.length&&T[i]!=null;i++)
		// 	System.out.println(T[i]);
		/*
		for(int i=0;i<lab.listeMarque("hp").length&&lab.listeMarque("hp")[i]!=null;i++)
			System.out.println(lab.listeMarque("hp")[i]);
		*/
		int k=0;
		System.out.println(k++);
		System.out.println(k);
		System.out.println(++k);
		System.out.println(k);
	}

}

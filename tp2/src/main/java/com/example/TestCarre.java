package main.java.com.example;


public class TestCarre {
	public static void main(String[] args){
		Carre carre = new Carre(5,5 , 3);

		System.out.println(carre);
		
		carre.TranslCarreHoriz(4);
		System.out.println(carre);
		
		carre.TranslCarreVert(3);
		System.out.println(carre);
		
		carre.TranslationCarre(2,5);
		System.out.println(carre);
		
		carre.TranslationCarre(1);
		System.out.println(carre);
		
		
		Carre carre2 = new Carre(5,5 , 3);
		
		if(carre==carre2){
			System.out.println("equals");
		}else{
			System.out.println("non equals");
		}

		System.out.println("Surface : "+carre.Surface());

		System.out.println("perimetre : "+carre.perimetre());
		
		System.out.println("diagonale : "+carre.diagonale());
		
		for (Point point: carre.CoinsDuCarre()) {
			System.out.println(point);
		}
		
	}
}

package com.example;

import com.example.Exceptions.MaxException;
import com.example.Exceptions.MinException;

public class TestCompteur {
	public static void main(String args[]) throws MinException{
		CompteurAbstrait cp_ord,cp_cycl;
		
		try {
			cp_ord = new CompteurOrd(0);
		
			for (int i=0; i<10; i++) {
				cp_ord.Increment();
				System.out.println(cp_ord.courant);
			}
		}
		catch (MinException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("**********");

		try {
			cp_cycl = new Compteurcycl(4,5);
			
			for (int i=0; i<10; i++) {
				cp_cycl.Increment();
				System.out.println(cp_cycl.courant);
			}
		} catch (MaxException e) {
			System.out.println(e.getMessage());
		}

	}
}

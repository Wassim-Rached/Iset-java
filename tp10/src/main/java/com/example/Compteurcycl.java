package com.example;

import com.example.Exceptions.MaxException;
import com.example.Exceptions.MinException;

public class Compteurcycl extends CompteurAbstrait{
	private int max;

	public Compteurcycl(int min, int max) throws MinException, MaxException {
		super(min);

		if (max <= min) throw new MaxException("max doit être supérieur à min");
		this.max = max;
	}

	@Override
	public void Increment() {
		if (this.courant == this.max) {
			this.courant = this.min;
		} else {
			this.courant++;
		}
	}
	
}

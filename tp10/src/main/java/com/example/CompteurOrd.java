package com.example;

import com.example.Exceptions.MinException;

public class CompteurOrd extends CompteurAbstrait{

	public CompteurOrd(int min)throws MinException {
		super(min);
	}

	@Override
	public void Increment() {
		this.courant++;
	}
}

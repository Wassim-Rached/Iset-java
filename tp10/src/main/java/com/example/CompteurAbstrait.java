package com.example;

import com.example.Exceptions.MinException;

public abstract class  CompteurAbstrait {
	protected int min;
	protected int courant;

	public CompteurAbstrait(int min)throws MinException {
		if (min < 0) throw new MinException("min doit être positif");
		
		this.min = min;
		courant = min;
	}

	public void RAZ() {
		courant = min;
	}

	public abstract void Increment();

}

package Exceptions;

public class PrixException extends Exception {
	// cette exception est levée si on tente 
	// de créer un article avec un prix négatif

	public PrixException(String message) {
		super(message);
	}
}

package Exceptions;

public class TVAException extends Exception {
	// cette exception est levée si on tente de créer un article avec
	// une TVA non comprise entre 0 et 1.

	public TVAException(String message) {
		super(message);
	}
}

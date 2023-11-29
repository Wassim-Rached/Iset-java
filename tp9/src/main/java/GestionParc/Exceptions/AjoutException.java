package GestionParc.Exceptions;

public class AjoutException extends Exception {
	// cette exception est levée lors de l’ajout d’un article 
	// dans un magasin dont le tableau stock est saturé
	
	public AjoutException(String message) {
		super(message);
	}
}

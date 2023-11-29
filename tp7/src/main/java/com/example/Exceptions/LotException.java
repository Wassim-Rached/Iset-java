package GestionParc.Exceptions;

public class LotException extends Exception{
	// 	cette exception est levée si on tente de créer 
	// un articleLot avec un nombre de pièces
	// inférieur à 2 ou une remise nom comprise entre 0 et 1.

	public LotException(String message) {
		super(message);
	}
}

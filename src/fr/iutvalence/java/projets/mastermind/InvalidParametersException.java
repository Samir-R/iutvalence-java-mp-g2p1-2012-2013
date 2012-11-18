package fr.iutvalence.java.projets.mastermind;

// soulevant une exception si le numéro du pion est invalide
public class InvalidParametersException extends Exception {

	public InvalidParametersException() {
		
		//FIXME pas d'affichage console au osulevement d'une exception !
		System.out.println("Valeur de pion incorrecte !");
	}

}

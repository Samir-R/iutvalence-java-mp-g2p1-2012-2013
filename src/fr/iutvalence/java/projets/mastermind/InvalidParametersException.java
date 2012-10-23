package fr.iutvalence.java.projets.mastermind;

// soulevant une exception si le numéro du pion est invalide
public class InvalidParametersException extends Exception {
	
	public InvalidParametersException(){
	    System.out.println("Valeur de pion incorrecte !");
	  }  

}

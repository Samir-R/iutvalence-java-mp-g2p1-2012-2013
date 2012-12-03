package fr.iutvalence.java.projets.mastermind;

import java.util.Random;

public enum Couleur {

	JAUNE("Jaune"), ROUGE("Rouge"), VERT("Vert"), BLEU("Bleu"), GRIS("Gris"), VIOLET("Violet"),
	ORANGE("Orange"), ROSE("Rose"), NOIR("Noir"), BLANC("Blanc"), NUL("Rien");

	private final String color;

	// FIXME commentaire
	/**
	 * @param color
	 */
	private Couleur(String color) {
		this.color = color;
	}
	
	//genere une couleur de pion aleatoirement
	public static Couleur alea()
	{
		switch(new Random().nextInt(8))
		{
			case 0 : 	return ROUGE;
			case 1 : 	return JAUNE;
			case 2 : 	return BLEU;
			case 3 : 	return ORANGE;
			case 4 : 	return ROSE;
			case 5 : 	return VIOLET;
			case 6 : 	return NOIR;
			default : 	return VERT;
		}
	}
	
	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return color;
	}

}

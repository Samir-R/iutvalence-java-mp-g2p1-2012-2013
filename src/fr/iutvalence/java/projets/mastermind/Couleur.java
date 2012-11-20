package fr.iutvalence.java.projets.mastermind;

import java.util.Random;

public enum Couleur {

	JAUNE("Jaune"), ROUGE("Rouge"), VERT("Vert"), BLEU("Bleu"), NOIR("Noir"), BLANC(
			"Blanc"), NUL("Rien");

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
		switch(new Random().nextInt(4))
		{
			case 0 : 	return ROUGE;
			case 1: 	return JAUNE;
			case 2 : 	return BLEU;
			default : 	return VERT;
		}
	}
	
	/*A faire convertit un entier en une couleur
	 * public void converIntCouleur(int c) {

		if (c == 0)
			couleur = Couleur.ROUGE;
		if (c == 1)
			couleur = Couleur.VERT;
		if (c == 2)
			couleur = Couleur.JAUNE;
		if (c == 3)
			couleur = Couleur.BLEU;
	}*/
	
	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return color;
	}

}

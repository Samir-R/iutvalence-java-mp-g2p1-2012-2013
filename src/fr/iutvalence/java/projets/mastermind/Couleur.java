package fr.iutvalence.java.projets.mastermind;

public enum Couleur {

	JAUNE("Jaune"), ROUGE("Rouge"), VERT("Vert"), BLEU("Bleu"), NOIR("Noir"), BLANC(
			"Blanc"), NUL("Rien");

	private String color = "";

	// FIXME commentaire
	/**
	 * @param color
	 */
	private Couleur(String color) {
		this.color = color;
	}

	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return color;
	}

}

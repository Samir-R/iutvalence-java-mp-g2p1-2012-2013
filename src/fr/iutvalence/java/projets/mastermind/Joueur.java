package fr.iutvalence.java.projets.mastermind;

// FIXME -> écrire le commentaire A LA SYNTAXE JAVADOC
/**
//FIXME definition du joueur:
 * Un joueur est crée lors de sa premiere partie, il est ensuite chargé pour dans la base
 * pour reutiliser pour une autre partie.
 
 * 
 * @author merahme
 *
 */
public class Joueur {
/**
	// FIXME pseudo du joueur
**/	public String pseudo;

/**
	// FIXME score du joueur pour une partie
**/	public int score;

/**
	// FIXME meileur score du joueur pour une partie
**/	public int maxScore;
		
/**	// FIXME création d'un joueur 
**/	public Joueur(String jNom){
		pseudo=jNom;
		score=0;
		maxScore=0;
		
	}
	
    // FIXME méthodes ?
}

package fr.iutvalence.java.projets.mastermind;

// FIXME corriger le commentaire (ici vous parlez d'implementation, on veut juste savoir à quoi sert un joueur)

/**
 * Un joueur est crée lors de sa premiere partie, il est ensuite chargé pour dans la base
 * pour reutiliser pour une autre partie.
 
 * 
 * @author merahme
 *
 */
public class Joueur {

// FIXME passer l'attribut en private	
/**
*	pseudo du joueur
*/	
	public String pseudo;

	// FIXME passer l'attribut en private
/**
* 	score du joueur pour une partie
*/	public int score;


//FIXME passer l'attribut en private
/**
*	meilleur score du joueur pour une partie
*/	
public int maxScore;


// FIXME détailler le commentaire
/**	
 * création d'un joueur 
*/	
public Joueur(String jNom){
		pseudo=jNom;
		score=0;
		maxScore=0;
		
	}
	
    // FIXME méthodes ?
}

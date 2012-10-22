package fr.iutvalence.java.projets.mastermind;


/**
 * Un Joueur est composé d'un pseudonyme le definisant, un score pour une partie
 * courante et maxScore representant le meilleur score réalisé par le joueur pour 
 * une partie 
 * 
 
 * 
 * @author merahme
 *
 */
public class Joueur {


/**
*	pseudo du joueur
*/	
	// FIXME le pseudo change t'il en cours de partie ?
	private String pseudo;

	
/**
* 	score du joueur pour une partie
*/	private int score;



/**
*	meilleur score du joueur pour une partie
*/	
	private int maxScore;


// FIXME détailler le commentaire
/**	
 * création d'un joueur à partir d'un pseudo saisie préalablement, le score et le maxScore
 * sont tout deux initialisés à 0(en effet le joueur n'a effectuer aucune partie)
*/	
	public Joueur(String jNom){
		pseudo=jNom;
		score=0;
		maxScore=0;
		
	}
	
    // FIXME méthodes ?
}

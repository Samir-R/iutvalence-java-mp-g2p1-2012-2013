package fr.iutvalence.java.projets.mastermind;


/**
 * Un Joueur est composé d'un pseudonyme le definisant, un score pour une partie
 * courante. 
 * 
 
 * 
 * @author merahme
 *
 */
public class Joueur {


/**
*	pseudo du joueur
*/	
	private final String pseudo;

	
/**
* 	score du joueur pour une partie
*/	private int score;



/**	
 * création d'un joueur à partir d'un pseudo saisie préalablement, le score 
 * est initialisés à 0.
*/	
	public Joueur(String jNom){
		pseudo=jNom;
		score=0;
				
	}
	
	public String getJoueur(){
		  return this.pseudo;
		  }
	
	public int getScore(){
		  return this.score;
		  }
	
	public void setScore(int points){
		  this.score=points;
		  }
	

}

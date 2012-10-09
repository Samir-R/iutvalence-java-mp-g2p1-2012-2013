package fr.iutvalence.java.projets.mastermind;

import java.util.Random;


// FIXME écrire le commentaire
public class Partie {

/**	// FIXME utilisation d'un objet combinaison, representant la solution, crée à l'interieur de cette classe
*/	private Combinaison aTrouver;
	

	
/**	// FIXME utilisation d'un objet combinaison representant les coups d'essai générée par le joueur durant une partie
*/    private Combinaison essai;
    
	
    
/**	// FIXME création d'une partie qui prend en parametre un joueur
**/ public Partie (Joueur player){
    	
	Random rnd = new Random();
/**	// FIXME "couleur" du premier pion généré aleatoirement**/
	int num1 = rnd.nextInt(3);
/**	// FIXME "couleur" du deuxieme pion généré aleatoirement**/
	int num2 = rnd.nextInt(3);
/**	// FIXME "couleur" du troisieme pion généré aleatoirement**/
	int num3 = rnd.nextInt(3);
/**	// FIXME "couleur" du dernier pion généré aleatoirement**/
	int num4 = rnd.nextInt(3);
	
/** // FIXME création des pions, à partir des "couleurs" générées precedemment, composant 
 * la combinaison aTrouver **/
	Pion p1 = new Pion(num1);
	Pion p2 = new Pion(num2);
	Pion p3 = new Pion(num3);
	Pion p4 = new Pion(num4);
    
/** // FIXME création de l'objet combinaison aTrouver à partir des pions crées precedemment **/
	aTrouver= new Combinaison(p1,p2,p3,p4);
	
	
    	
    }

    
    // FIXME méthodes  ?
	
}

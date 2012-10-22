package fr.iutvalence.java.projets.mastermind;

import java.util.Random;


/** Une partie est composée d'une combinaison à trouver, d'une série combinaison essai
 *  saisie par le joueur  
 * @author merahme
 *
 */
public class Partie {

/**	
*  la combinaison à trouver
*/	private Combinaison aTrouver;
	

	
/**	
 * la combinaison proposée par le joueur durant une partie
 * 
*/
// FIXME attribut ou variable locale à une méthode ?
private Combinaison essai;

    
	
    
// FIXME détailler le commentaire
/**	
 * création d'une partie qui prend en parametre un joueur, qui génére automatiquement combinaison ,
*/ public Partie (Joueur player){
    	
	Random rnd = new Random();
	
	//"couleur" du premier pion généré aleatoirement
	int num1 = rnd.nextInt(3);
	
	//"couleur" du deuxieme pion généré aleatoirement
	int num2 = rnd.nextInt(3);
	
	//"couleur" du troisieme pion généré aleatoirement
	int num3 = rnd.nextInt(3);
	
	//"couleur" du dernier pion généré aleatoirement
	int num4 = rnd.nextInt(3);
	
	
	// création des pions, à partir des "couleurs" générées precedemment, composant 
	// la combinaison aTrouver 
	Pion p1 = new Pion(num1);
	Pion p2 = new Pion(num2);
	Pion p3 = new Pion(num3);
	Pion p4 = new Pion(num4);
    
	
	//création de l'objet combinaison aTrouver à partir des pions crées precedemment **/
	aTrouver= new Combinaison(p1,p2,p3,p4);
	
	
	
	    	
    }


	//FIXME méthodes jouer...

	public jouer(Combinaison solut)
	{
		
	}

    
    // FIXME méthodes  ?
	
}

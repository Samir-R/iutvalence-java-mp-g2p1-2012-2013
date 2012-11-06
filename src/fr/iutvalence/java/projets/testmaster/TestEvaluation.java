package fr.iutvalence.java.projets.testmaster;

import fr.iutvalence.java.projets.mastermind.Combinaison;
import fr.iutvalence.java.projets.mastermind.Couleur;
import fr.iutvalence.java.projets.mastermind.Evaluation;
import fr.iutvalence.java.projets.mastermind.Pion;

/**
 * 
 * Tester le fonctionnement de la classe Evaluation 
 * @author merahme
 *
 */
public class TestEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Pion p1 = new Pion(1);
		//Pion p2 = new Pion(2);
		//Pion p3 = new Pion(0);
		//Pion p4 = new Pion(3);
		
		Pion p5 = new Pion(Couleur.ROUGE);
		Pion p6 = new Pion(Couleur.VERT);
		Pion p7 = new Pion(Couleur.BLEU);
		Pion p8 = new Pion(Couleur.VERT);
		
		Combinaison essai = new Combinaison(p5,p5,p7,p8);
		
	//	Combinaison solut = new Combinaison(p1,p2,p3,p4);
		
		//Evaluation e1 = new Evaluation(essai,solut);
		System.out.println(essai);
	//	System.out.println(e1.toString()+"\n");
	
	}

}

package fr.iutvalence.java.projets.testmaster;

import fr.iutvalence.java.projets.mastermind.Combinaison;
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

		Pion p1 = new Pion(1);
		Pion p2 = new Pion(2);
		Pion p3 = new Pion(0);
		Pion p4 = new Pion(3);
		
		Combinaison c1 = new Combinaison(p1,p2,p3,p4);
		
		Combinaison c2 = new Combinaison(p2,p3,p4,p1);
		
		Evaluation e1 = new Evaluation(c1,c2);
		
		System.out.println(e1.toString()+"\n");
	
	}

}

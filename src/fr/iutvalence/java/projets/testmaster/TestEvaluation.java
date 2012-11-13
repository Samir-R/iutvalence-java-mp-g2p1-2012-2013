package fr.iutvalence.java.projets.testmaster;

import fr.iutvalence.java.projets.mastermind.Partie;

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
		
/*
		Pion p1 = new Pion(Couleur.BLEU);
		Pion p2 = new Pion(Couleur.VERT);
		Pion p3 = new Pion(Couleur.VERT);
		Pion p4 = new Pion(Couleur.BLEU);
		
		Pion p5 = new Pion(Couleur.ROUGE);
		Pion p6 = new Pion(Couleur.VERT);
		Pion p7 = new Pion(Couleur.BLEU);
		Pion p8 = new Pion(Couleur.JAUNE);
		
		Combinaison essai = new Combinaison(p1,p2,p3,p4);
		
		Combinaison solut = new Combinaison(p5,p6,p7,p8);
		
		Evaluation e1 = new Evaluation(essai,solut);
		//System.out.println(essai);
		System.out.println(e1.toString()+"\n");
	
		
		//	Pion p=new Pion(Couleur.ROUGE);
	//	  p.converIntCouleur(2);
	//	  System.out.println(p);
*/
		Partie p = new Partie();
		p.jouer();
	
	}

}

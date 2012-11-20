package fr.iutvalence.java.projets.mastermind;

import java.util.Random;
import java.util.Scanner;

/**
 * Une partie est composée d'une combinaison à trouver, d'une série combinaison
 * essai saisie par le joueur
 * 
 * @author merahme
 * 
 */
public class Partie {

	//FIXME attributs ?
	
	/**
	 * la combinaison à trouver
	 */
	// private Combinaison aTrouver;


	// FIXME détailler le commentaire
	/**
	 * création d'une partie qui prend en parametre un joueur, qui génére
	 * automatiquement combinaison ,
	 */
	public Partie() {

		// Joueur player ajouté en parametre

		// création des pions, à partir des "couleurs" générées precedemment,
		// composant
		// la combinaison aTrouver
		/*
		 * Pion p1 = new Pion(num1); Pion p2 = new Pion(num2); Pion p3 = new
		 * Pion(num3); Pion p4 = new Pion(num4);
		 */

		// declaration de l'objet combinaison aTrouver à partir des pions crées
		// precedemment **/
		// Combinaison aTrouver= null;

	}

	// FIXME Il faut se rendre indépendant de l'entrée standard
	public void jouer()
	{
				
		Combinaison aTrouver=new Combinaison();
		
		//declaration de l'objet Combinaison essai
		Combinaison essai= new Combinaison();
				
		System.out.println(aTrouver);
		System.out.println("MASTERMIND");
		do
		{
			
			System.out.println("Saisie de la combinaison:");
			System.out.println("\t 0:Rouge");
			System.out.println("\t 1:Vert");
			System.out.println("\t 2:Jaune");
			System.out.println("\t 3:Bleu");
			Scanner sc = new Scanner(System.in);
			
			try
			{
				System.out.println("Saisissez le premier pion : ");
			    int p1 = sc.nextInt();
			    essai.getPion(1).converIntCouleur(p1);
			    System.out.println("Saisissez le deuxieme pion : ");
			    int p2 = sc.nextInt();
			    essai.getPion(2).converIntCouleur(p2);
			    System.out.println("Saisissez le troisieme pion : ");
			    int p3 = sc.nextInt();
			    essai.getPion(3).converIntCouleur(p3);
			    System.out.println("Saisissez le quatrieme pion : ");
			    int p4 = sc.nextInt();
			    essai.getPion(4).converIntCouleur(p4);
			}
			catch(InvalidParametersException e){ }
		
			Evaluation e1 = new Evaluation(essai,aTrouver);
			System.out.println(e1.toString()+"\n");
		
			
			
		}while(!essai.equals(aTrouver));
		
		System.out.println("Partie Fini !!!");
		
		
	}
	
}

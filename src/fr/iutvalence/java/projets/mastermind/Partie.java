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
	private Combinaison aTrouver;

	/**
	 * le joueur
	 */
	private Joueur player;
	
	
	/**
	 * le nombre de coups d'essai
	 */
	private int coups;

	// FIXME détailler le commentaire
	/**
	 * création d'une partie qui prend en parametre un joueur, qui génére
	 * automatiquement combinaison ,
	 */
	public Partie(Joueur player) {
		
		//variables local
		
		this.aTrouver = new Combinaison();
		this.player=player;
		this.coups = 41;
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
	
	public Combinaison getSolut(){

			return this.aTrouver;
		

	}

	// FIXME Il faut se rendre indépendant de l'entrée standard
	public void jouer()
	{
		int Points = 980;		
		//Combinaison aTrouver=new Combinaison();
		
		//declaration de l'objet Combinaison essai
		Combinaison essai= new Combinaison();
				
		System.out.println(this.aTrouver);
		System.out.println("MASTERMIND");
		do
		{	
				essai= new Combinaison();
			
			System.out.println(essai+"\n");
			Evaluation e1 = new Evaluation(essai,this.aTrouver);
			System.out.println(e1.toString()+"\n");
			this.player.setScore(e1.nbPoints());
			Points = Points - 20;
			
			this.coups-- ; 
		}while((this.coups!= 0) && (!essai.equals(this.aTrouver)));
		Points = Points + this.player.getScore();
		System.out.println("Votre score est de " + Points + " points.");
		if (!essai.equals(this.aTrouver))
			System.out.println("Vous n'avez pas trouvez la solution");
		else
			System.out.println("Vous avez trouvez la solution");
		
		System.out.println("Partie terminée !!!");
		
		
	}
	
}

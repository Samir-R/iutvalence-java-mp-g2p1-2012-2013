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
	 * la combinaison d'essai
	 */
	private Combinaison essai;

	/**
	 * l'evaluation
	 */
	private Evaluation eval;


	/**
	 * le joueur
	 */
	private Joueur player;
	
	
	/**
	 * le nombre de coups d'essai
	 */
	private int coups;
	
	/**
	 * le nombre de points final qui decremente de 25 à chaque coups d'essai
	 */
	private int pointsFinal;
	
	

	// FIXME détailler le commentaire
	/**
	 * création d'une partie qui prend en parametre un joueur, qui génére
	 * automatiquement combinaison la combinaison aTrouver
	 */
	public Partie(Joueur player) {
		
		this.aTrouver = new Combinaison();
		this.player=player;
		this.pointsFinal = 100;
		this.coups = 0;
		
	}
	
	
	/**
	 * création d'une partie qui prend en parametre le pseudo du joueur 
	 * et le crée à partir de celui-ci, et qui génére
	 * automatiquement la combinaison aTrouver
	 */
	public Partie(String pseudo) {
		
		this.aTrouver = new Combinaison();
		this.essai = new Combinaison();
		this.player=new Joueur(pseudo);
		this.pointsFinal = 100;
		this.coups = 0;
		
	}
	
	
	
	
	
	//retourne la combinaison a trouver
	public Combinaison getSolut(){

			return this.aTrouver;
		

	}
	

	//retourne la combinaison essai
	public Combinaison getEssai(){

		return this.essai;
	

	}
	
	//retourne le joueur
		public Joueur getJoueur(){

				return this.player;
			

		}
		
		
	//retourne l'evaluation
	public Evaluation getEval(){

		return this.eval;
	

	}

	//permet de lancer une evaluation et appelle la fonction increment()
	public void setEval(){

		this.eval = new Evaluation(this.essai,this.aTrouver);
		gestScore();
		increment();
		
	}

	// retourne Vrai tantque evalNbcoups()(est vrai) ou pasTrouve()(rend vrai)
	public boolean jouer()
	{
		
		
		while((this.evalNbcoups()) && (pasTrouve()))
		{
			return true;
		}
		this.gestScoreFinal();
		return false;
		
	}
	
	// retourne Vrai tantque le coups < 5
		public boolean evalNbcoups()
		{
			
			
			while(this.coups < 5 ) 
			{
				return true;
			}
			return false;
			
		}
		
		// retourne Vrai tantque la sotuion n'est pas trouvée
		public boolean pasTrouve()
		{
					
					
			while((!this.essai.equals(this.aTrouver))) 
			{
				return true;
			}
				return false;
				
		}
		
		//fonction qui incremente le nombre de coups et appelle la fonction jouer()(pour l'actualiser)
		public void increment(){

			this.coups ++;
			this.pointsFinal = this.pointsFinal - 20;
			jouer();			
		}
		

		//fonction qui gere les Pionts
		public void gestScore(){

			
			this.player.setScore(this.eval.nbPoints());
						
		}

		//fonction qui ajoute les Pionts Final
		public void gestScoreFinal(){

			this.player.setScore(this.pointsFinal);
		}			
		
	/*
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
		
		
	}*/
	
}

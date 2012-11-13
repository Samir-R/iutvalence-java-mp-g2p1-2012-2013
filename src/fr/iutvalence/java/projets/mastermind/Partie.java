package fr.iutvalence.java.projets.mastermind;

import java.util.Random;
import java.util.Scanner;


/** Une partie est composée d'une combinaison à trouver, d'une série combinaison essai
 *  saisie par le joueur  
 * @author merahme
 *
 */
public class Partie {

/**	
*  la combinaison à trouver
*/	//private Combinaison aTrouver;
	

	
/**	
 * la combinaison proposée par le joueur durant une partie
 * 
*/
// FIXME attribut ou variable locale à une méthode ?
//private Combinaison essai;

    
	
    
// FIXME détailler le commentaire
/**	
 * création d'une partie qui prend en parametre un joueur, qui génére automatiquement combinaison ,
*/ public Partie (){
    	
	//Joueur player ajouté en parametre
	
	
	// création des pions, à partir des "couleurs" générées precedemment, composant 
	// la combinaison aTrouver 
	/*	Pion p1 = new Pion(num1);
	Pion p2 = new Pion(num2);
	Pion p3 = new Pion(num3);
	Pion p4 = new Pion(num4);
  */
	
	//declaration de l'objet combinaison aTrouver à partir des pions crées precedemment **/
	//Combinaison aTrouver= null;
	
	
	
	
	
	    	
    }


	//FIXME méthodes jouer...
	public void jouer()
	{
				
		Pion pionParDef = new Pion(Couleur.BLEU);
		Combinaison aTrouver=new Combinaison(pionParDef,pionParDef,pionParDef,pionParDef);
		
		//declaration de l'objet Combinaison essai
		Combinaison essai= new Combinaison(pionParDef,pionParDef,pionParDef,pionParDef);
				
		Random rnd1 = new Random();
		Random rnd2 = new Random();
		Random rnd3 = new Random();
		Random rnd4 = new Random();
		
		//"couleur" du premier pion généré aleatoirement
		int num1 = rnd1.nextInt(3);
		
		//"couleur" du deuxieme pion généré aleatoirement
		int num2 = rnd2.nextInt(3);
		
		//"couleur" du troisieme pion généré aleatoirement
		int num3 = rnd3.nextInt(3);
		
		//"couleur" du dernier pion généré aleatoirement
		int num4 = rnd4.nextInt(3);
		
		try
		{
			aTrouver.getPion(1).converIntCouleur(num1);
			aTrouver.getPion(2).converIntCouleur(num2);
			aTrouver.getPion(3).converIntCouleur(num3);
			aTrouver.getPion(4).converIntCouleur(num4);
		}
		catch(InvalidParametersException e){ }
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

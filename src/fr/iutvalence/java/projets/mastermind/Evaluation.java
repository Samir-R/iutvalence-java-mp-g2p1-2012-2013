package fr.iutvalence.java.projets.mastermind;

// FIXME remarque : l'évaluation ne peut pas être qu'une valeur. Elle représente le nombre de pions présents ou présents et bien placés.

//FIXME Respecter la syntaxe JavaDoc



// FIXME réécrire le commentaire (à discuter)
/**
 * classe qui rend un objet vérifiant les règles du mastermind ! 		
 * 			 noir = dans la combinaison mais pas au bon endroit
 * 			 blanc = dans la combinaison au bon endroit  
 * **/
public class Evaluation {
	

	/**	
	 * definition de la constante valeur NUL 
	 */
	public final static int NUL = 0;

	/**
	 * 	 definition de la constante valeur NOIR 
	 */
	public final static int NOIR = 1;
	
	/**	
	 * definition de la constante valeur BLANC 
	 */
	public final static int BLANC = 2;
	
	
	// FIXME remplacer les 4 attributs par un seul (tableau)
/**
 * definition de la valeur d'evaluation du pion 1
*/
	private int valeur1;
	
/**
 * definition de la valeur d'evaluation du pion 2
*/	
	private int valeur2;
		
/**
 *  definition de la valeur d'evaluation du pion 3
*/	
	private int valeur3;
		
/**
 *  definition de la valeur d'evaluation du pion 4
*/	
	private int valeur4;


/**
 * Constructeur d'une Evaluation selon la combinaison essai et la combinaison  
 * solution en parametre.
 * Explication:
 * 				 noir = dans la combinaison mais pas au bon endroit
 *	 			 blanc = dans la combinaison au bon endroit 
 *				 nul = pas au bon endroit et pas dans la combinaison
 * @param essai
 * @param solut
 */
	public Evaluation(Combinaison essai,Combinaison solut)
	{
		if (essai.equals(solut))
		{	
			valeur1=BLANC;
			valeur2=BLANC;
			valeur3=BLANC;
			valeur4=BLANC;
		
			return;
		}
		
		try {
			if (essai.getPion(1)==solut.getPion(1))
				valeur1=BLANC;
			else
			{
				if ((essai.getPion(1)==solut.getPion(2)) 
					|| (essai.getPion(1)==solut.getPion(3)) 
					|| (essai.getPion(1)==solut.getPion(4)))
					valeur1=NOIR;
				else
					valeur1=NUL;
			}
		} 
		catch (InvalidParametersException e) 
		{
			// on peut ignorer l'exception car un objet Combinaison a exactement 4 pions
		}		
		
		
		try {
			if (essai.getPion(2)==solut.getPion(2))
				valeur1=BLANC;
			else
			{
				if ((essai.getPion(2)==solut.getPion(1)) 
					|| (essai.getPion(2)==solut.getPion(3)) 
					|| (essai.getPion(2)==solut.getPion(4)))
					valeur1=NOIR;
				else
					valeur1=NUL;
			}
		} catch (InvalidParametersException e) 
		{
			// on peut ignorer l'exception car un objet Combinaison a exactement 4 pions
		}	
		
		try {
			if (essai.getPion(3)==solut.getPion(3))
				valeur1=BLANC;
			else
			{
				if ((essai.getPion(3)==solut.getPion(1)) 
					|| (essai.getPion(3)==solut.getPion(2)) 
					|| (essai.getPion(3)==solut.getPion(4)))
					valeur1=NOIR;
				else
					valeur1=NUL;
			}
		} catch (InvalidParametersException e) 
		{
			// on peut ignorer l'exception car un objet Combinaison a exactement 4 pions
		}	
		
		try {
			if (essai.getPion(4)==solut.getPion(4))
				valeur1=BLANC;
			else
			{
				if ((essai.getPion(4)==solut.getPion(1)) 
					|| (essai.getPion(4)==solut.getPion(2)) 
					|| (essai.getPion(4)==solut.getPion(3)))
					valeur1=NOIR;
				else
					valeur1=NUL;
			}
		} catch (InvalidParametersException e) 
		{
			// on peut ignorer l'exception car un objet Combinaison a exactement 4 pions
		}	
		
			
	}
	

	// redéfinition de la methode toString
	
	public String toString(){
		  return "\tPion 1 : "+this.valeur1+" , Pion 2 : "+this.valeur2+" , Pion 3 : "+this.valeur3+" , Pion 4 : "+this.valeur4;
		  }

	
	
	// FIXME écrire une application qui teste le constructeur dans des cas bien choisis
	
	
	

}

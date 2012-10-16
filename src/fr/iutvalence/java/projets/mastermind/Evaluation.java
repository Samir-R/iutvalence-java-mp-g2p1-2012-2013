package fr.iutvalence.java.projets.mastermind;

// FIXME remarque : l'évaluation e peut pas être qu'une valeur. Elle représente le nombre de pions présents ou présents et bien placés.

//FIXME Respecter la syntaxe JavaDoc



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
		
		}
		
		if (essai.getPion1()==solut.getPion1())
			valeur1=BLANC;
		else
		{
			if ((essai.getPion1()==solut.getPion2()) 
				|| (essai.getPion1()==solut.getPion3()) 
				|| (essai.getPion1()==solut.getPion4()))
				valeur1=NOIR;
			else
				valeur1=NUL;
		}		
		
		if (essai.getPion2()==solut.getPion2())
			valeur2=BLANC;
		else
		{
			if ((essai.getPion2()==solut.getPion1()) 
				|| (essai.getPion2()==solut.getPion3()) 
				|| (essai.getPion2()==solut.getPion4()))
				valeur2=NOIR;
			else
				valeur2=NUL;
		}	
		
		
		
		if (essai.getPion3()==solut.getPion3())
			valeur3=BLANC;
		else
		{
			if ((essai.getPion3()==solut.getPion2()) 
				|| (essai.getPion3()==solut.getPion1()) 
				|| (essai.getPion3()==solut.getPion4()))
				valeur3=NOIR;
			else
				valeur3=NUL;
		}	
		
		
		if (essai.getPion4()==solut.getPion4())
			valeur4=BLANC;
		else
		{
			if ((essai.getPion4()==solut.getPion2()) 
				|| (essai.getPion4()==solut.getPion3()) 
				|| (essai.getPion4()==solut.getPion1()))
				valeur4=NOIR;
			else
				valeur4=NUL;
		}	
		
		
	}
	

	// redéfinition de la methode toString
	
	public String toString(){
		  return "\tPion 1 :"+this.valeur1+", Pion 2 :"+this.valeur2+", Pion 3 :"+this.valeur3+", Pion 4 :"+this.valeur4;
		  }

	
	
	
	
	

}

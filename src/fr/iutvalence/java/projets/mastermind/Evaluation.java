package fr.iutvalence.java.projets.mastermind;


/**
 * classe qui rend un objet vérifiant les règles du mastermind ! 		
 * 			 noir = dans la combinaison mais pas au bon endroit
 * 			 blanc = dans la combinaison au bon endroit  
 * **/
public class Evaluation {
	


/**
 * definition de la valeur d'evaluation du pion 1
*/
	private Couleur valeur1;
	
/**
 * definition de la valeur d'evaluation du pion 2
*/	
	private Couleur valeur2;
		
/**
 *  definition de la valeur d'evaluation du pion 3
*/	
	private Couleur valeur3;
		
/**
 *  definition de la valeur d'evaluation du pion 4
*/	
	private Couleur valeur4;


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
		
		Pion tabPionFaux[] = new Pion[4];
		if (essai.equals(solut))
		{	
			valeur1=Couleur.BLANC;
			valeur2=Couleur.BLANC;
			valeur3=Couleur.BLANC;
			valeur4=Couleur.BLANC;
		
			return;
		}
		
		else 
			try {	
		{
			//Premier passage pour trier les pions dans les tableaux correspondant selon leur valeur 
			
			int f = 0;
			if (essai.getPion(1).equals(solut.getPion(1)))
			{
				valeur1=Couleur.BLANC;
				
			}
			else
			{
				tabPionFaux[f]=solut.getPion(1);
				f++;
			}
			
			if (essai.getPion(2).equals(solut.getPion(2)))
			{
				valeur2=Couleur.BLANC;
				
			}
			else
			{
				tabPionFaux[f]=solut.getPion(2);
				f++;
			}
			
			if (essai.getPion(3).equals(solut.getPion(3)))
			{
				valeur3=Couleur.BLANC;
				
			}
			else
			{
				tabPionFaux[f]=solut.getPion(3);
				f++;
			}
			
			if (essai.getPion(4).equals(solut.getPion(4)))
			{
				valeur4=Couleur.BLANC;
				
			}
			else
			{
				tabPionFaux[f]=solut.getPion(4);
				f++;
			}
			// Deuxieme passage ...
			
			
			if (!(essai.getPion(1).equals(solut.getPion(1))))// si different alors present dans tableau
			{
				for(Pion p : tabPionFaux)
				{
					if (essai.getPion(1).equals(p))
					{
						valeur1=Couleur.NOIR;
						//supprimer p
					}
				}
				if (valeur1!=Couleur.NOIR)
					valeur1=Couleur.NUL;
			}
			
			if (!(essai.getPion(2).equals(solut.getPion(2))))// si different alors present dans tableau
			{
				for(Pion p : tabPionFaux)
				{
					if (essai.getPion(2).equals(p))
					{
						valeur2=Couleur.NOIR;
						//supprimer p
					}
				}
				if (valeur2!=Couleur.NOIR)
					valeur2=Couleur.NUL;
			}
			
			if (!(essai.getPion(3).equals(solut.getPion(3))))// si different alors present dans tableau
			{
				for(Pion p : tabPionFaux)
				{
					if (essai.getPion(3).equals(p))
					{
						valeur3=Couleur.NOIR;
						//supprimer p
					}
				}
				if (valeur3!=Couleur.NOIR)
					valeur3=Couleur.NUL;
			}
			
			if (!(essai.getPion(4).equals(solut.getPion(4))))// si different alors present dans tableau
			{
				for(Pion p : tabPionFaux)
				{
					if (essai.getPion(4).equals(p))
					{
						valeur4=Couleur.NOIR;
						//supprimer p
					}
				}
				if (valeur4!=Couleur.NOIR)
					valeur4=Couleur.NUL;
			}
			
		}
		}
		catch (InvalidParametersException e) {}
					
	}
	

	// redéfinition de la methode toString
	
	public String toString(){
		  return "\tPion 1 : "+this.valeur1+" , Pion 2 : "+this.valeur2+" , Pion 3 : "+this.valeur3+" , Pion 4 : "+this.valeur4;
		  }
}

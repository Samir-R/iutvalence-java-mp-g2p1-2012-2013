package fr.iutvalence.java.projets.mastermind;

/** Une combinaison est definit par une liste de quatre pion
 *  
 * @author merahme
 *
 */
public class Combinaison {
	
	
/**	 
 * definition du premier pion de la combinaison
*/	
	private Pion pion1;

	
/**	 
 * definition du deuxieme pion de la combinaison
*/
	private Pion pion2;
	
	
/**	 
 * definition du troisieme pion de la combinaison
*/	
	private Pion pion3;
	
	
/** 
 * definition du dernier pion de la combinaison
*/
	private Pion pion4;
	
	
	/** 
	 * Constructeur de combinanison avec ses 4 pions pris en parametres
	*/
	public Combinaison (Pion p1, Pion p2, Pion p3, Pion p4){
		pion1=p1;
		pion2=p2;
		pion3=p3;
		pion4=p4;
	 }
	
	
	//Retourne la valeur du pion1
	  public Pion getPion1()
	  {
	    return pion1;
	  }

	//Retourne la valeur du pion2
	  public Pion getPion2()
	  {
	    return pion2;
	  }
	  
	//Retourne la valeur du pion3
	  public Pion getPion3()
	  {
	    return pion3;
	  }
	  
	//Retourne la valeur du pion4
	  public Pion getPion4()
	  {
	    return pion4;
	  }
	
	
		// redéfinition de la methode equals
	public boolean equals(Object obj) {
		  //On vérifie si les références d'objets sont identiques
		  if (this == obj)
		    return true;

		  //On vérifie si l'objet passé en paramètre est null
		  if (obj == null)
		    return false;

		  //On s'assure que les objets sont du même type, ici de type Ville
		  if (getClass() != obj.getClass())
		    return false;

		  //Maintenant, on compare les attributs de nos objets
		  Combinaison solut = (Combinaison) obj;
		  if (!pion1.equals(solut.pion1))
				return false;
		  if (!pion2.equals(solut.pion2))
				return false;
		  if (!pion3.equals(solut.pion3))
				return false;
		  if (!pion4.equals(solut.pion4))
				return false;
					
			return true;
				
		}	

	
	
	// FIXME redéfinir la méthode toString pour avoir une version affichable de la combinaison
}

package fr.iutvalence.java.projets.mastermind;

/** Une combinaison est definie par quatre pions
 *  
 * @author merahme
 *
 */
public class Combinaison {
	
	
	// FIXME remplacer les 4 attributs par un seul attribut (tableau)
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
	// FIXME remplacer les 4 paramètres par un seul tableau et soulever une exception si il n'y a pas exactement 4 pions dans le tableau
	public Combinaison (Pion p1, Pion p2, Pion p3, Pion p4){
		pion1=p1;
		pion2=p2;
		pion3=p3;
		pion4=p4;
	 }
	
	
	// FIXME remplacer par une seule méthode getPion(int), soulevant une exception si le numéro est invalide
	//Retourne la valeur du pion1
	
	

	  public Pion getPion(int p) throws InvalidParametersException {
	 
		  if (p==1)
			return this.pion1;
		  
		  if (p==2)
				return this.pion2;
		  
		  if (p==3)
				return this.pion3;
		  
		  if (p==4)
				return this.pion4;
		  else 
			  throw new InvalidParametersException();
	
		  
	  }

	
	
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		  //On vérifie si les références d'objets sont identiques
		  if (this == obj)
		    return true;

		  //On vérifie si l'objet passé en paramètre est null
		  if (obj == null)
		    return false;

		  //On s'assure que les objets sont du même type
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
	public String toString(){
		  return "Pion 1 :"+this.pion1.getCouleur()+", Pion 2 :"+this.pion2.getCouleur()+", Pion 3 :"+this.pion3.getCouleur()+", Pion 4 :"+this.pion4.getCouleur();
		  }
	
	
}

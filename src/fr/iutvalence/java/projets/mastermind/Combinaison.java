package fr.iutvalence.java.projets.mastermind;

// FIXME écrire un commentaire 
public class Combinaison {
	// FIXME respecter la syntyaxe JavaDoc 
	// definition du premier pion de la combinaison
	private Pion pion1;

	// FIXME respecter la syntyaxe JavaDoc
	// definition du deuxieme pion de la combinaison
	private Pion pion2;
	
	// FIXME respecter la syntyaxe JavaDoc
	// definition du troisieme pion de la combinaison
	private Pion pion3;
	
	// FIXME respecter la syntyaxe JavaDoc
	// definition du dernier pion de la combinaison
	private Pion pion4;
	
	// FIXME respecter la syntyaxe JavaDoc
	// FIXME compléter le commentaire
	// Constructeur de combinanison avec parametre
	public Combinaison (Pion p1, Pion p2, Pion p3, Pion p4){
		pion1=p1;
		pion2=p2;
		pion3=p3;
		pion4=p4;
	 }
	
	// FIXME il serait bien de disposer en plus d'une méthode qui renvoie un résultat exploitable (nombres de pions bons et/ou bien placés) sous la forme d'un objet
	
	// FIXME l'équivalence proposée ici repose sur l'équivalence de pions. Il faudrait redéfinir equals correctement dans la classe pion 
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

package fr.iutvalence.java.projets.mastermind;
// FIXME réfléchir à l'utilité de cette classe


//FIXME écrire un commentaire
public class Pion {
	
	
// FIXME redéfinir couleur sous la forme d'une énumération
/**
 *  definition de la constante couleur ROUGE 
 */
	//public final static int ROUGE = 0;
	
/**	definition de la constante couleur VERT 
 * 
 */
	//public final static int VERT = 1;
	
/**	
 * definition de la constante couleur JAUNE 
 */
	//public final static int JAUNE = 2;

/**	
 * definition de la constante couleur BLEU 
 */
	//public final static int BLEU = 3;
	
	
// FIXME corriger le commentaire 
/**	
 * definition de la variable couleur 
 */
	private Couleur couleur;
	 
/**	
 * Constructeur de pion à partir d'un entier representant sa couleur
 */
	 public Pion(Couleur color){
		 couleur=color;		 
	 }
	 
	 //FIXME obtenir la couleur ?
	 public Couleur getCouleur(){
		  return this.couleur;
		  }

	 
	
	 
	 // FIXME redéfinir equals
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
		  
		  
		  Pion p = (Pion) obj;
		  if (this.couleur!=p.couleur)
				return false;
		  					
			return true;
				
		}	
	 
	 
	 
	 // FIXME redéfinir hashCode
	 
	 
	 
	 
	 
	 // FIXME redéfinir toString (et tester)
	 public String toString(){
		  return "La couleur du pion est "+this.couleur;
		  }
	
	
	
	
}

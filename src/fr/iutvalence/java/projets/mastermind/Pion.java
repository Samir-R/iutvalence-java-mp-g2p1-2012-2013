package fr.iutvalence.java.projets.mastermind;
/**
 * Classe permettant d'instancier des objets pions.
 * Ces objets pions composerons une combinaison.
 *  
 * @author merahme
 *
 */
public class Pion {
	
	

/**	
 * definition de la variable couleur 
 */
	private Couleur couleur;
	 
/**	
 * Constructeur de pion à partir d'une couleur(presente dans l'enumeration Couleur) 
 * 
 */
	 public Pion(Couleur color){
		 couleur=color;		 
	 }
	 
	 
	 public Couleur getCouleur(){
		  return this.couleur;
		  }

	 
	
	 
	 // redéfinition de la methode equals
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
	 
	 
	 
	 // redéfinir hashCode
	 
	 
	 
	 
	 
	 //redéfinition de la methode toString
	 public String toString(){
		  return "La couleur du pion est "+this.couleur;
		  }
	
	 
 public void converIntCouleur(int c){
		 
		 if (c==0)
			couleur=Couleur.ROUGE;
		 if (c==1)
			 couleur=Couleur.VERT;
		 if (c==2)
			 couleur=Couleur.JAUNE;
		 if (c==3)
			 couleur=Couleur.BLEU;
		  }
	
	
	
}

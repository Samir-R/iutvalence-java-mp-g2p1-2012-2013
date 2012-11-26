package fr.iutvalence.java.projets.mastermind;



/**
 * Classe permettant d'instancier des objets pions. Ces objets pions composerons
 * une combinaison.
 * 
 * @author merahme
 * 
 */
public class Pion {

	/**
	 * definition de la variable couleur
	 */
	private final Couleur couleur;

	/**
	 * Constructeur de pion par défaut qui genere un pion aleatoirement
	 * 
	 * 
	 */
	public Pion() {
		
		//"couleur" du pion généré aleatoirement
		
		this.couleur = Couleur.alea();
		}
	
	/**
	 * Constructeur de pion à partir d'une couleur(presente dans l'enumeration
	 * Couleur)
	 * 
	 */
	public Pion(Couleur color) {
		this.couleur = color;
	}

	// FIXME commentaire
	public Couleur getCouleur() {
		return this.couleur;
	}

	
	
	public int hashCode() {
        int hash = 1;
        switch(this.couleur)
		{
			case  ROUGE : 	return  hash;
			case  JAUNE : 	return (hash*2);
			case  BLEU  : 	return (hash*3);
			default : 		return (hash*4);
		}
    }
	
	
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		// On vérifie si les références d'objets sont identiques
		if (this == obj)
			return true;

		// On vérifie si l'objet passé en paramètre est null
		if (obj == null)
			return false;

		// On s'assure que les objets sont du même type
		if (getClass() != obj.getClass())
			return false;

		// Maintenant, on compare les attributs de nos objets

		Pion p = (Pion) obj;
		if (this.couleur != p.couleur)
			return false;

		return true;

	}

	// FIXME redéfinir hashCode

	// redéfinition de la methode toString
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "La couleur du pion est " + this.couleur;
	}



}

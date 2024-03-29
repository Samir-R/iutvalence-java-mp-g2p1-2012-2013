package fr.iutvalence.java.projets.mastermind;

/**
 * Une combinaison est definie par quatre pions
 * 
 * @author merahme
 * 
 */
public class Combinaison {

	/**
	 * definition du tableau contenant les 4 pions de la combinaison
	 */
	private Pion[] pions;
	
	/**
	 * le nombre de coups d'essai de pion sur une combinaison(jamais < 3)
	 */
	private int coupPion;

	/**
	 * Constructeur de combinanison par default qui utilise le constructeur de
	 * pion par defaut
	 */
	public Combinaison() {
		this.pions = new Pion[4];
		for (int i = 0; i <= 3; i++) {
			this.pions[i] = new Pion();
		}
		this.coupPion = 0;

	}

	/**
	 * Constructeur de combinanison avec ses 4 pions pris en parametres
	 */
	public Combinaison(Pion p1, Pion p2, Pion p3, Pion p4) {

		Pion tabPionCreat[] = { p1, p2, p3, p4 };

		for (int i = 1; i <= 4; i++) {
			this.pions[i] = tabPionCreat[i];
		}
		this.coupPion = 0;

	}

	public Pion getPion(int p) throws InvalidParametersException {

		if (p >= 1 && p <= 4)
			return this.pions[p - 1];
		else
			throw new InvalidParametersException();

	}
	
	//methode permetant de saisir le pion de la combinaison à l'indice i et mdofie ainsi le 
	/*public void setPion(int i, Pion p){


		
		this.pions[i-1]=p;
		if (this.coupPion != 3)
			this.coupPion ++;
		else
			this.coupPion = 0;
	}*/
	//methode permetant de saisir le pion de la combinaison à l'indice i et mdofie ainsi le
		public void setPion(int i, Pion p){



			this.pions[i-1]=p;
			if (evalCoupPion())
				this.coupPion ++;
		}
	
	public int getCoupPion(){

		return this.coupPion;
		

	}

	/**
	 * @see java.lang.Object#hashCode(java.lang.Object)
	 */
	
	public int hashCode() {
        int hash = 1;
	
	for(int i = 0; i < 5; i++){
        switch(this.pions[i].getCouleur())
		{
			case  ROUGE : 	hash =	hash *	1;
			case  JAUNE : 	hash =	hash *	2;
			case  BLEU  : 	hash =	hash *	3;
			default : 		hash =	hash *	4;
		}
    	}

	return hash;
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

		Combinaison solut = (Combinaison) obj;
		if (!pions[0].equals(solut.pions[0]))
			return false;
		if (!pions[1].equals(solut.pions[1]))
			return false;
		if (!pions[2].equals(solut.pions[2]))
			return false;
		if (!pions[3].equals(solut.pions[3]))
			return false;

		return true;

	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Pion 1 :" + this.pions[0].getCouleur() + ", Pion 2 :"
				+ this.pions[1].getCouleur() + ", Pion 3 :"
				+ this.pions[2].getCouleur() + ", Pion 4 :"
				+ this.pions[3].getCouleur();
	}
	
	
	//Methode evaluant CoupPion
	/*public boolean evalCoupPion()
	{
		
		
		if (this.coupPion != 3)
			return true;
		else
			return false;
		
	}*/
	
	//Methode evaluant CoupPion
		public boolean evalCoupPion()
		{


			if (this.coupPion != 4)
				return true;
			else
			{
				this.coupPion = 0;
				return false;
				}

		}


}

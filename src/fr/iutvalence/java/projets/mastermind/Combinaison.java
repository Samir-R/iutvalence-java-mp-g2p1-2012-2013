package fr.iutvalence.java.projets.mastermind;

// FIXME écrire un commentaire 
public class Combinaison {
	// FIXME écrire un commentaire
	private Pion pion1;
	// FIXME écrire un commentaire
	private Pion pion2;
	// FIXME écrire un commentaire
	private Pion pion3;
	// FIXME écrire un commentaire
	private Pion pion4;
	
	// FIXME écrire un commentaire
	public Combinaison (Pion p1, Pion p2, Pion p3, Pion p4){
		pion1=p1;
		pion2=p2;
		pion3=p3;
		pion4=p4;
	 }

	// FIXME écrire un commentaire
	// FIXME le constructeur sans paramètre a t'il vraiment un sens si on fixe ces valeurs par défaut ?
	
	public Combinaison (){
		pion1=new Pion(Pion.ROUGE);
		pion2=new Pion(Pion.VERT);
		pion3=new Pion(Pion.JAUNE);
		pion4=new Pion(Pion.BLEU);
	 }
	
	
	// FIXME il serait bien de disposer en plus d'une méthode qui renvoie un résultat exploitable (nombres de pions bons et/ou bien placés) sous la forme d'un objet
	// FIXME remplacer par la redéfinition de la méthode equals de la classe Object
	public boolean egalite(Combinaison solut) {		
		//on compare les attributs de nos combinaisons
		
		// FIXME attention !!! La comparaison == / != est une comparaison de références et non d'état
		// FIXME il faut s'appuyer sur une redéfinition de la méthode equals dans la classe Pion
		if (this.pion1 != solut.pion1)
			return false;
		if (this.pion2 != solut.pion2)
			return false;
		if (this.pion3 != solut.pion3)
			return false;
		if (this.pion4 != solut.pion4)
			return false;
				
		return true;
	}
	
	
	
	public Combinaison correc(Combinaison solut) {		
		
		//on compare les attributs de nos objets
		Combinaison verif = new Combinaison();
		
		
		// FIXME il faut vérifier les règles du mastermind ! 
		// noir = dans la combinaison mais pas au bon endroit
		// blanc = dans la combinaison au bon endroit 
		
		
		if (this.pion1 != solut.pion1)
			verif.pion1.setColor(Pion.NOIR);
		else
			verif.pion1.setColor(Pion.BLANC);
		
		if (this.pion2 != solut.pion2)
			verif.pion2.setColor(Pion.NOIR);
		else
			verif.pion2.setColor(Pion.BLANC);
		
		if (this.pion3 != solut.pion3)
			verif.pion3.setColor(Pion.NOIR);
		else
			verif.pion3.setColor(Pion.BLANC);
		
		if (this.pion4 != solut.pion4)
			verif.pion4.setColor(Pion.NOIR);
		else
			verif.pion4.setColor(Pion.BLANC);
		
				
		return verif;
	}
	
	// FIXME redéfinir la méthode toString pour avoir une version affichable de la combinaison
}

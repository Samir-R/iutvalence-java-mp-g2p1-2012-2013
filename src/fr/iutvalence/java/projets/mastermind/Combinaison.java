package fr.iutvalence.java.projets.mastermind;

// FIXME écrire un commentaire correct
public class Combinaison {
	private Pion pion1;
	private Pion pion2;
	private Pion pion3;
	private Pion pion4;
	
	public Combinaison (Pion p1, Pion p2, Pion p3, Pion p4){
		pion1=p1;
		pion2=p2;
		pion3=p3;
		pion4=p4;
	 }

	public Combinaison (){
		pion1=new Pion(Pion.ROUGE);
		pion2=new Pion(Pion.VERT);
		pion3=new Pion(Pion.JAUNE);
		pion4=new Pion(Pion.BLEU);
	 }
	
	
	
	
	public boolean egalite(Combinaison solut) {		
		//on compare les attributs de nos combinaisons
		
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
}

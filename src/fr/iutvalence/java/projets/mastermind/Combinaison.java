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
		pion1=new Pion(ROUGE);
		pion2=new Pion(VERT);
		pion3=new Pion(JAUNE);
		pion4=new Pion(BLEU);
	 }
}

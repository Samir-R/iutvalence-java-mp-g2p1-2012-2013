package fr.iutvalence.java.projets.mastermind;
//FIXME écrire un commentaire correct
public class Pion {
	
	// FIXME definition d'une constante couleur
	public final static int ROUGE = 0;
	
	// FIXME definition d'une constante couleur
	public final static int VERT = 1;
	
	// FIXME definition d'une constante couleur
	public final static int JAUNE = 2;
	
	// FIXME definition d'une constante couleur
	public final static int BLEU = 3;
	
	// FIXME definition d'une constante couleur
	public final static int BLANC = 4;
		
	// FIXME definition d'une constante couleur
	public final static int NOIR = 5;
	
	// FIXME definition d'une variable couleur
	private int couleur;
	 
	// FIXME création d'un pion avec parametre
	 public Pion(int color){
		 couleur=color;		 
	 }
	 
	 
	//FIXME méthodes ?
	 
	//FIXME modification de couleur d'un pion
	 public void setColor(int nouvColor)
	 {
	          couleur = nouvColor;
	 }
	
	
}

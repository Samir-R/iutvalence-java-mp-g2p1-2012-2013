package fr.iutvalence.java.projets.mastermind;



public class Partie {

	private Combinaison aTrouver;
	private Joueur joueur;
    private Combinaison essai;
    
    public Partie (Joueur player){
    	
    	joueur=player;
    	aTrouver= new Combinaison();
    	
    }
	
	
}

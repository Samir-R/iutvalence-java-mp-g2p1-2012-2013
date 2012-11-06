package fr.iutvalence.java.projets.mastermind;

public enum Couleur {

	JAUNE("Jaune"),
	ROUGE("Rouge"),
	VERT("Vert"),
	BLEU("Bleu");
	
	private String color = "";
	   
	  //Constructeur
	  private Couleur(String color){
	    this.color = color;
	  }
	   
	  public String toString(){
	    return color;
	  }
	
}

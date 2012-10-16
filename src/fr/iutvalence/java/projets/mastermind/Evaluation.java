package fr.iutvalence.java.projets.mastermind;

// FIXME remarque : l'évaluation e peut pas être qu'une valeur. Elle représente le nombre de pions présents ou présents et bien placés.

//FIXME Respecter la syntaxe JavaDoc



//classe qui rend un objet vérifiant les règles du mastermind ! 
			// noir = dans la combinaison mais pas au bon endroit
			// blanc = dans la combinaison au bon endroit  **/
public class Evaluation {
	

	/**	definition de la constante valeur NUL **/
	public final static int NUL = 0;

	/**	FIXME definition de la constante valeur NOIR **/
	public final static int NOIR = 1;
	
	/**	FIXME definition de la constante valeur BLANC **/
	public final static int BLANC = 2;
	
	
	// FIXME écrire un commentaire
	private int valeur;


	// FIXME écrire un commentaire
	public Evaluation()
	{
		valeur=NUL;
	}
	
	
	
	// FIXME remplacer par un constructeur (on peut considérer qu'au moment de la création de l'évaluation, on passe les 2 combinaisons en paramètres)
	public Evaluation test(Combinaison essai,Combinaison solut)
	{
		
		
		
	}


	// FIXME redéfinir toString
}

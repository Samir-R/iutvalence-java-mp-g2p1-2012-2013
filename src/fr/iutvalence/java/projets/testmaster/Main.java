//FIXME à déplacer dans un autre paquetage
package fr.iutvalence.java.projets.testmaster;

import java.util.Random;

import fr.iutvalence.java.projets.mastermind.Couleur;

// FIXME commentaire
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*for (Couleur color : Couleur.values()) {
			System.out.println(color);
		}*/
		System.out.println(new Random().nextInt(8));
	}

}

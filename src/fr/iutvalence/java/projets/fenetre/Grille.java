package fr.iutvalence.java.projets.fenetre;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Grille extends JPanel {

	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		//g.drawString("Tiens ! Le Site du Zéro !", 10, 20);
		int uniteX = getWidth()/8;
		int uniteY = getHeight()/12;
		for(int i=0; i<12; i++){
			g.drawLine(uniteX*i, 0, uniteX*i, getHeight());
			g.drawLine(0, uniteY*i, getWidth(), uniteY*i);
		}
		//g.drawOval(8,5,40,40);
		
	}

}

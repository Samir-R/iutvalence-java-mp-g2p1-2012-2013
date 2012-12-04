package fr.iutvalence.java.projets.fenetre;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

 
public class PionImg extends JPanel implements Serializable {
	private int i;
    public PionImg(int i){
    	this.i=i;
    }  
 
    @Override
    protected void paintComponent(Graphics g) {
       // super.paintComponent(g);
    	try {
    		if (this.i==0)
    		{
    	      Image img = ImageIO.read(new File("vide.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==1)
    		{
    	      Image img = ImageIO.read(new File("pion_rouge.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==2)
    	      {	
    	    	  Image img = ImageIO.read(new File("pion_vert.jpg"));
        	      g.drawImage(img, 1, 1, 41, 40, this);
    	      }
    		if (this.i==3)
    		{
    	      Image img = ImageIO.read(new File("pion_jaune.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==4)
    		{
    	      Image img = ImageIO.read(new File("pion_bleu.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==5)
    		{
    	      Image img = ImageIO.read(new File("pion_blanc.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==6)
    		{
    	      Image img = ImageIO.read(new File("pion_noir.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==7)
    		{
    	      Image img = ImageIO.read(new File("pion_nul.jpg"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		//g.drawImage(img, 0, 0, this);
    	      //Pour une image de fond
    	      
    	    } catch (IOException e) {
    	      e.printStackTrace();
    	    }   
        /*
    	g.setColor(Color.RED);
        g.fillOval(10,10,40,40);      */
    }
}

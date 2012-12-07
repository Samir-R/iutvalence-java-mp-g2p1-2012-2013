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
    	      Image img = ImageIO.read(new File("Pion/pion-rouge.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==2)
    	      {	
    	    	  Image img = ImageIO.read(new File("Pion/pion-vert.JPG"));
        	      g.drawImage(img, 1, 1, 41, 40, this);
    	      }
    		if (this.i==3)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-jaune.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==4)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-bleu.JPG"));
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
    		if (this.i==8)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-gris.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==9)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-rose.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==10)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-violet.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==11)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-orange.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==12)
    		{
    	      Image img = ImageIO.read(new File("Pion/pion-noir.JPG"));
    	      g.drawImage(img, 1, 1, 41, 40, this);
    		}
    		if (this.i==13)
    		{
    	      Image img = ImageIO.read(new File("vert.gif"));
    	      g.drawImage(img, 1, 1, 50, 50, this);
    		}
    		
    		
    	      
    	    } catch (IOException e) {
    	      e.printStackTrace();
    	    }   
        
    }
}

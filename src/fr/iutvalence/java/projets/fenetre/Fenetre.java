package fr.iutvalence.java.projets.fenetre;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.iutvalence.java.projets.mastermind.Couleur;
import fr.iutvalence.java.projets.mastermind.Partie;
import fr.iutvalence.java.projets.mastermind.Pion;


public class Fenetre extends JFrame{ // implements ActionListener
	//definition du layout principal
	CardLayout cl = new CardLayout();
	//definition du conteneur principal
	JPanel content = new JPanel();
	  //Liste des noms de nos conteneurs pour la pile de cartes
	  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
	  int indice = 0;
	//zone de texte contenant le pseudo du joueur
	  private JTextField jtf = new JTextField("Joueur1");
	  

  private JButton verif = new JButton("Verifier");
  private Grille grille = new Grille();
  private JPanel containPartie = new JPanel();
  //Message de bienvenu
  private JLabel mess = new JLabel("");
  //message du score
  private JLabel messScore = new JLabel("Votre Score : 0");
  
//Tableau stockant les éléments à afficher sur les boutons
  //String[] tab_string = {"R", "B", "J", "V"};
  String[] tab_string = {"Pion/pion-rouge.JPG","Pion/pion-bleu.JPG","Pion/pion-jaune.JPG","Pion/pion-vert.JPG","Pion/pion-gris.JPG","Pion/pion-rose.JPG","Pion/pion-violet.JPG","Pion/pion-orange.JPG","Pion/pion-noir.JPG"};
  
  
  
  //color[] tab_color = {Color.RED, "Color.BLUE", "Color.YELLOW", "Color.GREEN"};
  //Un bouton par élément à afficher
  JButton[] tab_button = new JButton[tab_string.length];
  //Panel contenant les boutons
  JPanel PanBouton = new JPanel();
//Panel contenant les boutons de couleur
  JPanel PanBoutonColor = new JPanel();
  //dimension des bouton
  private Dimension dim = new Dimension(60, 50);
  //Tableau d'image de pion
  PionImg[] tab_pion= new PionImg[96];
  //Indice de Tableau tab_pion
  private int indPion;// = 0;
  //private int NbCoup;// = 0;//toujours <4
  

	
//Declaration de la partie
  Partie p;// = new Partie(player);
  
  
  
 public Fenetre(){
	  //Definition de la fenetre
    this.setTitle("MASTERMIND");
    this.setSize(600, 700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    
  //On crée trois conteneurs de couleur différente
    JPanel card1 = new JPanel();
    card1.setBackground(Color.blue);		
    JPanel card2 = new JPanel();
    card2.setBackground(Color.red);		
   
    JButton jouer = new JButton("Jouer");
    jouer.addActionListener(new BoutonListenerJouer());
    JButton start = new JButton("Commencez une Partie");
    start.addActionListener(new BoutonListenerStart());
    JButton rejouer = new JButton("Rejouer");
    rejouer.addActionListener(new BoutonListenerReStart());
    JButton quit = new JButton("Quitter la partie");
    quit.addActionListener(new BoutonListenerJouer());
    card1.add(jouer);
    
    Font pol = new Font("Arial", Font.BOLD, 14);
    jtf.setFont(pol);
    jtf.setPreferredSize(new Dimension(150, 30));
    jtf.setForeground(Color.BLUE);
   
    JLabel label = new JLabel("Entrez votre pseudo : ");
    JPanel top = new JPanel();
    top.add(label);
    top.add(jtf);
    top.setBackground(Color.cyan);
    card2.add(top, BorderLayout.NORTH);
    /*card2.setLayout(new GridLayout(1, 2));
    card2.add(jtf);
   */ card2.add(start);
 
     
    
   
    
    //
   //On définit la police d'écriture à utiliser
    Font police = new Font("Arial", Font.BOLD, 20);
    mess.setFont(police);
    //On aligne les informations au centre dans le JLabel
    mess.setHorizontalAlignment(JLabel.CENTER);
    mess.setPreferredSize(new Dimension(220, 20));
    mess.setForeground(Color.blue);
    
    messScore.setForeground(Color.cyan);
    JPanel PanScore = new JPanel();
    PanScore.add(messScore);
    PanScore.setBackground(Color.BLACK);
  
   //definition des boutons
    PanBoutonColor.setLayout(new GridLayout(3, 3));
    for(int i = 0; i < tab_string.length; i++){
      //  tab_button[i] = new JButton(tab_string[i]);
        tab_button[i]= new JButton(new ImageIcon(tab_string[i]));
        tab_button[i].setPreferredSize(dim);
        tab_button[i].addActionListener(new BoutonListenerPion());
        PanBoutonColor.add(tab_button[i]);
  
    }
    PanBouton.setLayout(new GridLayout(6, 4));
    PanBouton.add(PanBoutonColor);
    PanBouton.add(verif);
    PanBouton.add(rejouer);
    PanBouton.add(quit);
    
    
   //couleur --> PanBouton.setBackground(Color.white);
   
    
    //Initialisation du tableau tab_pion, avec l'image "vide.jpg"(à fond blanc)
    for(int i=0; i<tab_pion.length; i++){
    	tab_pion[i] = new PionImg(0);
	}
    
    grille.setLayout(new GridLayout(12, 8));
    
    //Initialise la grille à partir du tableau tab_pion
    for(int i=0; i<tab_pion.length; i++){
    	grille.add(tab_pion[i]);
	}
 
    
    verif.addActionListener(new BoutonListenerVerif());
    //verif.setEnabled(false);
    
    
    content.setLayout(cl);
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    
    
   // mess.setText("Bienvenu à toi,"+ player.getJoueur()+ ",prêt pour une partie?");
    
    
    containPartie.setBackground(Color.white);
    containPartie.setLayout(new BorderLayout());
    containPartie.add(grille, BorderLayout.CENTER);
    containPartie.add(mess, BorderLayout.NORTH);
    containPartie.add(PanBouton, BorderLayout.EAST);
    containPartie.add(PanScore, BorderLayout.SOUTH);
    
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    content.add(containPartie, listContent[2]);
    
    this.setContentPane(content);
    this.setVisible(true);  
    
    
    
  }
 
 
 

//Classe écoutant notre bouton vert
  class BoutonListenerPion implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	
	    	if(arg0.getSource() == tab_button[0]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.ROUGE));
		    	  tab_pion[indPion] = new PionImg(1);}
	    	
	    	if(arg0.getSource() == tab_button[1]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.BLEU));
				  tab_pion[indPion] = new PionImg(4);}
	    	
	    	if(arg0.getSource() == tab_button[2]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.JAUNE));
				  tab_pion[indPion] = new PionImg(3);}
	    	
	    	
	    	if(arg0.getSource() == tab_button[3]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.VERT));
				  tab_pion[indPion] = new PionImg(2);}
	    	
	    	if(arg0.getSource() == tab_button[4]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.GRIS));
				  tab_pion[indPion] = new PionImg(8);}
	    	
	    	if(arg0.getSource() == tab_button[5]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.ROSE));
				  tab_pion[indPion] = new PionImg(9);}
	    	
	    	if(arg0.getSource() == tab_button[6]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.VIOLET));
				  tab_pion[indPion] = new PionImg(10);}
	    	
	    	if(arg0.getSource() == tab_button[7]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.ORANGE));
				  tab_pion[indPion] = new PionImg(11);}
	    	
	    	if(arg0.getSource() == tab_button[8]){
				  grille.remove(tab_pion[indPion]);
				  p.getEssai().setPion(p.getEssai().getCoupPion()+1, new Pion(Couleur.NOIR));
				  tab_pion[indPion] = new PionImg(12);}
			
				
	    	
			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
			  for(int i=0; i<tab_pion.length; i++){
			    	grille.add(tab_pion[i]);
				}
			 indPion++;
			
			 if (!p.getEssai().evalCoupPion())
			 {
				 
				 for(int i=0; i<tab_button.length; i++){
					 tab_button[i].setEnabled(false);
					}
				
				 verif.setEnabled(true);
				 
			 }
			 
			 
			  grille.updateUI(); 
	    }
	  }
  
  
  
  
  
  
  
  
  
  
  
  //Classe écoutant notre bouton verif
  class BoutonListenerVerif implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	p.setEval();
	    	
	    	for(int j = 0; j <= 3; j++)
			{
	    		
	    	if (p.getEval().tabEval[j]== Couleur.BLANC)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(5);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}

	    		if (p.getEval().tabEval[j]== Couleur.NOIR)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(6);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}
	    		

	    		if (p.getEval().tabEval[j]== Couleur.NUL)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(7);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}
	    		
	    		
				

			}
	    	
	    	if (p.jouer()){
	    	for(int i=0; i<tab_button.length; i++){
				 tab_button[i].setEnabled(true);
				}
	    	messScore.setText("Votre Score : " + p.getJoueur().getScore());
	    	}
	    	else{
	    		messScore.setText("VOTRE SCORE FINAL : " + p.getJoueur().getScore());
	    	}
	    		
				 verif.setEnabled(false);
				// NbCoup=0;
				// p.getJoueur();
				 
				 
				 
			 
			  grille.updateUI(); 
	    }
	  }
  
  
  class BoutonListenerJouer implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	  public void actionPerformed(ActionEvent event){				
	        if(++indice > 2)
	          indice = 0;
	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	        jtf.setText("Joueur1");
	        cl.show(content, listContent[indice]);
	     }
	  }
  
  class BoutonListenerStart implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	  public void actionPerformed(ActionEvent event){				
	        if(++indice > 2)
	          indice = 0;
	        p = new Partie(jtf.getText());
	        System.out.println(p.getJoueur().getPseudo());
	        System.out.println(p.getSolut());
	        mess.setText("Bienvenue à toi "+ p.getJoueur().getPseudo()+ " ! Prêt pour une partie?");
	      
	        
	        //Réinitialisation du tableau tab_pion, avec l'image "vide.jpg"(à fond blanc)
	        for(int i=0; i<40; i++){
	        	grille.remove(tab_pion[i]);
	        	tab_pion[i] = new PionImg(0);
    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	        	for(int j=0; j<40; j++){
			    	grille.add(tab_pion[j]);
    				}
	        	
	        }
	      
	        //Réinitialisation du tableau tab_pion, avec l'image "vide.jpg"(à fond blanc)
	        for(int i=40; i<tab_pion.length; i++){
	        	grille.remove(tab_pion[i]);
	        	tab_pion[i] = new PionImg(13);
    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	        	for(int j=40; j<tab_pion.length; j++){
			    	grille.add(tab_pion[j]);
    				}
	        	
	        }
	        indPion = 0;
	        //Activation et desactivation des boutons
	        for(int i=0; i<tab_button.length; i++){
				 tab_button[i].setEnabled(true);
				}
	        verif.setEnabled(false);
	       // NbCoup = 0;
	       	        
	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	        cl.show(content, listContent[indice]);
	      }
	  }
  
  class BoutonListenerReStart implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	  public void actionPerformed(ActionEvent event){				
	        String RecupPseudo = p.getJoueur().getPseudo();
	        p = new Partie(RecupPseudo);
	        System.out.println(p.getJoueur().getPseudo());
	        System.out.println(p.getSolut());
	        mess.setText("Bienvenue à toi "+ p.getJoueur().getPseudo()+ " ! Prêt pour une partie?");
	      
	        
	        //Réinitialisation du tableau tab_pion, avec l'image "vide.jpg"(à fond blanc)
	        for(int i=0; i<40; i++){
	        	grille.remove(tab_pion[i]);
	        	tab_pion[i] = new PionImg(0);
  			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	        	for(int j=0; j<40; j++){
			    	grille.add(tab_pion[j]);
  				}
	        	
	        }
	      
	        //Réinitialisation du tableau tab_pion, avec l'image "vide.jpg"(à fond blanc)
	        for(int i=40; i<tab_pion.length; i++){
	        	grille.remove(tab_pion[i]);
	        	tab_pion[i] = new PionImg(13);
  			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	        	for(int j=40; j<tab_pion.length; j++){
			    	grille.add(tab_pion[j]);
  				}
	        	
	        }
	        indPion = 0;
	        //Activation et desactivation des boutons
	        for(int i=0; i<tab_button.length; i++){
				 tab_button[i].setEnabled(true);
				}
	        verif.setEnabled(false);
	       // NbCoup = 0;
	       	        
	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	        cl.show(content, listContent[indice]);
	      }
	  }

  
 
     
   
}

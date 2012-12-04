package fr.iutvalence.java.projets.fenetre;
import fr.iutvalence.java.projets.mastermind.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fenetre extends JFrame{ // implements ActionListener
 // private Panneau pan = new Panneau();
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	  //Liste des noms de nos conteneurs pour la pile de cartes
	  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
	  int indice = 0;
	//pseudo du joueur
	  private JTextField jtf = new JTextField("Joueur1");
	
	
private JButton bouton = new JButton("mon bouton");
  private JButton verif = new JButton("Verifier");
  private Grille grille = new Grille();
  private JPanel containPartie = new JPanel();
  //Message de bienvenu
  private JLabel mess = new JLabel("");
//Tableau stockant les éléments à afficher sur les boutons
  String[] tab_string = {"R", "B", "J", "V"};
  
  
  
  
  //color[] tab_color = {Color.RED, "Color.BLUE", "Color.YELLOW", "Color.GREEN"};
  //Un bouton par élément à afficher
  JButton[] tab_button = new JButton[tab_string.length];
  //Panel contenant les boutons
  JPanel PanBouton = new JPanel();
//Panel contenant les boutons de couleur
  JPanel PanBoutonColor = new JPanel();
  //dimension des bouton
  private Dimension dim = new Dimension(50, 40);
  //Tableau d'image de pion
  PionImg[] tab_pion= new PionImg[96];
  //Indice de Tableau tab_pion
  private int indPion = 0;
  private int NbCoup = 0;//toujours <4
  
  
//Declaration du joueur
  Joueur player;// = new Joueur(jtf.getText());
	
//Declaration de la partie
  Partie p;// = new Partie(player);
  
  
  //Declaration des combinaisons(combinaison aTrouver dans la class Partie)
    Combinaison essai = new Combinaison();
  
  

  
  
  
  
 // private PionImg p1 = new PionImg(1);
  //private PionImg p2 = new PionImg(1);
  
  
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
    
    
  
   //definition des boutons
    for(int i = 0; i < tab_string.length; i++){
        tab_button[i] = new JButton(tab_string[i]);
        tab_button[i].setPreferredSize(dim);
        switch(i){
        //Pour chaque bouton du tableau
       //on définit sa couleur et son comportement à avoir grâce à un listener
        case 0 :
        	tab_button[i].setBackground(Color.RED);
         // action a deter --> tab_button[i].addActionListener(new EgalListener());
            break;
        case 1 :
        	tab_button[i].setBackground(Color.CYAN);
            // action a deter --> tab_button[i].addActionListener(new EgalListener());
             break;
        case 2 :
        	tab_button[i].setBackground(Color.YELLOW);
            // action a deter --> tab_button[i].addActionListener(new EgalListener());
            break;
        default :
        	tab_button[i].setBackground(Color.GREEN);
            // action a deter --> tab_button[i].addActionListener(new EgalListener());
            break;
         
        }
        PanBoutonColor.add(tab_button[i]);
  
    }
    PanBouton.setLayout(new GridLayout(8, 4));
    PanBouton.add(PanBoutonColor);
    PanBouton.add(verif);
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
 
    
   //JLabel azer = new JLabel(new ImageIcon("pion_vert.jpg" ));
  // grille.add(azer);
    
    
   // grille.add(new PionImg(2));
   // grille.add(new PionImg(3));
   // grille.add(p);
    //grille.add(p2);
    //grille.add(new Pion());
     /*grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());
    grille.add(new Pion());*/
    //grille.add(new Pion());
  //Nous ajoutons notre fenêtre à la liste des auditeurs de notre bouton autrement les classes internes cree ci-dessous
  //Nous indiques à nos classes internes "d'écouter" nos boutons 
    
    tab_button[0].addActionListener(new BoutonListenerRouge());
    tab_button[1].addActionListener(new BoutonListenerBleu());
    tab_button[2].addActionListener(new BoutonListenerJaune());
    tab_button[3].addActionListener(new BoutonListenerVert());
    verif.addActionListener(new BoutonListenerVerif());
    verif.setEnabled(false);
    // desactiver un bouton --> tab_button[2].setEnabled(false);
    
    content.setLayout(cl);
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    
    
   // mess.setText("Bienvenu à toi,"+ player.getJoueur()+ ",prêt pour une partie?");
    
    
    containPartie.setBackground(Color.white);
    containPartie.setLayout(new BorderLayout());
    containPartie.add(grille, BorderLayout.CENTER);
    containPartie.add(mess, BorderLayout.NORTH);
    containPartie.add(PanBouton, BorderLayout.EAST);
    containPartie.add(bouton, BorderLayout.SOUTH);
    
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    content.add(containPartie, listContent[2]);
    
    this.setContentPane(content);
    this.setVisible(true);  
    
    
    
  }
 
//Classe écoutant notre bouton rouge
  class BoutonListenerRouge implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent arg0) {
    	grille.remove(tab_pion[indPion]);
    	essai.setPion(NbCoup+1, new Pion(Couleur.ROUGE));
		  tab_pion[indPion] = new PionImg(1);
		//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
		  for(int i=0; i<tab_pion.length; i++){
		    	grille.add(tab_pion[i]);
			}
		 indPion++;
		 if (NbCoup==3)
		 {
			 tab_button[0].setEnabled(false);
			 tab_button[1].setEnabled(false);
			 tab_button[2].setEnabled(false);
			 tab_button[3].setEnabled(false);
			 verif.setEnabled(true);
			 NbCoup=0;
		 }
		 else
			 NbCoup++;
		 
		 
		  grille.updateUI(); 
    }
  }
  
//Classe écoutant notre bouton vert
  class BoutonListenerVert implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	grille.remove(tab_pion[indPion]);
	    	essai.setPion(NbCoup+1, new Pion(Couleur.VERT));
			  tab_pion[indPion] = new PionImg(2);
			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
			  for(int i=0; i<tab_pion.length; i++){
			    	grille.add(tab_pion[i]);
				}
			 indPion++;
			 if (NbCoup==3)
			 {
				 tab_button[0].setEnabled(false);
				 tab_button[1].setEnabled(false);
				 tab_button[2].setEnabled(false);
				 tab_button[3].setEnabled(false);
				 verif.setEnabled(true);
				 NbCoup=0;
			 }
			 else
				 NbCoup++;
			 
			 
			  grille.updateUI(); 
	    }
	  }
  
//Classe écoutant notre bouton jaune
  class BoutonListenerJaune implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	grille.remove(tab_pion[indPion]);
	    	essai.setPion(NbCoup+1, new Pion(Couleur.JAUNE));
			  tab_pion[indPion] = new PionImg(3);
			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
			  for(int i=0; i<tab_pion.length; i++){
			    	grille.add(tab_pion[i]);
				}
			 indPion++;
			 if (NbCoup==3)
			 {
				 tab_button[0].setEnabled(false);
				 tab_button[1].setEnabled(false);
				 tab_button[2].setEnabled(false);
				 tab_button[3].setEnabled(false);
				 verif.setEnabled(true);
				 NbCoup=0;
			 }
			 else
				 NbCoup++;
			  
			 
			 grille.updateUI(); 
	    }
	  }
  
//Classe écoutant notre bouton bleu 
  class BoutonListenerBleu implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	grille.remove(tab_pion[indPion]);
	    	essai.setPion(NbCoup+1, new Pion(Couleur.BLEU));
			  tab_pion[indPion] = new PionImg(4);
			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
			  for(int i=0; i<tab_pion.length; i++){
			    	grille.add(tab_pion[i]);
				}
			 indPion++;
			 if (NbCoup==3)
			 {
				 tab_button[0].setEnabled(false);
				 tab_button[1].setEnabled(false);
				 tab_button[2].setEnabled(false);
				 tab_button[3].setEnabled(false);
				 verif.setEnabled(true);
				 NbCoup=0;
			 }
			 else
				 NbCoup++;
			 
			 
			  grille.updateUI(); 
	    }
	  }
  //Classe écoutant notre bouton bleu 
  class BoutonListenerVerif implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	    	System.out.println(indPion);
	    	Evaluation e1 = new Evaluation(essai,p.getSolut());
	    	for(int j = 0; j <= 3; j++)
			{
	    		
	    	if (e1.tabEval[j]== Couleur.BLANC)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(5);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}

	    		if (e1.tabEval[j]== Couleur.NOIR)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(6);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}
	    		

	    		if (e1.tabEval[j]== Couleur.NUL)
	    		{
	    			grille.remove(tab_pion[indPion]);
	    			tab_pion[indPion] = new PionImg(7);
	    			//refaire une boucle pour init. la grille sinon "grille.add(tab_pion[indPion])" ajoute à la fin
	    			  for(int i=0; i<tab_pion.length; i++){
	    			    	grille.add(tab_pion[i]);
	    				}
	    			  indPion++;
	    		}
	    		
	    		
				
				//System.out.println(indPion);
			}
	    	
	    		tab_button[0].setEnabled(true);
				 tab_button[1].setEnabled(true);
				 tab_button[2].setEnabled(true);
				 tab_button[3].setEnabled(true);
				 verif.setEnabled(false);
				 NbCoup=0;
			
			 
			  grille.updateUI(); 
	    }
	  }
  
  
  class BoutonListenerJouer implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	  public void actionPerformed(ActionEvent event){				
	        if(++indice > 2)
	          indice = 0;
	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	        cl.show(content, listContent[indice]);
	      }
	  }
  
  class BoutonListenerStart implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	  public void actionPerformed(ActionEvent event){				
	        if(++indice > 2)
	          indice = 0;
	        player = new Joueur(jtf.getText());
	        p = new Partie(player);
	        System.out.println(player.getJoueur());
	        System.out.println(p.getSolut());
	        mess.setText("Bienvenu à toi, "+ player.getJoueur()+ ",prêt pour une partie?");
	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
	        cl.show(content, listContent[indice]);
	      }
	  }
  
  //this.getContentPane().add(new JButton("1"));
     
   
}

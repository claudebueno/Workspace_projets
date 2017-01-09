package com.formation.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import com.formation.bdd.Controleur;
import com.formation.engine.Adresse;
import com.formation.engine.Sportif;
import com.formation.engine.SportifDB;


public class JFrameEnregistrerSportif extends javax.swing.JFrame implements ActionListener, ItemListener  {

    public JFrameEnregistrerSportif() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
                         
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        sportAviron = new javax.swing.JCheckBox();
        sportBasketball = new javax.swing.JCheckBox();
        sportFootball = new javax.swing.JCheckBox();
        sportHandball = new javax.swing.JCheckBox();
        sportPetanque = new javax.swing.JCheckBox();
        sportNatation = new javax.swing.JCheckBox();
        sportRugby = new javax.swing.JCheckBox();
        sportVoile = new javax.swing.JCheckBox();
        sportWaterpolo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        btnAnnuler = new javax.swing.JButton();
        btnValider = new javax.swing.JButton();
        btnAfficheListeSportifs = new javax.swing.JButton();

        
        // Groupe de JRadioButton - SEXE
        JRadioButton sexeHomme = new javax.swing.JRadioButton();
        JRadioButton sexeFemme = new javax.swing.JRadioButton();
        ButtonGroup sexe = new ButtonGroup();
        sexe.add(sexeHomme);
        sexe.add(sexeFemme);
        
        sexeHomme.addActionListener(this);
        sexeFemme.addActionListener(this);
        sexeHomme.addItemListener(this);
        sexeFemme.addItemListener(this);
        

        @Override
        private void actionPerformed(ActionEvent e) {
          System.out.println("Clic sur le bouton : " + e.getActionCommand());
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
          System.out.print("Bouton " + ((JRadioButton) e.getItem()).getActionCommand());
          if (e.getStateChange() == ItemEvent.DESELECTED)
            System.out.println(" deselectionne");
          if (e.getStateChange() == ItemEvent.SELECTED)
            System.out.println(" selectionne");
        }
        
        public static JRadioButton getBoutonSelectionne(ButtonGroup group) {
        	  JRadioButton result = null;
        	  for (Enumeration e1 = group.getElements(); e1.hasMoreElements();) {
        	    JRadioButton bouton = (JRadioButton) e1.nextElement();
        	    if (bouton.getModel() == group.getSelection()) {
        	      result = bouton;
        	      break;
        	    }
        	  }
        	  return result;
        	}
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        sportAviron.setText("Aviron");

        sportBasketball.setText("Basketball");

        sportFootball.setText("Football");

        sportHandball.setText("Handball");

        sportPetanque.setText("Petanque");

        sportNatation.setText("Natation");

        sportRugby.setText("Rugby");

        sportVoile.setText("Voile");

        sportWaterpolo.setText("Waterpolo");

        jLabel5.setText("SPORT");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sportAviron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sportWaterpolo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportVoile, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportRugby, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportPetanque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportNatation, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportHandball, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportFootball, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(sportBasketball, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sportAviron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportBasketball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportFootball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportHandball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportNatation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportPetanque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportRugby)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportVoile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sportWaterpolo)
                .addGap(36, 36, 36))
        );

        jInternalFrame2.setVisible(true);

        jLabel1.setText("NOM");

        jLabel2.setText("PRENOM");

        jLabel3.setText("ADRESSE");

        jLabel4.setText("SEXE");

        sexeHomme.setText("Homme");
        sexeHomme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeHommeActionPerformed(evt);
            }
        });

        sexeFemme.setText("Femme");
        sexeFemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeFemmeActionPerformed(evt);
            }
        });

        nom.setToolTipText("");

        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });

        adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresse)
                    .addComponent(nom)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(sexeHomme)
                        .addGap(18, 18, 18)
                        .addComponent(sexeFemme)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(prenom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexeHomme)
                    .addComponent(sexeFemme))
                .addContainerGap())
        );

        jInternalFrame3.setVisible(true);

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		
        		System.out.println("test bouton Annuler");
                
            }
        });

        // BOUTON VALIDER
        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		
        		System.out.println("Ajout d'un sportif");
        		
        		Sportif sportif = new Sportif(nom, prenom, adresse, sexe1, sport);
        		
        		Controleur.GetInstance().ajouter(sportif);
                
            }
        });

        
        // BOUTON AFFICHER LISTE des SPORTIFS
        btnAfficheListeSportifs.setText("Afficher Sportifs");
        btnAfficheListeSportifs.setActionCommand("btnAfficheListeSportifs");
        btnAfficheListeSportifs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             	
            	JFrameAfficherSportifs aff = new JFrameAfficherSportifs();
            		aff.setVisible(true);
            		aff.setTitle("Enregistrement Sportif");
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAfficheListeSportifs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValider)
                    .addComponent(btnAnnuler)
                    .addComponent(btnAfficheListeSportifs))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFrame3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jInternalFrame2)
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jInternalFrame3))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInternalFrame1)
                    .addComponent(jInternalFrame2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }                 

    private void adresseActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void sexeFemmeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void sexeHommeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         



    // Variables declaration - do not modify                     
    private javax.swing.JTextField adresse;
    private javax.swing.JButton btnAfficheListeSportifs;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnValider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.ButtonGroup sexe;
    private javax.swing.JRadioButton sexeFemme;
    private javax.swing.JRadioButton sexeHomme;
    private javax.swing.JCheckBox sportAviron;
    private javax.swing.JCheckBox sportBasketball;
    private javax.swing.JCheckBox sportFootball;
    private javax.swing.JCheckBox sportHandball;
    private javax.swing.JCheckBox sportNatation;
    private javax.swing.JCheckBox sportPetanque;
    private javax.swing.JCheckBox sportRugby;
    private javax.swing.JCheckBox sportVoile;
    private javax.swing.JCheckBox sportWaterpolo;
    // End of variables declaration                   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

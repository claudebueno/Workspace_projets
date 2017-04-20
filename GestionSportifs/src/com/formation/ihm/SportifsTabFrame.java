package com.formation.ihm;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.formation.log.Log;

public class SportifsTabFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SportifsTabFrame() throws SQLException {
        //super();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tableau des sportifs");
        this.setSize(800, 500);
        com.formation.engine.SportifDB sdb = new com.formation.engine.SportifDB(); 
        ArrayList<ArrayList<String>> sportifs = sdb.affiche();
        Object[][] data = new Object[sportifs.size()][6];
        for (int i=0;i<sportifs.size();i++) {
        	for (int j=0;j<6;j++) {
 

        			data[i][j] = sportifs.get(i).get(j);
        		
        	}    
        }
      Log.write("Affichage des sportifs dans un tableau");
        String  title[] = {"Id", "Nom", "Prénom", "Adresse", "Sexe", "Sports"};
        JTable tableau = new JTable(data, title);
        this.getContentPane().add(new JScrollPane(tableau)); 
    }
}
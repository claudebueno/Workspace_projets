package com.formation.engine;

import java.sql.SQLException;

public class GestionSportif {
	public static void main(String [] args) throws SQLException {
		/** Lancement ihm */
		SportifDB SportifDB = new SportifDB();
		//UtilisateurDB udb = new UtilisateurDB();
		
		//SportifDB.remplir(20);
		//Sportif a = new Sportif("Samuel","Garry",new Adresse(15, "rue des peuplier", 45000, "Orl�ans"),"homme","{Aviron,Kayak}");
		
		//Sportif b = new Sportif("Samue","Garry","12/05/1900");
		//SportifDB.ajouter(a);
		//System.out.println(SportifDB.affiche(43));
		
		
		
		//SportifDB.supprimer(42);
		//SportifDB.ajouter(new Sportif("Samuel","Garry","12/05/1902"));
		//SportifDB.editer(b, a);
		
		//Sportif b = new Sportif("toto","titi","50 rue des Carmes",false,"Aviron;Kayak");
		
		//SportifDB.editer(a, 55);
		
		System.out.println(SportifDB.affiche());
		//SportifDB.suppimertout();
		//System.out.println(SportifDB.affiche());
		
		SportifDB.close();
		/** Fermeture du programme */
	}
}

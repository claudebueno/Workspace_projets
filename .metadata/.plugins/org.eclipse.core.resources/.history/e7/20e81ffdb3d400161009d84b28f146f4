package com.formation.bdd;

import java.sql.SQLException;
import java.util.List;

public class Controleur {
	
	public ConnexionDB sportifDAO;
	private List<Sportif> sportifs;// = new ArrayList<Sportif>();
	public Sportif sportif;
	private static Controleur control=null; //Singleton
	
	public static Controleur GetInstance(){
		if (control == null){
			control = new Controleur();
		}
		return control;
	}
	
	private Controleur(){
		sportifDAO = new ConnexionDB();
		sportifDAO.ouvrirConnexion();
	}
	
	
	public List<Sportif> getSportifs() {
		return sportifs;
	}

	public void setSportifs(List<Sportif> sportifs) {
		this.sportifs = sportifs;
	}

	public void ajouter(Sportif sportif){

		try {
			sportifDAO.ajouterSportif(sportif);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void lireListe(){

		try {
			sportifs = sportifDAO.lireSportifs();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void supprimer(int id){

		try {
			sportifDAO.supprimerSportif(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


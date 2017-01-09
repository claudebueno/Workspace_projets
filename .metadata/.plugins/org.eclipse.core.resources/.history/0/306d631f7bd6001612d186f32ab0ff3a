package com.formation.engine;

import java.sql.SQLException;
import java.util.ArrayList;

import com.formation.bdd.DataBase;
import com.formation.log.Log;

public class SportifDB {
	private DataBase db;
	public SportifDB() throws SQLException {
		db = new DataBase("localhost:5432","postgres","root","tp_java_bdd");
	}
	public void remplir(int nb) throws SQLException {
		for (int i=0;i<nb;i++) {
			this.ajouter(new Sportif("nom"+i,"prenom"+i,new Adresse(25,"rue des pandas",35698,"Troyes"),"homme","{Aviron,Kayak}"));
		}
	}
	public ArrayList<ArrayList<String>> affiche() throws SQLException {
		Log.write("Affichage de tous les sportifs");
		return db.selectRequest("SELECT * FROM tp1.sportifs");	
	}
	// Affiche en console
	public void afficheConsole() throws SQLException {
		Log.write(db.selectStringRequest("SELECT * FROM tp1.sportifs"));
	}
	public ArrayList<ArrayList<String>> affiche(int id) throws SQLException {
		Log.write("Affiche le sportif");
		return db.selectRequest("SELECT * FROM tp1.sportifs WHERE id="+id);	
	}
	// Ajoute une personne
	public void ajouter(Sportif s) throws SQLException {
		db.request("INSERT INTO tp1.sportifs (nom, prenom, adresse, sexe, sports) VALUES('"+s.getNom()+"','"+s.getPrenom()+"',"
				+ "ROW("+s.getAdresse().getNumero()+",'"+s.getAdresse().getVoie()+"',"+s.getAdresse().getCodePostal()+",'"+s.getAdresse().getVille()+"'), '"
				+s.getSexe()+"', '"+s.getSports()+"')");
		Log.write("Le sportif "+s.getNom()+" "+s.getPrenom()+" a été ajouté");
	}
	// Supprime une personne
	public void supprimer(int id) throws SQLException {
		db.request("DELETE FROM tp1.sportifs WHERE id="+id);
		Log.write("Le sportif a été supprimé");
	}
	// Supprime tous les personnes
	public void suppimertout() throws SQLException {
		db.request("DELETE FROM tp1.sportifs");
		Log.write("tous les sportifs ont été supprimés");
	}
	// Edite une personne
	public void editer(Sportif s, int id) throws SQLException {
		db.request("UPDATE tp1.sportifs SET nom = '"+ s.getNom()+"', prenom = '"+ s.getPrenom()+"', adresse = "
				+ "ROW("+s.getAdresse().getNumero()+", '"+s.getAdresse().getVoie()+"',"+s.getAdresse().getCodePostal()+",'"+s.getAdresse().getVille()+"'),"
				+ "  sexe = '"+ s.getSexe()+"', sports ='"+ s.getSports()+"'  WHERE id=+"+id);
		Log.write("Le sportif "+s.getNom()+" "+s.getPrenom()+" a été édité");
	}
	public void close() {
		db.close();
	}
	
}

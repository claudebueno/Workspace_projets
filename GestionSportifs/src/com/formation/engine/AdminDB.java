package com.formation.engine;

import java.sql.SQLException;
import java.util.ArrayList;

import com.formation.bdd.DataBase;
import com.formation.log.Log;

public class AdminDB {
	private DataBase db;
	public AdminDB() throws SQLException {
		db = new DataBase("localhost:5432","postgres","root","tp_java_bdd");
	}
	public void remplir(int nb) throws SQLException {
		for (int i=0;i<nb;i++) {
			this.ajouter(new Admin("nom"+i,"prenom"+i,new Adresse(25,"rue des pandas",35698,"Troyes"),"homme","admin","admin"));
		}
	}
	public ArrayList<ArrayList<String>> affiche() throws SQLException {
		Log.write("Affichage de tous les sportifs");
		return db.selectRequest("SELECT * FROM tp1.administrateurs");	
	}
	// Affiche en console
	public void afficheConsole() throws SQLException {
		Log.write(db.selectStringRequest("SELECT * FROM tp1.administrateurs"));
	}
	public ArrayList<ArrayList<String>> affiche(int id) throws SQLException {
		Log.write("Affiche l'administrateur");
		return db.selectRequest("SELECT * FROM tp1.administrateurs WHERE id="+id);	
	}
	// Ajoute une personne
	public void ajouter(Admin a) throws SQLException {
		db.request("INSERT INTO tp1.administrateurs (nom, prenom, adresse, sexe, login, password) VALUES('"+a.getNom()+"','"+a.getPrenom()+"',"
				+ "ROW("+a.getAdresse().getNumero()+",'"+a.getAdresse().getVoie()+"',"+a.getAdresse().getCodePostal()+",'"+a.getAdresse().getVille()+"'), '"
				+a.getSexe()+"', '"+a.getLogin()+"', '"+a.getPassword()+"')");
		Log.write("L'administrateur "+a.getNom()+" "+a.getPrenom()+" a �t� ajout�");
	}
	// Supprime une personne
	public void supprimer(int id) throws SQLException {
		db.request("DELETE FROM tp1.administrateurs WHERE id="+id);
		Log.write("L'administrateur a �t� supprim�");
	}
	// Supprime tous les personnes
	public void suppimertout() throws SQLException {
		db.request("DELETE FROM tp1.administrateurs");
		Log.write("tous les administrateurs ont �t� supprim�s");
	}
	// Edite une personne
	public void editer(Admin a, int id) throws SQLException {
		db.request("UPDATE tp1.administrateurs SET nom = '"+ a.getNom()+"', prenom = '"+ a.getPrenom()+"', adresse = "
				+ "ROW("+a.getAdresse().getNumero()+", '"+a.getAdresse().getVoie()+"',"+a.getAdresse().getCodePostal()+",'"+a.getAdresse().getVille()+"'),"
				+ "  sexe = '"+ a.getSexe()+"', login ='"+ a.getLogin()+"',password ='"+a.getPassword()+"'  WHERE id=+"+id);
		Log.write("L'administrateur "+a.getNom()+" "+a.getPrenom()+" a �t� �dit�");
	}
	public void close() {
		db.close();
	}
	
}
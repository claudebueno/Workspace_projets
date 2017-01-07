package com.formation.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnexionDB {

	static Connection conn = null;
	Statement stmt = null;
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:postgresql://localhost:5432/tp1";
	String sql;
	ResultSet rs;

	public ConnexionDB() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Connecting to database...");
		} catch (Exception se) {
			se.printStackTrace();
		}

	}

	public void fermerConnexion() {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	public void ouvrirConnexion() {
		try {
			conn = DriverManager.getConnection(DB_URL, "postgres", "root");
			stmt = conn.createStatement();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	public List<Sportif> lireSportifs() throws SQLException {
		List<Sportif> sportifs = new ArrayList<Sportif>();
		sql = "select * from utilisateurs";
		rs = stmt.executeQuery(sql);

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			String id = rs.getString("id");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String age = rs.getString("date_naissance");
			sportifs.add(new Sportif(nom, prenom, age));
			System.out.println(String.format("%s %s %s %s", id, nom, prenom, age));
		}
		return sportifs;
	}
	
	public void ajouterSportif(Sportif sportif) throws SQLException {
		sql = creerRequeteSQLInsertion(sportif);
		System.out.println(sql);
		stmt.executeUpdate(sql);
	}
	
	public void supprimerSportif(int id) throws SQLException {
		sql = "delete from utilisateurs where id='"+id+"'";
		System.out.println(sql);
		stmt.executeUpdate(sql);
	}
	
	private String creerRequeteSQLInsertion(Sportif sportif){
		sql = "INSERT INTO UTILISATEURS (NOM, PRENOM, DATE_NAISSANCE)";
		sql +="VALUES('"+sportif.nom+"','";
		sql += sportif.prenom+"','";
		sql +=sportif.date_naissance+"')";
		
		return sql;
	}
}


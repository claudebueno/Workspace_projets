package com.formation.bdd;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.formation.log.Log;
 


public class DataBase {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String CONNECTER="jdbc:postgresql://";
    private String dbURL = "";
    private String user = "";
    private String password = "";
    private String base = "";
    private java.sql.Connection dbConnect = null;
    private java.sql.Statement dbStatement = null;
    private ResultSet rs = null;
    private ResultSetMetaData stmt=null;
    ArrayList<ArrayList<String>> request=null;
    //private ArrayList<String> row = null;
 
    public DataBase(String url, String user, String password, String base) {
        this.dbURL = url;
        this.user = user;
        this.password = password;
        this.base = base;
        if (this.connect()) {
            Log.write("Connexion à la base réussie");
        }
        else {
        	Log.write("Erreur de connexion à la base de données !!!");
        }
    }
    /* Connexion à la base de données */ 
     
    private Boolean connect() {
        try {
        	Class.forName(DRIVER).newInstance();
        	this.dbConnect = DriverManager.getConnection(CONNECTER + this.dbURL+"/"+this.base, this.user, this.password);
            this.dbStatement = this.dbConnect.createStatement();
            return true;
        } 
        catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    /* Récupération de requête SQL */
    public void request (String sql) throws SQLException {
    	// Si requête de selection (SELECT)
    	if (sql.substring(0, 6).equalsIgnoreCase("SELECT")) {
    		request = this.selectRequest(sql);
    	}
    	else {
    	// sinon traitement	(UPDATE, DELETE, INSERT)
    		dbStatement.executeUpdate(sql);
    		Log.write("Traitement effectué");
    	}
    }
    
    /* Requête SELECT */
    public ArrayList<ArrayList<String>> selectRequest(String sql) throws SQLException {
    	request = new ArrayList<ArrayList<String>>();
    	
    	//dbStatement.getFetchSize();
    	rs = dbStatement.executeQuery(sql);
	    stmt=rs.getMetaData();
	    	while(rs.next()) { 	
	    		ArrayList<String> row = new ArrayList<String>();
	    		for (int i=1;i<=stmt.getColumnCount();i++) {  	
	    			row.add(rs.getString(i));
	    		}
	    		request.add(row);
	    	}
	    rs.close();
	    Log.write("Requête envoyée");
	    return request;
    }
    
   /* Affichage de Requête SELECT en console */
    public String selectStringRequest(String sql) throws SQLException {
    	String request="";
    	rs = dbStatement.executeQuery(sql);
	    stmt=rs.getMetaData();
	    	while(rs.next()) { 		
	    		for (int i=1;i<=stmt.getColumnCount();i++) {  	
	    			System.out.print(rs.getString(i)+" ");
	    		}
	    		System.out.println("");
	    	}
	    rs.close();
	    System.out.println(request);
	    return request;
    }
    
    /* Fermeture la connexion au serveur de DB */  
    public void close() {
        try {
            this.dbStatement.close();
            this.dbConnect.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
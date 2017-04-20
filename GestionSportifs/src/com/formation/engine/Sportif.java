package com.formation.engine;

public class Sportif extends Utilisateur{
	private String sports;
	public Sportif(String nom, String prenom, Adresse adresse, String sexe, String sports ) {
		super(nom,prenom,adresse,sexe);
		this.setSports(sports);
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	
}
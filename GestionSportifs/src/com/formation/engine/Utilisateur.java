package com.formation.engine;

public abstract class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String sexe;
	public Utilisateur(String nom, String prenom, Adresse adresse, String sexe) { 
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adresse);
		this.setSexe(sexe);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
}

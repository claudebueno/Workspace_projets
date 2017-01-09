package com.formation.engine;

public class Admin extends Utilisateur{
	private String login;
	private String password;
	public Admin(String nom, String prenom, Adresse adresse, String sexe,String login, String password) {
		super(nom,prenom,adresse,sexe);
		this.setLogin(login);
		this.setPassword(password);
		//this.cryptPassword();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*private String cryptPassword() {
		
		return password;
	}*/
}

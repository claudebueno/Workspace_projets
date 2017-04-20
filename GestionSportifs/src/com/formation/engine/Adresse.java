package com.formation.engine;

public class Adresse {
	private int numero;
	private String voie;
	private int codePostal;
	private String ville;
	public Adresse(int numero, String voie, int codePostal, String ville) {
		this.setNumero(numero);
		this.setVoie(voie);
		this.setCodePostal(codePostal);
		this.setVille(ville);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}

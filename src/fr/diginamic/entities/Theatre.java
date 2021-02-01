package fr.diginamic.entities;

public class Theatre {

	private String nom;
	private int capacite;
	private int totalInscrits;
	private int recetteTotale;
	
	public Theatre(String nom, int capacite) {
		this.nom = nom;
		this.capacite = capacite;
		this.totalInscrits = 0;
		this.recetteTotale = 0;
	}
	
	public int getTotalInscrits() {
		return totalInscrits;
	}
	
	public int getRecetteTotale() {
		return recetteTotale;
	}
	
	public void inscrire(int nbClients, int prixPlace) {
		if ((this.totalInscrits +  nbClients) <= capacite) {
			this.totalInscrits += nbClients;
			this.recetteTotale += (prixPlace * nbClients);
		} else {
			System.out.println("La capacité maximale est atteinte , il ne reste que " + (this.capacite - this.totalInscrits) + " place(s).");
		}
	}
}

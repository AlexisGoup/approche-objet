package fr.diginamic.banque.entites;

public class Compte {

	private long numeroDeCompte;
	private double soldeDuCompte;
	
	public long getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDeCompte(long numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public double getSoldeDuCompte() {
		return soldeDuCompte;
	}

	public void setSoldeDuCompte(long soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}
	
	@Override
	public String toString() {
		return "Numero de Compte : " + Long.toString(numeroDeCompte) + " \nSolde du Compte : " + Double.toString(soldeDuCompte);
	}

	public Compte(long numeroDeCompte, double d) {
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = d;
	}
}

package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	int tauxDeRemuneration;
	
	@Override
	public String toString() {
		return super.toString() + " \nTaux de rémunération : " + this.tauxDeRemuneration;
	}
	
	public CompteTaux(long numeroDeCompte, double soldeDuCompte, int tauxDeRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
}

package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	abstract public double getSalaire();
	
	public void afficherDonnee() {
		System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", type : " + getType(this));
	}
	
	public String getType(Intervenant intervenant) {
		if(intervenant instanceof Salarie) {
			return "Salarie";
		} else if (intervenant instanceof Pigiste) {
			return "Pigiste";
		} else {
			return "error";
		}
	}
}

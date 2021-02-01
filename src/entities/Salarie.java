package entities;

public class Salarie {
	
	private String nom;
	private String prenom;
	private double salaire;
	
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public void presentation() {
		System.out.println("Hello, je suis " + nom + " " + prenom + " et mon salaire est de : " + salaire + " €");
	}
	
}

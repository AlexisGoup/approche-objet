package entities;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public String ToString() {
		return this.nom + " " + this.prenom + " \n Vit au " + this.adressePostale.ToString();
	}
	
	public void DisplayPersonne() {
		System.out.println(this.ToString());
	}
}

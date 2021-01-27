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
	
	public void modifyName(String newName) {
		this.nom = newName;
	}
	
	public void modifyFirstName(String newFirstName) {
		this.prenom = newFirstName;
	}
	
	public void modifyAdress(AdressePostale newAdress) {
		this.adressePostale = newAdress;
	}
	
	public String getName() {
		return this.nom;
	}
	
	public String getFirstName() {
		return this.prenom;
	}
	
	public AdressePostale getAdress() {
		return this.adressePostale;
	}
	
	public String ToString() {
		return this.nom.toUpperCase() + " " + this.prenom + " \n Vit au " + this.adressePostale.ToString();
	}
	
	public void DisplayPersonne() {
		System.out.println(this.ToString());
	}
}

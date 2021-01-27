package entities;

public class AdressePostale {
	public int numeroDeRue;
	public String libelleDeLaRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int numeroDeRue, String libelleDeLaRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleDeLaRue = libelleDeLaRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public String ToString() {
		return this.numeroDeRue + " " + this.libelleDeLaRue + " " + this.codePostal + " " + this.ville;
	}
	
	public void DisplayAdress() {
		System.out.println(this.ToString());
	}
}

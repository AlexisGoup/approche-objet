package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne("Jean-Herv�", "Petitpas", new AdressePostale(125, "Rue des pr�vost", 34000, "Montpellier"));
		Personne p2 = new Personne("Nicolas", "PetiBeurre", new AdressePostale(5, "Rue des pr�vost", 34000, "Montpellier"));
		
		p2.DisplayPersonne();
		p2.setAdress(new AdressePostale(285, "Rue des pr�vostac�s sauvages", 34500, "Montcul"));
		p2.DisplayPersonne();
	}

}

package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		p1.nom = "Carlito";
		p1.prenom = "Gné";
		p1.adressePostale = new AdressePostale();
		p1.adressePostale.codePostal = 34000;
		p1.adressePostale.libelleDeLaRue = "Rue des marais";
		p1.adressePostale.ville = "Montpellier";
		p1.adressePostale.numeroDeRue = 2;
		
		p2.nom = "Frère de Carlito";
		p2.prenom = "Gné junior";
		p1.adressePostale = new AdressePostale();
		p1.adressePostale.codePostal = 34000;
		p1.adressePostale.libelleDeLaRue = "Rue des marais";
		p1.adressePostale.ville = "Montpellier";
		p1.adressePostale.numeroDeRue = 2;		
	}

}

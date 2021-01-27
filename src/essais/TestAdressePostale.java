package essais;

import entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale firstAdress = new AdressePostale(5, "Rue des prévost", 34000, "Montpellier");
		AdressePostale secondAdress = new AdressePostale(2, "Avenue des buis", 34100, "Montpellier");
		
		secondAdress.DisplayAdress();

	}

}

package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {

		Pigiste pigiste = new Pigiste("Rodriguez", "Miguel", 23.8, 300);
		System.out.println("Salaire du Pigiste : " + pigiste.getSalaire());
		pigiste.afficherDonnee();
		
		Salarie salarie = new Salarie("Petitjean", "Michel" ,3500);
		System.out.println("Salaire du Salarié : " + salarie.getSalaire());
		salarie.afficherDonnee();

	}

}

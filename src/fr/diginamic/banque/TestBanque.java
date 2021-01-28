package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte[] tab = new Compte[2];
		
		tab[0] = new Compte(15466, 2000.99);
		tab[1] = new CompteTaux(12866565, 9999.85, 25);
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Compte " + (i + 1) + "\n");
			System.out.println(tab[i].toString());
			System.out.println("****************************");
		}
		
	}

}

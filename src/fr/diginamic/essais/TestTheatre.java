package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("Petit Theatre Saint-Martin", 20);
		
		theatre.inscrire(19, 60);
		
		System.out.println(theatre.getTotalInscrits());
		System.out.println(theatre.getRecetteTotale());
		
		theatre.inscrire(2, 50);

	}

}

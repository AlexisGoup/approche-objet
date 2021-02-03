package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		List<Pays> listP = new ArrayList<Pays>();
		listP.add(new Pays("France", 65000000, "Europe"));
		listP.add(new Pays("Allemagne", 80000000, "Europe"));
		listP.add(new Pays("Belgique", 10000000, "Europe"));
		listP.add(new Pays("Russie", 150000000, "Asie"));
		listP.add(new Pays("Chine", 1400000000, "Asie"));
		listP.add(new Pays("Indonesie", 220000000, "Océanie"));
		listP.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String, Double> mapP = new HashMap<String, Double>();
				
		for (int i = 0; i < listP.size(); i++) {
			
			Pays pays = listP.get(i);
			String continent = pays.getContinent();
			
			// Je regarde dans ma map s'il y a un compteur pour le numéro de dépt de la ville
			Double compteur = mapP.get(continent);
			
			// Si le compteur n'existe pas, je le créé
			if (compteur==null) {
				compteur = pays.getNbHabitants();
			}
			else {
				// S'il existe je l'incrémente
				compteur += pays.getNbHabitants();
			}
			// Je restocke la nouvelle valeur du compteur
			mapP.put(continent, compteur);
		}
		
		System.out.println(mapP);

	}

}

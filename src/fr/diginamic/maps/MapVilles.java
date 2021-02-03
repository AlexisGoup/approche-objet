package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {


		HashMap<String, Ville> mapV = new HashMap<String, Ville>();
		
		mapV.put("Montpellier", new Ville("Montpellier", 150000));
		mapV.put("Paris", new Ville("Paris", 3000000));
		mapV.put("Nice", new Ville("Nice", 400000));
		mapV.put("Nimes", new Ville("Nimes", 450000));
		
		Integer smallest = null;
		String keySmallest = "";
		
		Iterator<Ville> iterV = mapV.values().iterator();
		while (iterV.hasNext()) {
			Ville ville = iterV.next();
			
			if (smallest == null) {
				smallest = ville.getNbHabitants();
				keySmallest = ville.getNom();
			}
			else if (ville.getNbHabitants() < smallest) {
				smallest = ville.getNbHabitants();
				keySmallest = ville.getNom();
			} 
		}
		
		System.out.println("La ville la plus petite est : " + keySmallest);
		mapV.remove(keySmallest);
		
		System.out.println("************************");
		System.out.println("Liste des villes restantes après suppresion de : " + keySmallest);
		
		iterV = mapV.values().iterator();
		while (iterV.hasNext()) {
			System.out.println(iterV.next().getNom());			
		}

	}

}

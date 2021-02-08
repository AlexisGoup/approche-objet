package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {

		List<Ville> listV = new ArrayList<Ville>();
		
		listV.add(new Ville("Montpellier", 200000));
		listV.add(new Ville("Nice", 150000));
		listV.add(new Ville("Paris", 2000000));
		listV.add(new Ville("Nimes", 350000));
		
		String biggestCity = "";
		int maxPopulation = 0;
		
		for (int i = 0; i < listV.size(); i++) {
			if (i == 0 || listV.get(i).getNbHabitants() > maxPopulation) {
				biggestCity = listV.get(i).getNom();
				maxPopulation = listV.get(i).getNbHabitants();
			}				
		}	
		
		System.out.println("La ville la plus peupl�e est : " + biggestCity);
		
		Ville v1 = new Ville("Noice", 34000);
		Ville v2 = new Ville("Noice", 34000);
		Ville v3 = v1;
		
		// TEST de la methode equals
		System.out.println(v1.equals(v2));
		
		// TEST avec ==     
		System.out.println(v1 == v2); // Retourne false car compare les adresses mémoires
		System.out.println(v1 == v3); // Retourne true car adresses memoire identiques 
		
	}
	
}

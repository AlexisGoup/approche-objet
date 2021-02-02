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
		
		System.out.println("La ville la plus peuplée est : " + biggestCity);
	}
	
}

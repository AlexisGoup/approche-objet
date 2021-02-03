package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {

		HashMap<String, Integer> mapSalaires = new HashMap<String, Integer>();
		
		mapSalaires.put("Roger", 2000);
		mapSalaires.put("Françoise", 3500);
		mapSalaires.put("Monique", 1500);
		
		System.out.println("La taille du HashMap est de : " + mapSalaires.size());
		
		

	}

}

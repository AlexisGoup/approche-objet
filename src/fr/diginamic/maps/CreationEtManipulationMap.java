package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(69, "Lyon");
		mapVilles.put(59, "Lille");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<String> iterValue = mapVilles.values().iterator();
		while(iterValue.hasNext()) {
			System.out.println(iterValue.next());
		}
		
		System.out.println("*********************");
		
		Iterator<Integer> iterKey = mapVilles.keySet().iterator();
		while(iterKey.hasNext()) {
			System.out.println(iterKey.next());
		}
		
		System.out.println("*********************");
		
		System.out.println("La taille du HashMap est de : " + mapVilles.size());
		
			

	}

}

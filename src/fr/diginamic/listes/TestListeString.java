package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> strL = new ArrayList<String>();
		strL.add("Nice");
		strL.add("Carcassonne");
		strL.add("Narbonne");
		strL.add("Lyon");
		strL.add("Foix");
		strL.add("Pau");
		strL.add("Marseille");
		strL.add("Tarbes");
		
		String highterLenght = "";
		
		for(int i = 0; i < strL.size(); i++) {
			if(strL.get(i).length() > highterLenght.length() || i == 0) {
				highterLenght = strL.get(i);
			} 
		}
		
		System.out.println("La plus longue chaîne de caractères est : " + highterLenght);
		
		for (int i = 0; i < strL.size(); i++) {
			strL.set(i, strL.get(i).toUpperCase());
		}
		
		System.out.println("Liste des villes en majuscules : " + strL);
		
		for (int i = 0; i < strL.size(); i++) {
			if (strL.get(i).charAt(0) == 'N') strL.remove(i);
		}
		
		System.out.println("Villes commencant par N supprimées : " + strL);
		

	}

}

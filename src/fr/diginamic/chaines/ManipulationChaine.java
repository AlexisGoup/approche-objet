package fr.diginamic.chaines;

import entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		int length = chaine.length();
		System.out.println("Longueur de la chaîne : " + length);
		
		int indexOf = chaine.indexOf(";");
		System.out.println("Position dans la chaine du premier caractère ';' : " + indexOf);
		
		String nom = chaine.substring(0, (chaine.indexOf(";")));
		System.out.println("Nom : " + nom);
		
		String nomMaj = nom.toUpperCase();
		System.out.println("Nom en majuscules : " + nomMaj);
		
		String nomMin = nom.toLowerCase();
		System.out.println("Nom en minuscules : " + nomMin);
		
		String[] chaineSplit = chaine.split(";");
		System.out.println("Affichage du tableau de la methode Split :");
		for(int i = 0; i < chaineSplit.length; i++) {
			System.out.println(chaineSplit[i]);
		}
		
		double salaire = convertSalaire(chaineSplit[2]);
		Salarie salarie = new Salarie(chaineSplit[0], chaineSplit[1], salaire);
		salarie.presentation();
		
	}
	
	static double convertSalaire(String salaire) {
		double newSalaire = Double.parseDouble(salaire.replace(" ", "")); 
		return newSalaire;
	}

}

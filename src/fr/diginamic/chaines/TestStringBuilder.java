package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// Début du Chronomètre
		long debut = System.currentTimeMillis();
		// Code à chronométrer
		
		
		// Declaration en StringBuilder VS String classique
		StringBuilder stringBuilder = new StringBuilder();
		String num = "";		
		
		for (int i = 0; i < 100000; i++) {
			//num = num + Integer.toString(i);
			stringBuilder.append(i);
		}
		
		// Fin du chronomètre
		long fin = System.currentTimeMillis();
		
		//Affichage du temps d'execution
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}

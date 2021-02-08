package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// D�but du Chronom�tre
		long debut = System.currentTimeMillis();
		// Code � chronom�trer
		
		
		// Declaration en StringBuilder VS String classique
		StringBuilder stringBuilder = new StringBuilder();
		String num = "";		
		
		for (int i = 0; i < 100000; i++) {
			//num = num + Integer.toString(i);
			stringBuilder.append(i);
		}
		
		// Fin du chronom�tre
		long fin = System.currentTimeMillis();
		
		//Affichage du temps d'execution
		System.out.println("Temps �coul� en millisecondes :" + (fin - debut));
	}

}

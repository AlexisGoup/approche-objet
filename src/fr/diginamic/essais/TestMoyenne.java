package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne calculMoyenne = new CalculMoyenne();
		double[] tabDouble = {5, 5, 9};
		
		calculMoyenne.setTabDouble(tabDouble);
		calculMoyenne.ajout(56);
		
		System.out.println("Contenu du tableau :"); 
		afficherTableau(calculMoyenne.getTabDouble());
		
		System.out.println();
		System.out.println("Moyenne du tableau :");
		System.out.println(calculMoyenne.calcul()); 
	}
	
	public static void afficherTableau(double[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}

package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double c1 = Operations.calculette(15, 15, '+');
		double c2 = Operations.calculette(12, 6, '-');
		double c3 = Operations.calculette(50, 25, '*');
		double c4 = Operations.calculette(21, 7, '/');
		
		System.out.println("Resultat Addition : " + c1);
		System.out.println("Resultat Soustraction : " + c2);
		System.out.println("Resultat Multiplication : " + c3);
		System.out.println("Resultat Division : " + c4);
	}

}

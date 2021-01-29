package fr.diginamic.operations;

public class Operations {
	
	static public double calculette(double a, double b, char operateur) {
		if (operateur == '+') return a + b;
		if (operateur == '-') return a - b;
		if (operateur == '/') return a / b;
		if (operateur == '*') return a * b;
		else return 0;
	}
	
}

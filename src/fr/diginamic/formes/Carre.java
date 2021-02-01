package fr.diginamic.formes;

public class Carre extends Rectangle {
	private double longueur;
	
	public double calculerSurface() {
		return longueur * longueur;
	}
	
	public double calculerPerimetre() {
		return longueur * 4;
	}
}

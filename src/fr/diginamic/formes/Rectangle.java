package fr.diginamic.formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}
	@Override
	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}
}

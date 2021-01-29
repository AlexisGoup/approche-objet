package fr.diginamic.entities;

public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getPerimetre() {
		return 2 * 3.14 * rayon;
	}
	
	public double getSurface() {
		return 2 * 3.14 * (rayon * rayon);
	}

	
}

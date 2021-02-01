package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return 3.14 * (rayon * rayon);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * 3.14 * rayon;
	}
	
}

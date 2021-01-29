package fr.diginamic.utils;

import fr.diginamic.entities.Cercle;

public class CercleFactory {
	
	static public Cercle makeCircle(double rayon) {
		return new Cercle(rayon);
	}
	
}

package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = CercleFactory.makeCircle(52);
		Cercle c2 = CercleFactory.makeCircle(25);
		
		System.out.println(c1.getPerimetre()); 
		System.out.println(c2.getSurface()); 
	}

}

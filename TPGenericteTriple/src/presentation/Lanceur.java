package presentation;

import metier.ObjetGenerique;

public class Lanceur {

	public static void main(String[] args) {
		
		//construction de l'instance objet 1
		ObjetGenerique<String, Double, Float> c = new ObjetGenerique<String, Double, Float>("Dada", 5.00505, 5.8f);

		//affichage de l'instance objet 1
		System.out.println("-------------------------------------------------");
		System.out.println(c);
		
		//construction de l'instance objet 2
		ObjetGenerique<Float, String, Float> c2 = new ObjetGenerique<Float, String, Float>(5.9f, "Titi", 6.98f);
		
		//affichage de l'instance objet 2
		System.out.println("-------------------------------------------------");
		System.out.println(c2);
		
		//construction de l'instance objet 3
		ObjetGenerique<String, String, Integer> c3 = new ObjetGenerique<String, String, Integer>("Tutu", "Toto", 69);
		
		//affichage de l'instance objet 3
		System.out.println("-------------------------------------------------");
		System.out.println(c3);
		System.out.println("-------------------------------------------------");
		
	}

}

package presentation;

import metier.Paire;
import metier.PaireGenerique;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//exemple sans généricite
		Paire p = new Paire("abc", "xyz");
		String x=(String) p.getPremier();
		//Double y= (Double) p.getSecond();
		
		System.out.println("x="+x);
		//System.out.println("y="+y);
		
		//exemple avec généricité. Ici on définit T comme type String.
		PaireGenerique <String> pg = new PaireGenerique<String>("xyz", "abc");
		String a= pg.getPremier();
		//Double b= pg.getSecond();
		
		System.out.println("a="+a);
		//System.out.println("b="+b);
		System.out.println((pg));
		
		PaireGenerique<Integer> pg2 = new PaireGenerique<Integer>(12, 30);
		System.out.println((pg2));
	}

}

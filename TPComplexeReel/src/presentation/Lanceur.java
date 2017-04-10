package presentation;

import metier.Complexe;
import metier.Reel;
import service.ComplexeService;
import service.IComplexeService;
import service.IReelService;
import service.ReelService;

public class Lanceur {

	public static void main(String[] args) {

//declarer les interfaces
IReelService rs = new ReelService();
IComplexeService cs = new ComplexeService();

//créer les réels
Reel r1= new Reel(12);
Reel r2 = new Reel(25);

//créer les complexes
Complexe c1 = new Complexe(12, 25);
Complexe c2 = new Complexe(12, 25);



// Affichages des nombres et utilisation des interfaces
	System.out.println("r1 = "+ r1.getX());
	System.out.println("r2 = "+ r2.getX());
	System.out.println();
	System.out.println("-----Addition r1 + r2-----");
	System.out.println(rs.addition(r1, r2));
	System.out.println();
	System.out.println("-----Soustraction r1 + r2-----");
	System.out.println(rs.soustraction(r1, r2));
	System.out.println();
	System.out.println("------------------------------");
	System.out.println();
	System.out.println("c1 = "+ c1.getRe() +" + i " + c1.getIm());
	System.out.println("c1 = "+ c2.getRe() +" + i " + c2.getIm());
	System.out.println();
	System.out.println("-----Addition c1 + c2-----");
	System.out.println(cs.addition(c1, c2));
	System.out.println();
	System.out.println("-----Soustraction c1 + c2-----");
	System.out.println(cs.soustraction(c1, c2));
}




}

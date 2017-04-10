package presentation;

import java.util.Scanner;

import metier.Carre;
import metier.Ellipse;
import metier.Rectangle;

/**
 * Cration de la classe lanveur
 * @author Stagiaire
 *@version 1.0
 */

public class Lanceur {

	/**
	 * 
	 * @param args Méthode main
	 */
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle(13, 12); // création d'un objet rectangle r
		
		
		//Affichage des mesures, du périmètre, et de la surface du rectangle r
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println(r);
		System.out.println();
		System.out.println("Le rectangle a un perimetre de " + r.perimetre());
		System.out.println();
		System.out.println("Le rectangle a une surface de " + r.surface());
		System.out.println();
System.out.println("Le rectangle a un coefficient d'etalement de " + r.CoefficientEtalement());


Ellipse e= new Ellipse(17, 18); // création d'un objet ellipse e

//Affichage des mesures, du périmètre, et de la surface de l'ellipse e
System.out.println();
System.out.println("------------------------------------------------");
System.out.println();
System.out.println(e);
System.out.println();
System.out.println("L'ellipse a un perimetre de " + e.perimetre());
System.out.println();
System.out.println("L'ellipse a une surface de " +e.surface());
System.out.println();
System.out.println("L'ellispe a un coefficient d'etalement de " +e.CoefficientEtalement());

Carre c = new Carre(10); // création d'un objet carré c

//Affichage des mesures, du périmètre, et de la surface du carré c
System.out.println();
System.out.println("------------------------------------------------");
System.out.println();
System.out.println(c);
System.out.println();
System.out.println("Le carré a un perimetre de " + c.perimetre());
System.out.println();
System.out.println("Le carré a une surface de " + c.surface());
System.out.println();
System.out.println("Le carré a un coefficient d'etalement de " + c.CoefficientEtalement());

//instanciation dynamique de l'objet rectangle r1
Scanner sc = new Scanner(System.in);

System.out.println();
System.out.println("-----------------------------------");
System.out.println("Entrer la longueur du rectangle");
int laLongueur= sc.nextInt();

System.out.println("Entrer la largeur du rectangle");
int laLargeur= sc.nextInt();

Rectangle r1=new Rectangle(laLongueur,laLargeur);

System.out.println("-------------------------------------------");
System.out.println();
System.out.println(r1);
System.out.println();
System.out.println("Le rectangle a un perimetre de " + r1.perimetre());
System.out.println();
System.out.println("Le rectangle a une surface de " + r1.surface());
System.out.println();
System.out.println("Le rectangle a un coefficient d'etalement de " + r1.CoefficientEtalement());


//instanciation dynamique de l'objet ellipse e1
Scanner sc1 = new Scanner(System.in);

System.out.println();
System.out.println("-----------------------------------");
System.out.println();
System.out.println("Entrer le grand axe de l'ellipse");
int leGrandAxe= sc1.nextInt();

System.out.println("Entrer le petit axe de l'ellipse");
int lePetitAxe= sc1.nextInt();

Ellipse e1=new Ellipse(leGrandAxe,lePetitAxe);

System.out.println();
System.out.println("------------------------------------------------");
System.out.println();
System.out.println(e1);
System.out.println();
System.out.println("L'ellipse a un perimetre de " + e1.perimetre());
System.out.println();
System.out.println("L'ellipse a une surface de " +e1.surface());
System.out.println();
System.out.println("L'ellispe a un coefficient d'etalement de " +e1.CoefficientEtalement());


//instanciation dynamique de l'objet carré c1
Scanner sc2 = new Scanner(System.in);

System.out.println();
System.out.println("-----------------------------------");
System.out.println();
System.out.println("Entrer le côté du carré");
int leCote= sc2.nextInt();

Carre c1=new Carre(leCote);

System.out.println();
System.out.println("------------------------------------------------");
System.out.println();
System.out.println(c1);
System.out.println();
System.out.println("Le carré a un perimetre de " + c1.perimetre());
System.out.println();
System.out.println("Le carré a une surface de " + c1.surface());
System.out.println();
System.out.println("Le carré a un coefficient d'etalement de " + c1.CoefficientEtalement());

sc.close();
sc1.close();
sc2.close();



	}

}

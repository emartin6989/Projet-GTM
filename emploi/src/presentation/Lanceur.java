package presentation; //package dans lequel se trouve la classe

import java.util.Scanner; //importer la classe scanner

import metier.Employe; //importer la classe employ�

//cr�er la classe lanceur
public class Lanceur {

	//cr�er la m�thode main
	public static void main(String[] args) {
	
//instancier l'employ� statique via le constructeur
			Employe e1 = new Employe("Robert", "Jean", 123690088868l); //si l'identifier est long, le terminer par l ou L afin que le programme l'identifie comme type long
			Employe e2 = new Employe();
					
 //valoriser les attributs du constructeurs 2 en statique
			e2.setNom("Roberto");
			e2.setPrenom("Roberta");
			e2.setId(3222336655548852039l);
			
			//afficher les attributs de l'instance statique
			System.out.println(e1);
			System.out.println(e2);
			
			//cr�er l'instance de saisie dynamique
			Scanner clavier = new Scanner(System.in); 
			
			//afficher les instructions du nom
			System.out.println("-------------------");
			System.out.println("Entrer le nom");
			
			//R�cup�rer le nom
			String leNom = clavier.next();
			
			//afficher les instructions du pr�nom
			System.out.println("Entrer le pr�nom");
			
			//R�cup�rer le pr�nom
			String lePrenom = clavier.next();
			
			//afficher les instructions de l'identifiant
			System.out.println("Entrer l'identifiant");
			
			//R�cup�rer l'identifier
			long lid = clavier.nextLong();
			
			//instancier l'employ� de fa�on dynamique
			Employe e3 = new Employe(leNom, lePrenom, lid);
			
			//afficher les attributs de l'instance dynamique
			System.out.println(e3);
			
			//arr�ter l'utilisation de la classe scanner
			clavier.close();
	}

}

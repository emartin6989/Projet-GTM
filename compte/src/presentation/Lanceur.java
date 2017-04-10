package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

/**
 * Cr�ation de la classe Lanceur
 *@author Stagiaire
 *@version 1.0
 */
public class Lanceur {

	/**
	 * 
	 * @param args cr�ation de la methode main
	 */
	
	public static void main(String[] args) {
		
		
	// Cr�ation de l'instance objet sc afin de r�cup�rer la saisie utilisateur
	Scanner sc= new Scanner(System.in);
				
	//cr�er un objet service
	CompteService cs = new CompteService();
			
	//cr�er un compte de base
	Compte c3 = new Compte(2689, "martinuche", 1600);
		
	//je definis une valeur k � vraie
	boolean k=true; 
	
	//je cr�� une boucle qui fonctionne tant que k est vraie
	while(k){
		
		try {
		//j'affiche mon menu
		System.out.println();	
		System.out.println("Bienvenue dans notre banque");
		System.out.println("Si vous souhaitez ajouter un compte, tapez 1");
		System.out.println("Si vous souhaitez cr�diter un compte existant, tapez 2");
		System.out.println("Si vous souhaitez d�biter un compte existante, tapez 3");
		System.out.println("Si vous souhaitez quitter notre service, tapez 4");
		
		//je retiens la valeur du choix
		int choix = sc.nextInt();
		
		
		switch (choix) {
		case 1:
			
			// Affichage de l'instruction pour saisir l'identifiant du compte
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("Pour cr�er un nouveau compte, entrer un identifiant");
			
			//R�cup�ration de la valeur saisie pour l'indentifiant du compte
			int lid = sc.nextInt();
			
			// Affichage de l'instruction pour saisir le nom du compte
			System.out.println("Entrer le nom du compte");
			
			//R�cup�ration de la valeur saisie pour le nom du compte
			String leNom = sc.next();
			
			//Affichage de l'instruction pour saisir le solde du compte
			System.out.println("Entrer le solde du compte");
			
			//R�cup�ration de la valeur saisie pour le solde du compte
			long leSolde = sc.nextLong();
			
			//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
			c3.setId(lid);
			c3.setNom(leNom);
			c3.setSolde(leSolde);
			
			// Affichage des attributs de l'instance objet c3
			System.out.println("--------------------------------");
			System.out.println(c3);
			
			break;
			
		case 2:
			
			// Affichage de l'instruction pour saisir l'identifiant du compte
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("Cr�er un nouveau compte � cr�diter, entrer un identifiant");
			
			//R�cup�ration de la valeur saisie pour l'indentifiant du compte
			int lid2 = sc.nextInt();
			
			// Affichage de l'instruction pour saisir le nom du compte
			System.out.println("Entrer le nom du compte");
			
			//R�cup�ration de la valeur saisie pour le nom du compte
			String leNom2 = sc.next();
			
			//Affichage de l'instruction pour saisir le solde du compte
			System.out.println("Entrer le solde du compte");
			
			//R�cup�ration de la valeur saisie pour le solde du compte
			long leSolde2 = sc.nextLong();
			
			//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
			c3.setId(lid2);
			c3.setNom(leNom2);
			c3.setSolde(leSolde2);
			
			// Affichage des attributs de l'instance objet c3
			System.out.println("--------------------------------");
			System.out.println(c3);
						
			//Demander le montant � cr�diter
			System.out.println();
			System.out.println("Montant � cr�diter");
			
			//Valoriser l'argument montant
			long leMontant = sc.nextLong();
			
			//Afficher le nouveau solde
			System.out.println(cs.ajouter(c3, leMontant));
			System.out.println(c3);
			
		break;
		
		case 3:
			
			// Affichage de l'instruction pour saisir l'identifiant du compte
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("Cr�er un nouveau compte � d�biter, entrer un identifiant");
			
			//R�cup�ration de la valeur saisie pour l'indentifiant du compte
			int lid3 = sc.nextInt();
			
			// Affichage de l'instruction pour saisir le nom du compte
			System.out.println("Entrer le nom du compte");
			
			//R�cup�ration de la valeur saisie pour le nom du compte
			String leNom3 = sc.next();
			
			//Affichage de l'instruction pour saisir le solde du compte
			System.out.println("Entrer le solde du compte");
			
			//R�cup�ration de la valeur saisie pour le solde du compte
			long leSolde3 = sc.nextLong();
			
			//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
			c3.setId(lid3);
			c3.setNom(leNom3);
			c3.setSolde(leSolde3);
			
			// Affichage des attributs de l'instance objet c3
			System.out.println("--------------------------------");
			System.out.println(c3);
			
			//Demander le montant � retirer
			System.out.println();
			System.out.println("Montant � retirer");
			
			//Valoriser l'arguement montant
			long leMontant2 = sc.nextLong();
			
			//afficher le nouveau solde
	
				System.out.println(cs.retirer(c3, leMontant2));
			
			System.out.println(c3);
			
			break;
			
		case 4:
			System.out.println("Merci d'avoir utilis� nos services");
			//Suppression de l'objet scanner
			sc.close();
			
			k = false;
			 
			break; 
			
		
				
		default:
			System.out.println("Veuillez r�p�ter votre demande");
			break;
			
		}
		} catch (MontantNegatifException e) {
			System.out.println(e.getMessage());
		k = false;
		} catch (SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		k= false;
		} 
		catch(InputMismatchException e){
		System.out.println("Taper correctement");	
		k=false;
		}
		}
						
	}	
}

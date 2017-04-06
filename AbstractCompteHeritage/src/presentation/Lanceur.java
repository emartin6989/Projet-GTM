package presentation;

import java.util.Scanner;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

/**
 * Classe Lanceur
 * @author Stagiaire
 *
 */
public class Lanceur {

	/**
	 * 
	 * @param args la m�thode main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		//Compte c = new Compte(1, "Maritnuche", 1568);
		CompteSimple cs = new CompteSimple(2, "Titoune", 36598, 500);
		CompteEpargne ce = new CompteEpargne(1, "mart", 1950, 4.6f);
		ComptePayant cp = new ComptePayant(2, "piti", 350, (float)5.5);
		
		
		System.out.println("Montant � retirer");
		float leMontant= sc.nextFloat();
		
		//System.out.println("L'ancien solde du compte par d�faut �tait de " + c.getSolde() + " �.");
		//c.retirer(leMontant);
		//System.out.println("Le nouveau solde du compte par d�faut est de " + c.getSolde() + " �.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte simple �tait de " + cs.getSolde() + " �.");
		System.out.println("Le d�couvert autoris� pour ce compte est de " + cs.getDecouvert() + " �.");
		cs.retirer(leMontant);
		System.out.println("Le nouveau solde du compte simple est de " + cs.getSolde() + " �.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte payant �tait de " + cp.getSolde() + " �.");
		System.out.println("Le pourcentage du compte est de " + cp.getPourcentage() + " %.");
		cp.retirer(leMontant);
		System.out.println("Le nouveau solde du compte payant est de " + cp.getSolde() + " �.");
		
		System.out.println();
		System.out.println("Montant � verser");
		float leMontant2= sc.nextFloat();
		
		
		//System.out.println("-------------------------------------------");
		//System.out.println("L'ancien solde du compte par d�faut �tait de " + c.getSolde() + " �.");
		//c.verser(leMontant2);
		//System.out.println("Le nouveau solde du compte par d�faut est de " + c.getSolde() + " �.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte simple �tait de " + cs.getSolde() + " �.");
		cs.verser(leMontant2);
		System.out.println("Le nouveau solde du compte simple est de " + cs.getSolde() + " �.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte payant �tait de " + cp.getSolde() + " �.");
		System.out.println("Le pourcentage du compte est de " + cp.getPourcentage() + " %.");
		cp.verser(leMontant2);
		System.out.println("Le nouveau solde du compte payant est de " + cp.getSolde() + " �.");
		
		System.out.println();
		System.out.println("Calcul de votre int�r�t");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte �pargne �tait de " + ce.getSolde() + " �.");
		System.out.println("Le taux d'int�r�ts du compte �pargne est de " + ce.getTaux() + " %.");
		ce.calculInterets();
		System.out.println("Les int�r�ts du compte �pargne se montent � " + ce.calculInterets() + " �.");
		
		System.out.println("--------------------------------------------");
		System.out.println("Nombre de comptes");
		System.out.println(Compte.getNbComptes());
		
		 boolean k=true;
				
				 while (k) {
					 
					System.out.println("--------------------------------------------");
					System.out.println("Nombre de comptes");
					System.out.println(Compte.getNbComptes());
					 System.out.println();
					 System.out.println("*Bienvenue chez banque Nunuche*");
					 System.out.println("Choix du compte � cr�er :");
					 System.out.println("Compte simple, tapez 1");
					 System.out.println("Compte �pargne, tapez 2");
					 System.out.println("Compte Payant, tapez 3");
					 System.out.println("Pour quitter, tapez 4");
					 
					 int choix= sc.nextInt();
					 
					 switch (choix) {
						
					 case 1:
						 
							// Affichage de l'instruction pour saisir l'identifiant du compte
							System.out.println();
							System.out.println("-------------------------------------------------");
							System.out.println("Pour cr�er un nouveau compte, entrer un identifiant");
							
							//R�cup�ration de la valeur saisie pour l'indentifiant du compte
							int lid2 = sc.nextInt();
							
							// Affichage de l'instruction pour saisir le nom du compte
							System.out.println("Entrer le nom du compte");
							
							//R�cup�ration de la valeur saisie pour le nom du compte
							String leNom2 = sc.next();
							
							//Affichage de l'instruction pour saisir le solde du compte
							System.out.println("Entrer le solde du compte");
							
							//R�cup�ration de la valeur saisie pour le solde du compte
							float leSolde2 = sc.nextFloat();
							
							System.out.println("Entrer le d�couvert autoris�");
							float leDecouvert = sc.nextFloat();
							
							
							//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
							CompteSimple cs1 = new CompteSimple(lid2, leNom2, leSolde2, leDecouvert);
							
							// Affichage des attributs de l'instance objet c3
							System.out.println("--------------------------------");
							System.out.println(cs1);
							System.out.println();
						 
							break;
							
					 case 2:
						 
						// Affichage de l'instruction pour saisir l'identifiant du compte
							System.out.println();
							System.out.println("-------------------------------------------------");
							System.out.println("Pour cr�er un nouveau compte, entrer un identifiant");
							
							//R�cup�ration de la valeur saisie pour l'indentifiant du compte
							int lid3 = sc.nextInt();
							
							// Affichage de l'instruction pour saisir le nom du compte
							System.out.println("Entrer le nom du compte");
							
							//R�cup�ration de la valeur saisie pour le nom du compte
							String leNom3 = sc.next();
							
							//Affichage de l'instruction pour saisir le solde du compte
							System.out.println("Entrer le solde du compte");
							
							//R�cup�ration de la valeur saisie pour le solde du compte
							float leSolde3 = sc.nextFloat();
							
							System.out.println("Entrer le taux du compte");
							float leTaux = sc.nextFloat();
							
							
							//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
							CompteEpargne ce1 = new CompteEpargne(lid3, leNom3, leSolde3, leTaux);
							
							// Affichage des attributs de l'instance objet c3
							System.out.println("--------------------------------");
							System.out.println(ce1);
							System.out.println();
							
						 break;
						 
					 case 3:
						 
						 
							// Affichage de l'instruction pour saisir l'identifiant du compte
								System.out.println();
								System.out.println("-------------------------------------------------");
								System.out.println("Pour cr�er un nouveau compte, entrer un identifiant");
								
								//R�cup�ration de la valeur saisie pour l'indentifiant du compte
								int lid4 = sc.nextInt();
								
								// Affichage de l'instruction pour saisir le nom du compte
								System.out.println("Entrer le nom du compte");
								
								//R�cup�ration de la valeur saisie pour le nom du compte
								String leNom4 = sc.next();
								
								//Affichage de l'instruction pour saisir le solde du compte
								System.out.println("Entrer le solde du compte");
								
								//R�cup�ration de la valeur saisie pour le solde du compte
								float leSolde4 = sc.nextFloat();
								
								System.out.println("Entrer le pourcentage de pr�l�vement");
								float lePourcentage = sc.nextFloat();
								
								
								//Cr�ation de l'instance objet c3 en utilisant les donn�es saisies comme attributs
								ComptePayant cp1 = new ComptePayant(lid4, leNom4, leSolde4, lePourcentage);
								
								// Affichage des attributs de l'instance objet c3
								System.out.println("--------------------------------");
								System.out.println(cp1);
								System.out.println();
								
								break;
						 
					 case 4:
						 
						 System.out.println("Merci d'avoir utilis� nos services");
						 k=false;
						 
						 sc.close();
						 
						 break;
						 
						default:
							
							System.out.println("Veuillez retaper votre demande");
							break;
						}	
				}

	}

}

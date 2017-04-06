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
	 * @param args la méthode main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		//Compte c = new Compte(1, "Maritnuche", 1568);
		CompteSimple cs = new CompteSimple(2, "Titoune", 36598, 500);
		CompteEpargne ce = new CompteEpargne(1, "mart", 1950, 4.6f);
		ComptePayant cp = new ComptePayant(2, "piti", 350, (float)5.5);
		
		
		System.out.println("Montant à retirer");
		float leMontant= sc.nextFloat();
		
		//System.out.println("L'ancien solde du compte par défaut était de " + c.getSolde() + " €.");
		//c.retirer(leMontant);
		//System.out.println("Le nouveau solde du compte par défaut est de " + c.getSolde() + " €.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte simple était de " + cs.getSolde() + " €.");
		System.out.println("Le découvert autorisé pour ce compte est de " + cs.getDecouvert() + " €.");
		cs.retirer(leMontant);
		System.out.println("Le nouveau solde du compte simple est de " + cs.getSolde() + " €.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte payant était de " + cp.getSolde() + " €.");
		System.out.println("Le pourcentage du compte est de " + cp.getPourcentage() + " %.");
		cp.retirer(leMontant);
		System.out.println("Le nouveau solde du compte payant est de " + cp.getSolde() + " €.");
		
		System.out.println();
		System.out.println("Montant à verser");
		float leMontant2= sc.nextFloat();
		
		
		//System.out.println("-------------------------------------------");
		//System.out.println("L'ancien solde du compte par défaut était de " + c.getSolde() + " €.");
		//c.verser(leMontant2);
		//System.out.println("Le nouveau solde du compte par défaut est de " + c.getSolde() + " €.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte simple était de " + cs.getSolde() + " €.");
		cs.verser(leMontant2);
		System.out.println("Le nouveau solde du compte simple est de " + cs.getSolde() + " €.");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte payant était de " + cp.getSolde() + " €.");
		System.out.println("Le pourcentage du compte est de " + cp.getPourcentage() + " %.");
		cp.verser(leMontant2);
		System.out.println("Le nouveau solde du compte payant est de " + cp.getSolde() + " €.");
		
		System.out.println();
		System.out.println("Calcul de votre intérêt");
		
		System.out.println("-------------------------------------------");
		System.out.println("L'ancien solde du compte épargne était de " + ce.getSolde() + " €.");
		System.out.println("Le taux d'intérêts du compte épargne est de " + ce.getTaux() + " %.");
		ce.calculInterets();
		System.out.println("Les intérêts du compte épargne se montent à " + ce.calculInterets() + " €.");
		
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
					 System.out.println("Choix du compte à créer :");
					 System.out.println("Compte simple, tapez 1");
					 System.out.println("Compte épargne, tapez 2");
					 System.out.println("Compte Payant, tapez 3");
					 System.out.println("Pour quitter, tapez 4");
					 
					 int choix= sc.nextInt();
					 
					 switch (choix) {
						
					 case 1:
						 
							// Affichage de l'instruction pour saisir l'identifiant du compte
							System.out.println();
							System.out.println("-------------------------------------------------");
							System.out.println("Pour créer un nouveau compte, entrer un identifiant");
							
							//Récupération de la valeur saisie pour l'indentifiant du compte
							int lid2 = sc.nextInt();
							
							// Affichage de l'instruction pour saisir le nom du compte
							System.out.println("Entrer le nom du compte");
							
							//Récupération de la valeur saisie pour le nom du compte
							String leNom2 = sc.next();
							
							//Affichage de l'instruction pour saisir le solde du compte
							System.out.println("Entrer le solde du compte");
							
							//Récupération de la valeur saisie pour le solde du compte
							float leSolde2 = sc.nextFloat();
							
							System.out.println("Entrer le découvert autorisé");
							float leDecouvert = sc.nextFloat();
							
							
							//Création de l'instance objet c3 en utilisant les données saisies comme attributs
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
							System.out.println("Pour créer un nouveau compte, entrer un identifiant");
							
							//Récupération de la valeur saisie pour l'indentifiant du compte
							int lid3 = sc.nextInt();
							
							// Affichage de l'instruction pour saisir le nom du compte
							System.out.println("Entrer le nom du compte");
							
							//Récupération de la valeur saisie pour le nom du compte
							String leNom3 = sc.next();
							
							//Affichage de l'instruction pour saisir le solde du compte
							System.out.println("Entrer le solde du compte");
							
							//Récupération de la valeur saisie pour le solde du compte
							float leSolde3 = sc.nextFloat();
							
							System.out.println("Entrer le taux du compte");
							float leTaux = sc.nextFloat();
							
							
							//Création de l'instance objet c3 en utilisant les données saisies comme attributs
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
								System.out.println("Pour créer un nouveau compte, entrer un identifiant");
								
								//Récupération de la valeur saisie pour l'indentifiant du compte
								int lid4 = sc.nextInt();
								
								// Affichage de l'instruction pour saisir le nom du compte
								System.out.println("Entrer le nom du compte");
								
								//Récupération de la valeur saisie pour le nom du compte
								String leNom4 = sc.next();
								
								//Affichage de l'instruction pour saisir le solde du compte
								System.out.println("Entrer le solde du compte");
								
								//Récupération de la valeur saisie pour le solde du compte
								float leSolde4 = sc.nextFloat();
								
								System.out.println("Entrer le pourcentage de prélèvement");
								float lePourcentage = sc.nextFloat();
								
								
								//Création de l'instance objet c3 en utilisant les données saisies comme attributs
								ComptePayant cp1 = new ComptePayant(lid4, leNom4, leSolde4, lePourcentage);
								
								// Affichage des attributs de l'instance objet c3
								System.out.println("--------------------------------");
								System.out.println(cp1);
								System.out.println();
								
								break;
						 
					 case 4:
						 
						 System.out.println("Merci d'avoir utilisé nos services");
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

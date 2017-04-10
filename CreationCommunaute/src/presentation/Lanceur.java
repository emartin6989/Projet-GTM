package presentation;

//Dire d'importer la classe Scanner
import java.util.Scanner;

//Dire d'importer la classe Personne
import metier.Personne;
import service.PersonneService;

/**
 * 
 *Classe de démarrage de l'application
 *@author Stagiaire
 *@version 1.0
 */

//Créer la classe lanceur
public class Lanceur {

	/**
	 * la méthode main est chargée en mémoire au démarrage de l'application
	 * et peut donc être utilisée avant la création de tout objet
	 * @param args argument de la méthode main
	 */
	
	//attribuer la méthode main
	public static void main(String[] args) {
		
		//Déclaration de la couche service
		PersonneService ps = new PersonneService();
		
		//Création d'un objet Personne en fonction des constructeurs choisis
		Personne p = new Personne();
		Personne p2 = new Personne("Test", "Dupond", 40); //pas besoin de setters dans les constructeurs avec les attributs. On modifie directement dans les ().
		Personne p3 = new Personne("Toto", "Manu");
		
		//Valorisation des attributs (donner une valeur à l'attribut s'ils ne sont pas dans le constructeur)
		p.setNom("Toto"); //taper des lettres entre "" pour les types string
		p.setPrenom("Jérôme");
		p.setAge(24); //taper directement des chiffres dans les types int
		p3.setAge(36);
		
		//affichage des attributs
		System.out.println(p); //grâce à Tostring on peut afficher les attributs de la classe que l'on a sélectionnés
		System.out.println("--------------------------------------");//affiche une ligne de séparation pour la lisibilité des résultats
		System.out.println(p2);
		System.out.println("--------------------------------------");
		System.out.println(p3);

		//utlisation des méthodes marcher sur p et s'arrêter sur p3
		System.out.println("-------------------------");
		System.out.println(ps.marcher(p));
		System.out.println("--------------------------");
		System.out.println(ps.arreter(p3));
		
		//Test de la classe scanner (classe qui permet à l'utilisateur de rentrer lui-même les informations demandées via le clavier)
		Scanner clavier = new Scanner(System.in); //créer une instance permettant de taper les données.
		
		//demander le nom à l'utilisateur
		System.out.println("--------------------------------------");
		System.out.println("Saisir le nom");//instruction à afficher à l'utilisateur
		//récupérer le nom
		String leNom = clavier.next();//le nom est stocké dans la variable leNom avec un type string.
		
		//demander le prénom
		System.out.println("Saisir le prénom");
		//récupérer le prénom
		String lePrenom = clavier.next();
		
		//demander l'âge
		System.out.println("Saisir l'âge");
		//récupérer l'âge
		int lage = clavier.nextInt();//attention ici le type est int
		
		//créer l'objet personne
		Personne p4 = new Personne(leNom, lePrenom, lage);//on créé l'instance personne avec les attributs que l'utilisateur a saisi via scanner
		
		//affichage de la personne
		System.out.println("--------------------------------------");
		System.out.println("nom = " + p4.getNom()); //on affiche les données recueillies
		System.out.println("prénom = " + p4.getPrenom());
		System.out.println("âge = " + p4.getAge());
		clavier.close(); //on arrête l'instance clavier dont on n'a plus l'utilité
				
	}

}

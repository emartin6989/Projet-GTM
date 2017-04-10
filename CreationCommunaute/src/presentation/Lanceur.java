package presentation;

//Dire d'importer la classe Scanner
import java.util.Scanner;

//Dire d'importer la classe Personne
import metier.Personne;
import service.PersonneService;

/**
 * 
 *Classe de d�marrage de l'application
 *@author Stagiaire
 *@version 1.0
 */

//Cr�er la classe lanceur
public class Lanceur {

	/**
	 * la m�thode main est charg�e en m�moire au d�marrage de l'application
	 * et peut donc �tre utilis�e avant la cr�ation de tout objet
	 * @param args argument de la m�thode main
	 */
	
	//attribuer la m�thode main
	public static void main(String[] args) {
		
		//D�claration de la couche service
		PersonneService ps = new PersonneService();
		
		//Cr�ation d'un objet Personne en fonction des constructeurs choisis
		Personne p = new Personne();
		Personne p2 = new Personne("Test", "Dupond", 40); //pas besoin de setters dans les constructeurs avec les attributs. On modifie directement dans les ().
		Personne p3 = new Personne("Toto", "Manu");
		
		//Valorisation des attributs (donner une valeur � l'attribut s'ils ne sont pas dans le constructeur)
		p.setNom("Toto"); //taper des lettres entre "" pour les types string
		p.setPrenom("J�r�me");
		p.setAge(24); //taper directement des chiffres dans les types int
		p3.setAge(36);
		
		//affichage des attributs
		System.out.println(p); //gr�ce � Tostring on peut afficher les attributs de la classe que l'on a s�lectionn�s
		System.out.println("--------------------------------------");//affiche une ligne de s�paration pour la lisibilit� des r�sultats
		System.out.println(p2);
		System.out.println("--------------------------------------");
		System.out.println(p3);

		//utlisation des m�thodes marcher sur p et s'arr�ter sur p3
		System.out.println("-------------------------");
		System.out.println(ps.marcher(p));
		System.out.println("--------------------------");
		System.out.println(ps.arreter(p3));
		
		//Test de la classe scanner (classe qui permet � l'utilisateur de rentrer lui-m�me les informations demand�es via le clavier)
		Scanner clavier = new Scanner(System.in); //cr�er une instance permettant de taper les donn�es.
		
		//demander le nom � l'utilisateur
		System.out.println("--------------------------------------");
		System.out.println("Saisir le nom");//instruction � afficher � l'utilisateur
		//r�cup�rer le nom
		String leNom = clavier.next();//le nom est stock� dans la variable leNom avec un type string.
		
		//demander le pr�nom
		System.out.println("Saisir le pr�nom");
		//r�cup�rer le pr�nom
		String lePrenom = clavier.next();
		
		//demander l'�ge
		System.out.println("Saisir l'�ge");
		//r�cup�rer l'�ge
		int lage = clavier.nextInt();//attention ici le type est int
		
		//cr�er l'objet personne
		Personne p4 = new Personne(leNom, lePrenom, lage);//on cr�� l'instance personne avec les attributs que l'utilisateur a saisi via scanner
		
		//affichage de la personne
		System.out.println("--------------------------------------");
		System.out.println("nom = " + p4.getNom()); //on affiche les donn�es recueillies
		System.out.println("pr�nom = " + p4.getPrenom());
		System.out.println("�ge = " + p4.getAge());
		clavier.close(); //on arr�te l'instance clavier dont on n'a plus l'utilit�
				
	}

}

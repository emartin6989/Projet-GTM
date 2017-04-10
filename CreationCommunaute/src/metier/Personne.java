package metier;

/** 
 *Classe Personne qui sert à définir une personne
 *@author Stagiaire
 *@version 1.0
 */

//Créer la classe
public class Personne {


	//définir des attributs pour la classe
	
	/**
	 * Attribut nom de la classe personne
	 */
	
	private String nom;
	
	/**
	 * Attribut prenom de la classe personne
	 */
	
	private String prenom;
	
	/**
	 * Attribut age de la classe personne
	 */
	
	private int age;
	
	/**
	 * Première méthode constructeur personne
	 * @param nom nom de la personne
	 * @param prenom prénom de la personne
	 * @param age âge de la personne
	 */
	
	//Générer des constructeurs (instances de classe) (clic droit, source, generate constructors using fields)
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	/**
	 * Deuxième méthode constructeur personne
	 * @param nom nom de la personne
	 *@param prenom prénom de la personne
	 */
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

/**
 * Troisième méthode constructeur personne
 */
	public Personne() {
		super();
	}

//Générer les setters et getters de chaque attribut (clic droit, source, generate setters and getters)
	
/**
 * Getter de l'attibut nom
 * @return nom de la personne
 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * setter de l'attribut nom
	 * @param nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Getter de l'attribut prénom
	 * @return prénom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Setter de l'attribut prénom
	 * @param prenom prénom de la personne
	 */
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Getter de l'attribut âge
	 * @return âge de la personne
	 */
	
	public int getAge() {
		return age;
	}
	
	
	/**
	 * setter de l'attribut âge
	 * @param age âge de la personne
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Méthode d'affichage de la personne
	 * @return affichage de la personne
	 */
	
	//toString() est la méthode qui permet d'afficher l'objet et qui est définie dans la classe
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}

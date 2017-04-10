package metier;

/** 
 *Classe Personne qui sert � d�finir une personne
 *@author Stagiaire
 *@version 1.0
 */

//Cr�er la classe
public class Personne {


	//d�finir des attributs pour la classe
	
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
	 * Premi�re m�thode constructeur personne
	 * @param nom nom de la personne
	 * @param prenom pr�nom de la personne
	 * @param age �ge de la personne
	 */
	
	//G�n�rer des constructeurs (instances de classe) (clic droit, source, generate constructors using fields)
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	/**
	 * Deuxi�me m�thode constructeur personne
	 * @param nom nom de la personne
	 *@param prenom pr�nom de la personne
	 */
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

/**
 * Troisi�me m�thode constructeur personne
 */
	public Personne() {
		super();
	}

//G�n�rer les setters et getters de chaque attribut (clic droit, source, generate setters and getters)
	
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
	 * Getter de l'attribut pr�nom
	 * @return pr�nom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Setter de l'attribut pr�nom
	 * @param prenom pr�nom de la personne
	 */
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Getter de l'attribut �ge
	 * @return �ge de la personne
	 */
	
	public int getAge() {
		return age;
	}
	
	
	/**
	 * setter de l'attribut �ge
	 * @param age �ge de la personne
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * M�thode d'affichage de la personne
	 * @return affichage de la personne
	 */
	
	//toString() est la m�thode qui permet d'afficher l'objet et qui est d�finie dans la classe
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}

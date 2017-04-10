package metier;

import java.io.Serializable;

/**
 * Création de la classe Compte
 * @author Stagiaire
 *@version 1.0
 */
public class Compte implements Serializable {

	// Définition de l'attribut identifiant
	private int id;
	
	// Définition de l'attribut nom
	private String nom;
	
	// Définition de l'attribut solde
	private long solde;
	
	
	/**
	 * Création du premier constructeur
	 * @param id identifiant
	 * @param nom nom du compte
	 * @param solde solde du compte
	 */
	public Compte(int id, String nom, long solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
	}

	// Création du second constructeur
	public Compte() {
		super();
	}

	/**
	 * Création de la méthode get pour l'attribut Identifiant
	 * @return identifiant
	 */
	public int getId() {
		return id;
	}

	/**
	 * Création de la méthode get pour l'attribut Nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Création de la méthode get pour l'attribut Solde
	 * @return solde
	 */
	public long getSolde() {
		return solde;
	}
		/**
		 * Création de la méthode set pour l'attribut Identifiant
		 * @param id identifiant
		 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Création de la méthode set pour l'attribut Nom
	 * @param nom nom du compte
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	/**
	 * Création de la méthode set pour l'attribut Solde
	 * @param solde solde du compte
	 */

	public void setSolde(long solde) {
		this.solde = solde;
	}

	/**
	 * Affichage de tous les attributs de la classe Compte
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";
	}
	
	
}

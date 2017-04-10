package metier;

import java.io.Serializable;

/**
 * Cr�ation de la classe Compte
 * @author Stagiaire
 *@version 1.0
 */
public class Compte implements Serializable {

	// D�finition de l'attribut identifiant
	private int id;
	
	// D�finition de l'attribut nom
	private String nom;
	
	// D�finition de l'attribut solde
	private long solde;
	
	
	/**
	 * Cr�ation du premier constructeur
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

	// Cr�ation du second constructeur
	public Compte() {
		super();
	}

	/**
	 * Cr�ation de la m�thode get pour l'attribut Identifiant
	 * @return identifiant
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cr�ation de la m�thode get pour l'attribut Nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cr�ation de la m�thode get pour l'attribut Solde
	 * @return solde
	 */
	public long getSolde() {
		return solde;
	}
		/**
		 * Cr�ation de la m�thode set pour l'attribut Identifiant
		 * @param id identifiant
		 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Cr�ation de la m�thode set pour l'attribut Nom
	 * @param nom nom du compte
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	/**
	 * Cr�ation de la m�thode set pour l'attribut Solde
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

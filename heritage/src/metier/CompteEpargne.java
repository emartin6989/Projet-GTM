package metier;

/**
 * Classe Compte �pargne, fille de la classe Compte
 * @author Stagiaire
 *@version 1.0
 */
public class CompteEpargne extends Compte {
	
	private float taux;

	/**
	 * 
	 * @param taux le constructeur avec le taux 
	 */
	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}
	
/**
 * 
 * @param id identifiant du compte
 * @param nom nom du compte
 * @param solde solde du compte
 * @param taux taux du compte
 */
	public CompteEpargne(int id, String nom, float solde, float taux) {
		super(id, nom, solde);
		this.taux = taux;
	}


	/**
	 * 
	 * @return affiche le taux du compte �pargne
	 */
	public float getTaux() {
		return taux;
	}

	/**
	 * 
	 * @param taux modifie la valeur du taux du compte �pargne
	 */
	public void setTaux(float taux) {
		this.taux = taux;
	}

	/**
	 * Calcul les int�r�ts avec un taux en pourcent
	 * @return le montant des int�r�ts
	 */
	public float calculInterets() {
		float interets = this.getSolde()*this.getTaux()/100;
		return interets;
	}
	
	@Override
	public String toString() {
		return "Compte �pargne : [" + super.toString() + ", taux = " + taux + "]";
	}
	

}

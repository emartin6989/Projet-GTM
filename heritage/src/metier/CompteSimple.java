package metier;

/**
 * Classe Compte simple, fille de Compte 
 * @author Stagiaire
 *@version 1.0
 */

public class CompteSimple extends Compte {

	private float decouvert;

	/**
	 * 
	 * @param decouvert le decouvert autoris� du compte
	 */
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	/**
	 * 
	 * @param id l'identifiant
	 * @param nom le nom du compte
	 * @param solde le solde duc ompte
	 * @param decouvert le d�couvert autoris� du compte
	 */
	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);
		this.decouvert = decouvert;
	}
	

	@Override
	public float retirer (float mt) {
		
		if (mt<0) {
			
		}
		if (mt>=0){
	if (mt <= this.solde + this.decouvert) {
		
	this.solde= this.solde - mt;
		
	}
		}
	return this.getSolde();	
	}
	
/**
 * 
 * @return la valeur du d�couvert autoris�
 */
	public float getDecouvert() {
		return decouvert;
	}

	/**
	 * 
	 * @param decouvert modifier la valeur du d�couvert autoris�
	 */
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "Compte simple : [" + super.toString() + ", d�couvert = " + decouvert + "]";
	}
	
	
}

package metier;

/**
 * Classe Compte Payant, fille de Compte
 * @author Stagiaire
 *@version 1.0
 */
public class ComptePayant extends Compte {
	
	private float pourcentage;

	/**
	 * 
	 * @param pourcentage Le taux de prélèvement de chaque opération
	 */
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}

	
	
	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}



	/**
	 * 
	 * @return affiche le pourcentage de prélèvement
	 */
	public float getPourcentage() {
		return pourcentage;
	}

	/**
	 * 
	 * @param pourcentage modifier la valeur du pourcentage de prélèvement
	 */
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	
	@Override
	public float verser(float mt) {
		this.solde = this.solde + mt - pourcentage*mt/100;
				return this.solde;
	}
	
	@Override
	public float retirer (float mt) {
		
		if (mt<0){
			
		}
		if (mt>=0) {
		float cout = mt*(1+ pourcentage/100);
		
		if (cout <= this.solde) {
			this.solde = this.solde - (mt + mt*pourcentage/100);
			} 
		}
		return this.solde;
	}
		
	
	@Override
	public String toString() {
		return "Compte payant : [" + super.toString() + ", Pourcentage = " + pourcentage + "]";
	}

}

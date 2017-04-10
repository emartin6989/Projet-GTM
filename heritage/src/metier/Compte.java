package metier;

public class Compte {
	private int id;
	private String nom;
	protected float solde;
	private static int nbComptes;
	
	
	public static int getNbComptes() {
		return nbComptes;
	}


	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}


	public Compte() {
		super();
		nbComptes= nbComptes +1;
	}

	
	public Compte(int id, String nom, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		nbComptes = nbComptes + 1;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	/**
	 * methode verser
	 * @param mt montant à verser
	 * @return solde après versement
	 */
	public float verser(float mt) {
if (mt<0) {	
		}

		if (mt>0) {
			this.solde = this.solde + mt;
		}
			
	
		return this.solde;
}
	
	/**
	 * methode retirer
	 * @param mt montant à retirer
	 * @return solde après retrait
	 */
	public float retirer(float mt) {
		
		if (mt<0) {
			
		}
		 
		if (mt>0) {
			if (mt<= this.solde) {
				this.solde= this.solde - mt;
		}
			
			} 
		return this.solde;
	}

	@Override
	public String toString() {
		return "Compte : id = " + id + ", nom = " + nom + ", solde = " + solde;
	}
}

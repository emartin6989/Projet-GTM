package metier;

/**
 * Classe fille carré
 * @author Stagiaire
 *@version 1.0
 */
public class Carre extends Forme {
	
private int cote; 
	
/**
 * Création du constructeur 
 * @param cote le cote du carré
 */
	public Carre(int cote) {
		this.cote = cote;
	}
	
	/**
	 * @return Renvoie la valeur du périmètre d'un carré
	 */
	@Override
	public float perimetre() {

		return 4*cote;
	}

	/**
	 * @return Renvoie la valeur de la surface d'un carré
	 */
	@Override
	public float surface() {

		return cote*cote;
	}
	
	/**
	 * @return Renvoie la valeur du coté du carré
	 */
	@Override
	public String toString() {
		return "Le carre de cote " + cote;
	}
	
	
	}

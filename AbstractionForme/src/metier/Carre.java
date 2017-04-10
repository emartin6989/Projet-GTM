package metier;

/**
 * Classe fille carr�
 * @author Stagiaire
 *@version 1.0
 */
public class Carre extends Forme {
	
private int cote; 
	
/**
 * Cr�ation du constructeur 
 * @param cote le cote du carr�
 */
	public Carre(int cote) {
		this.cote = cote;
	}
	
	/**
	 * @return Renvoie la valeur du p�rim�tre d'un carr�
	 */
	@Override
	public float perimetre() {

		return 4*cote;
	}

	/**
	 * @return Renvoie la valeur de la surface d'un carr�
	 */
	@Override
	public float surface() {

		return cote*cote;
	}
	
	/**
	 * @return Renvoie la valeur du cot� du carr�
	 */
	@Override
	public String toString() {
		return "Le carre de cote " + cote;
	}
	
	
	}

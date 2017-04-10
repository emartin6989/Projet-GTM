package metier;

/**
 * Classe fille rectangle
 * @author Stagiaire
 *
 */
public class Rectangle extends Forme {

	private int longueur, largeur;
	
	/**
	 * Cration du constructeur
	 * @param longueur la longueur du rectangle
	 * @param largeur la largeur du rectangle
	 */
	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur= largeur;
	}
	
	/**
	 * @return Renvoie la valeur du périmètre d'un rectangle
	 */
	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return 2*(longueur + largeur);
	}

	/**
	 * @return Renvoie la valeur de la surface d'un rectangle
	 */
	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}
	
	/**
	 * @return Renvoie la valeur de la longueur et de la largeur du rectangle
	 */
	
	@Override
	public String toString() {
		return "Le rectangle de longueur " + longueur + " et de largeur "+ largeur;
	}
	

	
	
}

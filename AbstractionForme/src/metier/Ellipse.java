package metier;

/**
 * Classe fille ellipse
 * @author Stagiaire
 *@version 1.0
 */
public class Ellipse extends Forme {
private int grandAxe, petitAxe;

/**
 * Création du constructeur
 * @param grandAxe le grand axe de l'ellipse
 * @param petitAxe le petit axe de l'ellipse
 */
public Ellipse(int grandAxe, int petitAxe){
	this.grandAxe = grandAxe;
	this.petitAxe = petitAxe;
}

/**
 * @return Renvoie la valeur du périmètre d'une ellipse
 */
	@Override
	public float perimetre() {
		float resultat = 0;
		float pcarre = petitAxe*grandAxe;
		float gcarre = grandAxe*grandAxe;
		float sinus, cosinus;
		
		for (int i = 0; i<1000; i++) {
			sinus =(float)Math.sin(i*Math.PI/2000);
			cosinus =(float)Math.cos(i*Math.PI/2000);
			resultat += Math.sqrt(pcarre*sinus*sinus+gcarre*cosinus*cosinus);
		}
		resultat *=4*Math.PI/2000;
		return resultat;
	}

	/**
	 * @return Renvoie la valeur de la surface d'une ellipse
	 */
	@Override
	public float surface() {
		
		return(float)Math.PI*petitAxe*grandAxe;
	}

	
	/**
	 * @return Renvoie la valeur des grand et petit axes de l'ellipse
	 */
	@Override
	public String toString() {
		return ("l'ellipse de grand axe "+ grandAxe +", de petit axe "+petitAxe);
	}
	
	

	
}

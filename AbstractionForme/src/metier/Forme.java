package metier;

/**
 * Classe abstraite forme
 * @author Stagiaire
 *@version 1.0
 */
public abstract class Forme {
	
	public abstract float perimetre(); //methode abstraite du perimetre red�finie dans les classes filles
	public abstract float surface(); //methode abstraite de la surface red�finie dans les classes filles
	
	/**
	 * 
	 * @return La valeur du coefficient d'�talement
	 * 
	 */
	public double CoefficientEtalement(){
		double lePerimetre = perimetre();
		return 16 * surface() / (lePerimetre * lePerimetre);
	
		
	}
	
	
	

}

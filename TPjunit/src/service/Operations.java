package service;



public class Operations {
	
	//signature de la méthode additions
	// dans les arguments ... signifient tableau
	public static long add(long ... numbers)
	{
		//si la longueur de mon tableau nombre est supérieure à 0
		if (numbers.length>0) {
			
			//j'initialise le premier nombre de mon addition à 0
			long resultat = 0;
			
			/*
			 * pour toutes les cases du tableau nombres  
			 * de n= début du tableau nombres
			 * à numbers = dernière case du tableau number
			 */
				for(long n : numbers)
				{
					/*resultat est égale au résultat initial + la case suivante du tableau
					 * jusqu'à ce que toutes les cases du tableau soient parcourues 
					 * resultat = resultat + n
					 */
				resultat+=n;
				}
				//retourner la valeur du résultat
			return resultat;
		}
		
		//si le tableau de nombre est vide
        else {
        	return 0;
		} 
	}
        	
   
	public static long mult(long ... numbers)
	{
		if (numbers.length>0) {
			
			// initialise résultat à 1 car 0* un nombre =0 
			long resultat = 1;
				
				for(long n : numbers)
				{
					// resultat = resultat *n
				resultat*=n;
				}
			
			return resultat;
		}
		else {
		return 0;
		}
		}
}


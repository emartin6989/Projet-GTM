package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {

		//utilisation de l'interface List pour créer un objet ArrayList
		List al = new ArrayList();
		
		//ajout des éléments dans la liste
		al.add(12);
		al.add("toto");
		al.add(5.8f);
		al.add(true);
		al.add('d');
		al.add('d');
		

		/*List a une size pour s'arrêter et peut afficher les données via get. 
		 * On peut donc faire une boucle for
		 */
		for (int i=0; i<al.size(); i++)
		{
			System.out.println("La valeur attribuée à l'indice " + i+ " est "+ al.get(i)+".");
		}
	}

}

package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {

		//utilisation de l'interface List pour cr�er un objet ArrayList
		List al = new ArrayList();
		
		//ajout des �l�ments dans la liste
		al.add(12);
		al.add("toto");
		al.add(5.8f);
		al.add(true);
		al.add('d');
		al.add('d');
		

		/*List a une size pour s'arr�ter et peut afficher les donn�es via get. 
		 * On peut donc faire une boucle for
		 */
		for (int i=0; i<al.size(); i++)
		{
			System.out.println("La valeur attribu�e � l'indice " + i+ " est "+ al.get(i)+".");
		}
	}

}

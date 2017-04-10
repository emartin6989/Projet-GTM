package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {

		//utilisation de l'interface set pour créer un objet de la classe HashSet
		Set hs = new HashSet();
		
		//ajout des éléments à la collection set via methode add
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		hs.add('d');
		
		/*parcours des éléments
		 * il y a size mais pas de get.
		 * On passe donc par l'iterator
		 */
		Iterator it = hs.iterator();
		
		//tant qu'il reste des éléments à afficher : signification de la méthode hasNext
		while(it.hasNext())
			
			//afficher l'élément via la méthode next
			System.out.println(it.next());

		
	}

}

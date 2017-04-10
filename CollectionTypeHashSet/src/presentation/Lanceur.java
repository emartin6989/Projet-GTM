package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {

		//utilisation de l'interface set pour cr�er un objet de la classe HashSet
		Set hs = new HashSet();
		
		//ajout des �l�ments � la collection set via methode add
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		hs.add('d');
		
		/*parcours des �l�ments
		 * il y a size mais pas de get.
		 * On passe donc par l'iterator
		 */
		Iterator it = hs.iterator();
		
		//tant qu'il reste des �l�ments � afficher : signification de la m�thode hasNext
		while(it.hasNext())
			
			//afficher l'�l�ment via la m�thode next
			System.out.println(it.next());

		
	}

}

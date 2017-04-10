package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
	
		//utilisation de l'interface SortedSet pour créer un objet TreeSet
		SortedSet<Personne> set = new TreeSet<Personne>(
				
				//On doit déclarer une fonction interne dans le Treeset afin de dire
				//la variable que l'on souhaite trier
				new Comparator<Personne>() {
            
					/*methode compare pour trier les personnes
					 * (non-Javadoc)
					 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
					
					@Override
					public int compare(Personne o1, Personne o2) {
						
						//si 2 personnes ont le même nom
						if(o1.getNom().equals(o2.getNom())){
							
						//on trie par les prénoms
						//Compare to si a>b renvoie 1 et range à droite, 
						 * a=b renvoie 0, 
						 * a<b renvoie -1 et range à gauche.
						return o1.getPrenom().compareTo(o2.getPrenom());
						}
						
						//sinon
						else{
							
						//on compare les noms
						return o1.getNom().compareTo(o2.getNom());	
						}
				} */
					
					/*@Override
					public int compare(Personne o1, Personne o2) {
						
						//comparaison entre ID avec besoin de transtyper en Integer
						//pour compare to. Sinon on change directement le type du getter en Integer
						return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
					}*/
					
					@Override
					public int compare(Personne o1, Personne o2) {
						
						//comparaison entre ID avec besoin de transtyper en Integer
						//on peut créer un second getter de type Integer dans la classe Personne
						return o1.getId2().compareTo(o2.getId2());
					}
					});
		
		//Création des objets personnes
		Personne p  = new Personne(3, "NUCHE", "nu");
		Personne p1 = new Personne(4, "FLUCHTE", "truc");
		Personne p2 = new Personne(2, "FLUCHTE", "muchte");
		Personne p3 = new Personne(1, "NUCHE", "puche");
		
		//ajouter les personnes à la Collection SortedSet
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		//parcourir et afficher la collection
		
		//pour toutes les personnes parcourir la collection avec une variable m
        for (Personne m : set)	
        {
        	System.out.println(m);
        }
	}

}

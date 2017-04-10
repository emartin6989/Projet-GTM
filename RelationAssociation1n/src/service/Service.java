package service;

import java.util.ArrayList;
import java.util.Collection;

import metier.Personne;
import metier.Voiture;

public class Service implements IService {

	@Override
	public void ajouterVoiture(Personne p, Voiture v) {
	
		//on récupère la collection de voiture existante pour la personne p
		Collection<Voiture> col = p.getMesVoitures();
		
		//j'ajoute la nouvelle voiture à la collection de la personne
		col.add(v);
		
		//je modifie mon ancienne collection avec la voiture ajoutée
		p.setMesVoitures(col);
		
		//j'assigne également à la nouvelle voiture son nouveau propriétaire
		v.setProprietaire(p);
	}

	//pour afficher la collection, il suffit de retourner le getter de la collection
	@Override
	public Collection<Voiture> afficheVoiture(Personne p) {
		
		return p.getMesVoitures();
	}

}

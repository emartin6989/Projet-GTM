package presentation;

import metier.Personne;
import metier.Voiture;
import service.IService;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {

		IService service = new Service();
		
		Personne p = new Personne();
		p.setIdPersonne(12);
		p.setNomPersonne("toto");
		p.setPrenomPersonne("tata");

		
		Voiture v = new Voiture();
		v.setCouleur("rouge");
		v.setIdVoiture(1);
		v.setMarque("Ferrari");
		
		Voiture v2 = new Voiture();
		v.setCouleur("jaune");
		v.setIdVoiture(3);
		v.setMarque("Ferrari");
		
		System.out.println(p);
		
		service.ajouterVoiture(p, v);
		
		System.out.println(p);
		
		service.ajouterVoiture(p, v2);
		
		System.out.println(p);
		
	}

}

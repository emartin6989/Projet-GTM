package service;

import metier.Personne;

public class PersonneService {

	public String marcher(Personne p)
	{
		return p.getPrenom() + " marche";
	}
	
	public String arreter(Personne p)
	{
		return p.getPrenom() + " s'arrête";
	}
}

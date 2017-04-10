package metier.tests;



import org.junit.Assert;
import org.junit.Test;

import metier.Compte;

public class CompteTests {

	//test cas classique d'ajout au compte
	@Test
	public void testVerser() {
	Compte c= new Compte(35, "Martinuche", 500);
		float resultat = c.verser(150);
		Assert.assertEquals(true, resultat==650);
	}
	
	//test cas d'ajout d'un montant négatif
	@Test
	public void testVerser2() {
	Compte c= new Compte(35, "Martinuche", 500);
		float resultat = c.verser(-3);
		Assert.assertEquals(true, resultat==500);
	}

	//test retrait classique
	@Test
	public void testRetirer() {
		Compte c= new Compte(35, "Martinuche", 500);
		float resultat = c.retirer(150);
		Assert.assertEquals(350, resultat, 0);
	}

	//test retrait au delà du solde
	@Test
	public void testRetirer2() {
		Compte c= new Compte(35, "Martinuche", 500);
		float resultat = c.retirer(600);
		Assert.assertEquals(500, resultat, 0);
	}
	
	//retrait d'un montant négatif
	@Test
	public void testRetirer3() {
		Compte c= new Compte(35, "Martinuche", 500);
		float resultat = c.retirer(-3);
		Assert.assertEquals(500, resultat, 0);
	}
}

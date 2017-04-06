package metier.tests;
import org.junit.Assert;
import org.junit.Test;


import metier.CompteEpargne;

public class CompteEpargneTest {

	@Test
	public void testCalculInterets() {
		CompteEpargne ce = new CompteEpargne(350, "nunuche", 150, 3.5f);
		
		float resultat = ce.calculInterets();
		Assert.assertEquals(150*3.5/100, resultat, 0);
	}

}

package metier.tests;



import org.junit.Assert;
import org.junit.Test;

import metier.ComptePayant;

public class ComptePayantTest {

	@Test
	public void testVerser() {
		ComptePayant cp = new ComptePayant(52, "Plouf", 150, 3.5f);
		float resultat = cp.verser(3);
		Assert.assertEquals(150+3-3.5/100*3, resultat, 0.0005);
	}

	@Test
	public void testRetirer() {
		ComptePayant cp = new ComptePayant(52, "Plouf", 150, 3.5f);
		float resultat = cp.retirer(3);
		Assert.assertEquals(150-3-3.5/100*3, resultat, 0.0005);
	}

}

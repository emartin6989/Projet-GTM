package metier.tests;



import org.junit.Assert;
import org.junit.Test;

import metier.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer() {
		CompteSimple cs= new CompteSimple(35, "Martinuche", 500, 300);
		
				float resultat = cs.retirer(600);
		Assert.assertEquals(-100, resultat, 0);		
	}
	
	@Test
	public void testRetirer2() {
		CompteSimple cs= new CompteSimple(35, "Martinuche", 500, 300);
		
				float resultat = cs.retirer(801);
		Assert.assertEquals(500, resultat, 0);		
	}

	@Test
	public void testRetirer3() {
		CompteSimple cs= new CompteSimple(35, "Martinuche", 500, 300);
		
				float resultat = cs.retirer(800);
		Assert.assertEquals(-300, resultat, 0);		
	}
	
	@Test
	public void testRetirer4() {
		CompteSimple cs= new CompteSimple(35, "Martinuche", 500, 300);
		
				float resultat = cs.retirer(400);
		Assert.assertEquals(100, resultat, 0);		
	}
	
	@Test
	public void testRetirer5() {
		CompteSimple cs= new CompteSimple(35, "Martinuche", 500, 300);
		
				float resultat = cs.retirer(-400);
		Assert.assertEquals(500, resultat, 0);		
	}
}

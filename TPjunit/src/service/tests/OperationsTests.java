package service.tests;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import service.Operations;

public class OperationsTests {

	@Test
	public void testAdd() {
		System.out.println("test add");
		long resultat = Operations.add(10,20,30);
		Assert.assertEquals(resultat, 60);
	}

	@Test
	public void testAdd2() {
		long resultat = Operations.add(100,20,30);
		Assert.assertEquals(resultat, 100+20+30);
	}
	
	@Test
	public void testMult() {
		long resultat = Operations.mult(10,20,30);
		Assert.assertEquals(resultat, 10*20*30);
		
	}
	
	@Test
	public void testMult2() {
		long resultat = Operations.mult(100,20);
		Assert.assertEquals(resultat, 100*20);
		
	}

	@Before
	public void testBefore() {
		System.out.println(">>avant chaque test");
	}
	
	@After
	public void testAfter() {
		System.out.println(">> après chaque test");
	}
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("-------------------------");
		System.out.println("avant chaque test suite");
		System.out.println("-------------------------");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("-------------------------");
		System.out.println("après chaque test suite");
		System.out.println("-------------------------");
	}
	
	}


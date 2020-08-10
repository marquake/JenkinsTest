package test.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Main;

/**
 * 
 */

/**
 * @author A154308
 *
 */
public class TestJenkins {



	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

//	/**
//	 * Test method for {@link main.java.com.mqk.jenkinsTest.Main#main(java.lang.String[])}.
//	 */
//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link main.java.Main#suma(int, int)}.
	 */
	@Test
	public void testSuma() {
		Main main = new Main();
		int resultado = main.suma(5, 6);

		Assert.assertTrue(resultado == 11);
	}

	/**
	 * Test method for {@link main.java.Main#resta(int, int)}.
	 */
	@Test
	public void testResta() {
		Main main = new Main();
		int resultado = main.resta(22, 10);
		
		Assert.assertTrue(resultado == 12);
	}

	/**
	 * Test method for {@link main.java.Main#multiplicacion(int, int)}.
	 */
	@Test
	public void testMultiplicacion() {
		Main main = new Main();
		int resultado = main.multiplicacion(4, 12);
		
		Assert.assertTrue(resultado == 48);
	}

}

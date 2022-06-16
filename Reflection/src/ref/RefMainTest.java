package ref;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefMainTest {

	/* These test are written for public methods written in the class passed.
	 * if some method is private we have to make it public or write a reflection API in test class
	 * using getDeclaredFields()
	 */
		
	/*1 we checks here whether the getA() method is worked.
	 * a=25, b=50, c=75 
	 * Actual value should be 25
	 */	
	@Test
	public void testgetA() {
		RefMain r = new RefMain(25,50,75);
		assertEquals(25,r.getA());
	}
	
	/*2 we checks here whether the setA() method is worked.
	 * new A value= 30
	 * Actual value should be 30
	 */	
	@Test
	public void testsetA() {
		RefMain r = new RefMain();
		r.setA(30);
		assertEquals(30,r.getA());
	}
	
	/*3 we checks here whether the SquareA() method is worked.
	 * b=25
	 * Actual value should be 25*25 = 900
	 */	
	@Test
	public void testSquareA() {
		RefMain r = new RefMain(25,50,75);
		r.squareA();
		assertEquals(625,r.getA());
	}	

	
	/*4 we checks here whether the SquareB() method is worked.
	 * new B value= 30
	 * Actual value should be 30*30 = 900
	 */
	@Test
	public void testSetBSquareB() {
		RefMain r = new RefMain();
		r.setB(30);
		r.squareB();
		assertEquals(900,r.getB());
	}
	
	/*5 we checks here whether the toString() method is worked.
	 * a=25 b=50 C=75
	 * and from toSting() it will displayed as 
	 * a:25, b:50, c:75
	 */
	@Test
	public void testSquare() {
		RefMain r = new RefMain(25,50,75);
		r.getA();
		r.getB();
		r.getC();
		assertEquals("(a:25, b:50, c:75)",r.toString() );
		
	}
	

}

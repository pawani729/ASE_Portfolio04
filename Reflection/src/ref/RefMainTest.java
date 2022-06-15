package ref;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefMainTest {

	@Test
	public void test() {
		RefMain r = new RefMain(25,50,75);
		r.setA(30);
		assertEquals(30,r.getA());
	}
	
	@Test
	public void testSquareA() {
		RefMain r = new RefMain(25,50,75);
		r.setB(30);
		assertEquals(30,r.getB());
	}

}

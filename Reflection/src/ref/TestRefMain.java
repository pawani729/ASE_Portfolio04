package ref;
import static ref.KUnit.*;

public class TestRefMain {
	
	void checkConstructorAndAccess() {
		RefMain s = new RefMain (25,50,75);
		checkEquals(s.getA(),25);
		checkEquals(s.getB(),50);
		checkEquals(s.getC(),75);
		checkNotEquals(s.getA(),25);
		checkNotEquals(s.getB(),50);
		checkNotEquals(s.getC(),75);
		
	}

	void checkSquareA() {
		RefMain s=new RefMain(25,50,75);
		s.squareA();
		checkEquals(s.getA(),625);
		checkNotEquals(s.getA(),625);
		checkEquals(s.getA(),25);	
	}
	
	void checkSquareB() {
		RefMain s=new RefMain(25,50,75);
		s.squareB();
		checkEquals(s.getB(),2500);
		checkNotEquals(s.getB(),2500);
		checkEquals(s.getB(),50);	
	}
	
	void checkSquareC() {
		RefMain s=new RefMain(25,50,75);
		s.squareC();
		checkEquals(s.getC(),5625);
		checkNotEquals(s.getC(),5625);
		checkEquals(s.getC(),75);	
	}
	
	public static void main(String[] args) {
		TestRefMain ts=new TestRefMain();
		ts.checkConstructorAndAccess();
		ts.checkSquareA();
		ts.checkSquareB();
		ts.checkSquareC();
		report();
		
	}

}

package ref;
import static ref.KUnit.*;

public class TestRefMain {
	
	void checkConstructorAndAccess() {
		RefMain s = new RefMain (3, 4, 5);
		checkEquals(s.getA(),3);
		checkEquals(s.getB(),4);
		checkEquals(s.getC(),5);
		checkNotEquals(s.getA(),5);
		checkNotEquals(s.getB(),3);
		checkNotEquals(s.getC(),4);
		
	}
	

	void checkSquareA() {
		RefMain s=new RefMain(3,4,5);
		s.squareA();
		checkEquals(s.getA(),9);
		checkEquals(s.getB(),4);
		
	}
	
	public static void main(String[] args) {
		TestRefMain ts=new TestRefMain();
		ts.checkConstructorAndAccess();
		ts.checkSquareA();
		report();
		
	}

}

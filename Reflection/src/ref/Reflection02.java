package ref;

public class Reflection02 {
  public static void main(String[] args) {
    RefMain r = new RefMain();
    r.squareB();
    
  // s.squareB(); //if you uncomment this you will get a complier error
    long b = r.b;
    
  
  // long b = s.b; //if you uncomment this you will get a complier error
    System.out.println("ref=" + r);
  }
}

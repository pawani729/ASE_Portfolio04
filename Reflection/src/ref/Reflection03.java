package ref;

/*
 * explores the Reflection API.
 * It demonstrates how to find out which class an object is an instance of.
 * getClass returns an object belonging to the class called Class.
 * The getName method of the Class object is called to find out just the class
 */

public class Reflection03 {

  public static void main(String[] args) {
    RefMain r = new RefMain();
    System.out.println("class =" + r.getClass());
    System.out.println("class name =" + r.getClass().getName());
}
}

package ref;

import java.lang.reflect.*;

public class Reflection10 {
 public static void main(String[] args) throws Exception {
 RefMain r = new RefMain();
 Method m = r.getClass().getDeclaredMethod("setA", long.class);
 m.setAccessible(true);
 m.invoke(r, 86);
 System.out.println(r);
 }
}

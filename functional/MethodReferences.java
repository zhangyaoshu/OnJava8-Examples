// functional/MethodReferences.java
// �2016 MindView LLC: see Copyright.txt
import java.util.*;

public class MethodReferences {
  static class Description {
    String describe;
    public Description(String desc) {
      describe = desc;
    }
    public void show() { System.out.println(describe); }
  }
  public static void main(String[] args) {
    List<String> keys = Arrays.asList(
      "Every", "Good", "Boy", "Deserves", "Fudge");
    keys.forEach(System.out::println); // (1)

    List<Description> descriptions = new ArrayList<>();
    for(String k : keys)
      descriptions.add(new Description(k));
    descriptions.forEach(Description::show); // (2)
  }
}
/* Output:
Every
Good
Boy
Deserves
Fudge
Every
Good
Boy
Deserves
Fudge
*/
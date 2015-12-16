// exceptions/MultiCatch.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.

public class MultiCatch {
  void x() throws Except1, Except2, Except3, Except4 {}
  void process() {}
  void f() {
    try {
      x();
    } catch(Except1 | Except2 | Except3 | Except4 e) {
      process();
    }
  }
}
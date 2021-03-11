public class Main {
  public static void main(String[] args) {
    A a = new B();
    a.sample();
  }
}

public interface A {
  default void sample() {
    System.out.println("sample");
  }
}

public class B implements A {}
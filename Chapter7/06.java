public class Main {
  public static void main(String[] args) {
    A a = new C();
    a.sample();
  }
}

public interface A {
  default void sample() {
    System.out.println("Hello");
  }
}

public interface B extends A {

}

public class C implements B {
  @Override
  public void sample() {
    B.super.sample();
    System.out.println("JAVA");
  }
}
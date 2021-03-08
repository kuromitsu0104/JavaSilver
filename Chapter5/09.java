public class Main {
  public static void main(String[] args) {
    A[] array = {new C(), null, new D()};
    Object[] objArray = array;
  }
}

public interface A {}
public abstract class B implements A {}
public class C extends B {}
public class D extends C {}
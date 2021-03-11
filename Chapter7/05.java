public class Main {
  public static void main(String[] args) {
    A a = new B();
    System.out.println(a);
  }
}

public interface A {
  @Override
  default String toString() {
    return "A";
  }
}

public class B implements A {
  @Override
  public String toString() {
    return "B";
  }
}

// interfaceでObjectクラスをオーバーライドするとコンパイルエラーが発生
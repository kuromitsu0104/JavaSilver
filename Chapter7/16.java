public class Main {
  public static void main(String[] args) {
    A a = new B();
    B b = (B) a;
    b.hello();
  }
}

class A {}

class B extends A {
  void hello() {
    System.out.println("hello");
  }
}

// ダウンキャストは自動で行われない
// アップキャストは extends宣言 で自動的に行われる
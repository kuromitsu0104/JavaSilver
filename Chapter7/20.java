public class Main {
  public static void main(String[] args) {
    A a = new B();
    // B b = new B();
  }
}

class A {
  public A() {
    System.out.println("A");
  }
}

class B extends A {
  public B() {
    // super();  <= コンパイラによって自動挿入される。
    System.out.println("B");
  }
}

// スーパークラスのコンストラクタから先に実行される。
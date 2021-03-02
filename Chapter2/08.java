public class Main {
  public static void main(String[] args) {
    var a = new B();
    // a = new C();
    // B型の変数にCクラスのインスタンスを代入しようとしてコンパイルエラーが発生する。
    a.test();
  }
}

public class A {
  public void test() {
    System.out.println("A");
  }
}

public class B extends A {
  @Override
  public void test() {
    System.out.println("B");
  }
}

public class C extends A {
  @Override
  public void test() {
    System.out.println("C");
  }
}
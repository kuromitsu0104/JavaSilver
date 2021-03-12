public class Main implements A, B {
  public static void main(String[] args) {
    new Main().test();
  }
  public void test() {
    A.super.test();
  }
}

public interface A {
  default void test() {
    System.out.println("A");
  }
}

public interface B {
  default void test() {
    System.out.println("B");
  }
}

// 同じシグニチャのデフォルトメソッドを継承する場合にコンパイルエラーが発生する。
// クラス内でデフォルトメソッドをオーバーライドして、その中で継承元のデフォルトメソッドを呼び出して対応。
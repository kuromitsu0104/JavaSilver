public class Main {
  public static void main(String[] args) {
    Sample s = new Sample();
  }
}

public class Sample {
  Sample() {
    System.out.println("A");
  }
  {
    System.out.println("B");
  }
}

// 初期化子はコンストラクタが実行される前に実行される
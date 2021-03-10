public class Main {
  public static void main(String[] args) {
    Sample s = new Sample();
  }
}

public class Sample {
  public Sample() {
    this(null, 0);
  }
  public Sample(String str, int num) {
    System.out.println("ok.");
  }
}

// オーバーロードされた別のコンストラクタを呼び出す場合は this を使う。
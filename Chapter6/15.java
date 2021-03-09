public class Main {
  public static void main(String[] args) {
    Sample s = new Sample();
    s.method(10);
  }
}

public class Sample {
  public void method(int num) {
    // return
    System.out.println(num);
  }
}

// 到達不可能な処理を含む場合にコンパイルエラーが発生する。
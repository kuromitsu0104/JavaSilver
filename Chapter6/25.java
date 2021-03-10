public class Main {
  public static void main(String[] args) {
    Sample s = new Sample();
  }
}

public class Sample {
  public Sample() {
    System.out.println("A");
    // this("B");
  }
  public Sample(String str) {
    System.out.println(str);
  }
}

// thisは最初に記述しなければコンパイルエラーが発生する。
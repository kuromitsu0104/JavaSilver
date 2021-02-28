public class Main {
  public static void main(String[] args) {
    Sample s = new Sample("sample");
    s.test();
  }
}

public class Sample {
  private String value;
  public Sample(String value) {
    this.value = value;
  }
  public void test() {
    System.out.println(value);
  }
}
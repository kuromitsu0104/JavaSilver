public class Main {
  public static void main(String[] args) {
    Sample s = new Sample();
    System.out.println(s.add(10));
  }
}

public class Sample {
  public int add(Integer a, Integer b) {
    return a + b;
  }
}
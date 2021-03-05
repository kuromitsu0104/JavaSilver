public class Main {
  public static void main(String[] args) {
    Object a = new Sample(10);
    Object b = new Sample(10);
    System.out.println(a.equals(b));
  }
}

public class Sample {
  private int num;
  public Sample(int num) {
    this.num = num;
  }
  public boolean equals(Sample obj) {
    if (obj == null) {
      return false;
    }
    return this.num == obj.num;
  }
}
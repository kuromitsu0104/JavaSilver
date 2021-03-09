public class Main {
  public static void main(String[] args) {
    Item a = new Item();
    Item b = new Item();
    b.setNum(20);
    System.out.println(a.getNum());
  }
}

public class Item {
  private int num = 10;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return this.num;
  }
}
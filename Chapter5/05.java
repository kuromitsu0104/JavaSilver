public class Main {
  public static void main(String[] args) {
    Item[] items = new Item[3];
    int total = 0;
    for (int i = 0; i < items.length; i++) {
      total += items[i].price;
    }
    System.out.println(total);
  }
}

public class Item {
  String name;
  int price = 100;
}
// 配列インスタンスの要素はnullで初期化される。
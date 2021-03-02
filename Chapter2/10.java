public class Main {
  public static void main(String[] args) {
    String str = "hoge, world.";
    hello(str);
    System.out.println(str);
  }
  private static void hello(String msg) {
    var res = msg.replaceAll("hoge", "hello");
    // replaceAll => 第一引数の値を第二引数の値に置き換える。
    System.out.println(res);
  }
}
public class Main {
  public static void main(String[] args) {
    String a = new String("sample");
    String b = "sample";
    System.out.print(a == b);
    System.out.print(", ");
    System.out.println(a.equals(b));
  }
}
// 文字列リテラルの場合はコンスタントプールにより同一参照となる
// new演算子では明示的に新しいインスタンスを作成するため、参照元が異なりfalseとなる
// ==演算子では同一性を確認
// .equalsメソッドでは値が一致するのか確認
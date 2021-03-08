public class Main {
  public static void main(String[] args) {
    String[][] array = {{"A", "B"}, null, {"C", "D", "E"}};
    int total = 0;
    for (String[] tmp : array) {
      total += tmp.length;
    }
    System.out.println(total);
  }
}
// 参照先の存在しないnullでlengthメソッドを実行しようとしてエラーを投げる。
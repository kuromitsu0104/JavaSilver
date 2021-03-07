public class Main {
  public static void main(String[] args) {
    int array[][] = new int[][] { {1, 2}, {2, 3, 4} };
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array[i].length; j++) {
        total += array[i][j];
      }
    }
    System.out.println(total);
  }
}
// 多次元配列を任意の値で初期化
// データ型[][] 配列変数名 = {{a, b}, {c, d, e}}
// データ型[][] 配列変数名 = new int[][] {{a, b}, {c, d, e}}

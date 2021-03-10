package ex27;

public class Main {
  public static void main(String[] args) {
    StoryBook story = new StoryBook();
    story.setIsbn("xxx-x-xxxxxx-xx-x");
    story.printInfo();
  }
}

// public    => すべてのクラスからアクセス可能
// protected => 同じパッケージに属するか、景勝しているサブクラスからのみアクセス可能
// default   => 同じパッケージに属するクラスからのみアクセス可能
// private   => クラス内からのみアクセス可能
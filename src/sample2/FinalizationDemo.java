package sample2;
/**
 * finalize()在对象被垃圾收集器回收之前调用，指定在对象销毁时候要执行的操作
 * finallze()overrideして何らかの終了処理をするようなことは書いてはいけない。
 * 処理が終わったときに、何かしたいのであれば,finally節を使う。
 *
 */
public class FinalizationDemo {
  public static void main(String[] args) {
    Cake c1 = new Cake(1);
    Cake c2 = new Cake(2);
    Cake c3 = new Cake(3);

    c2 = null;
    c3 = null;

    System.gc(); //调用Java垃圾收集器
  }
}

class Cake extends Object {
  private int id;
  public Cake(int id) {
    this.id = id;
    System.out.println("Cake Object " + id + "is created");
  }

  protected void finalize() throws java.lang.Throwable {
    super.finalize();
    System.out.println("Cake Object " + id + "is disposed");
  }
}
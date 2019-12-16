package sample;

/**
 * Javaの列挙型はフィールドやコンストラクタを定義できるので、初期値の設定もできる。
 * @author dev6923626ic
 *
 */
public class FruitEnum {

    //Enumのconstructorのアクセス修飾子はprivateのみ許される
    //Enumは別クラスを継承できない。
    protected enum Fruit {
        Orange("Ehime"),
        Applet("Aich"),
        Melon("Ibaraki");

        //フィールドの定義
        private String name;

        //コンストラクタの定義
        private Fruit(String name) {
            this.name = name;
        }

        //メソッド
        public String getValue() {
            return this.name;
        }
    }
    /***
     * メソッドの定義：定義したフィールドの値をGET
     * @param args
     */
    public static void main(String args[]) {
        for(Fruit fruit : Fruit.values()) {
            //ordinal()はenumの用意したメソッドで、列挙子の順番を取得する。
            System.out.println(fruit.ordinal() + " : " + fruit.name() + " : " + fruit.getValue());

        }
    }
}

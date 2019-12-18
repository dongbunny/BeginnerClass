package sample;

/***
 *
 * Enum 列挙型
 * @author dev6923626ic
 *
 */
/*class FreshJuice {

    enum FreshJuiceSize{
        SMALL,
        MEDIUM,
        LARGE

    }
    FreshJuiceSize size;

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;

    }
}*/

class FreshJuice {

    public static void main(String arg[]) {

        // switch文の使い方
        /*Fruit fruit_type = Fruit.Orange;

        switch(fruit_type) {

            case Orange:
                    System.out.println("おいしいミカン");
                    break;

            case Apple:
                System.out.println("おいしいリンゴ");
                break;

            case Melon:
                System.out.println("おいしいメロン");
                break;
        }*/

        // valueof
        /*if (Fruit.Orange == Fruit.valueOf("Orange")) {
            System.out.println("一緒です。");
        }*/

        //values
        for(Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }


    }

    protected enum Fruit {
        Orange,
        Apple,
        Melon
    };
}
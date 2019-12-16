package sample;

/**
 * multi thread処理で使われる
 * TASK:実行結果(volatile修飾子なしの場合)
 * @author dev6923626ic
 *
 */
public class volatileSample {

    //single thread :  スレッドが一列で順番に処理されていくこと
    //multi thread : 複数あり並列に同時進行で処理されていく
    //    →それぞれのスレッドが同じフィールドの値を別々にキャッシュする
    //cache:メモリとは違う場所に値を保持することで、高速に値の呼出しや更新ができる
    //要注意:同じフィールドであっても、値が違ってくる危険性がある

    private static volatile int count = 0;

    //private static int count =0;
    public static void main(String[] args) {
        new MuitiThread1().start();
        new MuitiThread2().start();
    }
    static class MuitiThread1 extends Thread {

        public void run() {
            int val = count;
            while(count < 3) {
                if(val != count) {
                    String message = getName() + ": val=" + val +",count=" + count;
                    System.out.println(message + "更新");
                    val = count;
                }
            }
        }
    }

    static class MuitiThread2 extends Thread {

        public void run() {
            int val = count;
            while(count < 3) {
                try {
                    Thread.sleep(500);
                }catch(InterruptedException exception) {
                    exception.printStackTrace();
                }
                String message = getName() + ": val=" + val +",count=" + count;
                System.out.println(message);
                count = ++val;
            }
        }
    }
}

package sample;
/**
 * status修饰符用来创建类方法和类变量
 * static声明静态变量和静态方法
 * 静态变量=类变量
 * 静态方法不能使用类的非静态变量。
 * 静态方法从参数列表得到数据，然后计算这些数据。
 * @author dev6923626ic
 *
 */
public class InstanceCounter {

    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {

        System.out.println("Starting with " + InstanceCounter.getCount() + "instances");
        for(int i=0;i<500;i++) {
            new InstanceCounter();
        }
        System.out.println("Created" + InstanceCounter.getCount() + "instances.");
    }
}

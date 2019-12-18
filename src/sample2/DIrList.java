package sample2;

import java.io.File;

/**
 * 调用方法来提取它包含的文件和文件夹的列表
 * @author dev6923626ic
 *
 */

public class DIrList {

    public static void main(String args[]) {
        String dirname = "C:/pleiades/workspace/BeginnerClass";
        File f1 = new File(dirname);

        //TODO : binとsrcが二回呼ばれることを確認
        if(f1.isDirectory()) {
            System.out.println("目录 : " + dirname);
            String s[] = f1.list();
            for(int i=0;i<s.length;i++) {
                File file = new File(dirname + "/" + s[i]);
                if(file.isDirectory()) {
                    System.out.println(s[i] + "是一个目录");
                }
                    System.out.println(s[i] + "是一个文件");
            }
        }else {
            System.out.println(dirname + "不是一个目录");
        }
    }
}


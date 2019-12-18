package sample2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("AHHAHHAHA");

        //for-listで
        for(String str : list) {
            System.out.println(str);
        }

        //把链表变成数组相关内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(int i =0; i<strArray.length;i++) {
           System.out.println(strArray[i]);
        }

        //使用迭代器进行遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}

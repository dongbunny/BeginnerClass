package sample2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

   public static void main(String args) {

       Map<String, String> map = new HashMap<String, String>();
       map.put("1", "value1");
       map.put("2", "value2");
       map.put("3", "value3");


       //1，普遍使用，二次取值
       System.out.println("通过Map.keySet遍历key，value");
       for(String key : map.keySet()) {
           System.out.println("key = " + key + ",value = "+ map.get(key));

       }


       //2."通过Map.entrySet使用iterator遍历key和value："
       Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
       while(it.hasNext()) {
           Map.Entry<String, String> entry = it.next();
           System.out.println("key = " + entry.getKey() + ",value = "+ entry.getValue());
       }


       //3."通过Map.entrySet遍历key和value"
       for(Map.Entry<String, String> entry : map.entrySet()) {
           System.out.println("key = " + entry.getKey() + ",value = "+ entry.getValue());

       }

       //4."通过Map.values()遍历所有的value，但不能遍历key"
       for(String vString : map.values()) {
           System.out.println("value = " + vString);
       }
   }
}

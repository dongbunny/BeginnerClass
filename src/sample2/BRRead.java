package sample2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用BufferedReader在控制台读取字符直到用户输入'q'
 * @author dev6923626ic
 *
 */
public class BRRead {
    public static void main(String args[]) throws IOException{
        char c;
        //使用system.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'健退出。");

        //读取字符
        do {

            c = (char) br.read();
            System.out.println(c);
        }while(c != 'q');
    }

}

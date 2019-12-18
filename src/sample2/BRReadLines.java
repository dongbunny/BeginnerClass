package sample2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用BufferedReader在控制台读取字符
public class BRReadLines {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");

        do {
            string = br.readLine();
            System.out.println(string);
        }while(!string.equals("end"));
    }
}

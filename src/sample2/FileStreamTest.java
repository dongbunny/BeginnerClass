package sample2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileStreamTest {

    public static void main(String args[]) throws IOException {

       try {

           File file = new File("a.txt");

           //构建FileOutputStream对象，文件不存在会自动新建
           FileOutputStream fop = new FileOutputStream(file);

           OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");

           //写入到缓冲区然后换行
           writer.append("中国語で入力してください");
           writer.append("\r\n");

           //关闭写字流
           writer.close();

           //关闭输出流
           fop.close();

           FileInputStream fileInputStream = new FileInputStream(file);
           InputStreamReader isr = new InputStreamReader(fileInputStream,"UTF-8");

           StringBuffer sb = new StringBuffer();
           while(isr.ready()) {

               char c = (char) isr.read();
               sb.append(c);
           }
           System.out.println(sb.toString());


           isr.close();
           fileInputStream.close();

        } catch (FileNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

        /** 文字化け */
        /*try {
            byte bWrite[] = {11,2,31,45,6};

            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length;x++) {
                //writes the bytes
                os.write(bWrite[x]);
            }
            os.close();


            InputStream iStream = new FileInputStream("test.txt");
            int size = iStream.available();

            for(int i=0; i<size;i++) {
                char c = (char) iStream.read();
                System.out.println(c + "   ");

            }
            iStream.close();

        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
            System.out.println("Exception");
        }*/

    }
}

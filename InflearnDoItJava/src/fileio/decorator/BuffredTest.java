package fileio.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffredTest {

    public static void main(String[] args) {
        long milli = 0;
        int len = 0;
        try(FileInputStream fis = new FileInputStream("/Users/haneulkim/Documents/java-practice/InflearnDoItJava/src/reader.txt")){
            FileOutputStream fos = new FileOutputStream("b.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            milli = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1){
                bos.write(i);
                i++;
            }
            milli = System.currentTimeMillis()-milli;
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println(len);
        System.out.println(milli);
    }
}

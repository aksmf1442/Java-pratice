package fileio.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {
        long milli = 0;
        int len = 0;
        try(FileInputStream fis = new FileInputStream("/Users/haneulkim/Documents/java-practice/InflearnDoItJava/src/reader.txt")){
            FileOutputStream fos = new FileOutputStream("b.txt");

            milli = System.currentTimeMillis();
            int i;
            while ((i = fis.read()) != -1){
                fos.write(i);
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

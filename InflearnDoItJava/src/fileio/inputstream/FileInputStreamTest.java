package fileio.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {
        FileReader fis = null;
        int i = 0;
        try{
            fis = new FileReader("/Users/haneulkim/Documents/java-practice/InflearnDoItJava/src/fileio/inputstream/input.txt");

            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }

        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}

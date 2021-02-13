package ch15;


import java.io.*;

class FileViewer {
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

        int data = 0;
        while((data = fis.read())!=-1){
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}

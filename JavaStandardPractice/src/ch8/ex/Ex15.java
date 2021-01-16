package ch8.ex;

import java.io.*;

public class Ex15 {

  public static void main(String[] args) {
    File f = createFile("");
    System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
  }

  static File createFile(String fileName) {
    try {
      if (fileName == null || fileName.equals("")) {
        throw new Exception("파일 이름이 유효하지 앖습니다.");
      }
    } catch (Exception e) {
      fileName = "제목없음.txt";
    }finally{
      File f = new File(fileName);
      createnewFile(f);
      return f;
    }
  }

  private static void createnewFile(File f) {
    try{
      f.createNewFile();
    }catch (Exception e){}
  }
  }

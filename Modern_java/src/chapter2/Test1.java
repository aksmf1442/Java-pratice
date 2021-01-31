package chapter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

enum Color {RED, GREEN}


public class Test1 {

  public static void main(String[] args) throws Exception {
    // 4단계
    String oneLine = processFile((BufferedReader br) -> br.readLine());
    String twoLines = processFile((BufferedReader br) -> br.readLine()+br.readLine());
  }

  // 1단계
  public static String processFile() throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
      return br.readLine();
    }
  }

  // 3단계
  public static String processFile(BufferedReaderProcessor p) throws IOException{
    try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
      return p.process(br);
    }
  }
}

// 2단계
interface BufferedReaderProcessor{
  String process(BufferedReader b ) throws IOException;
}


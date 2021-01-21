package ch13;

import java.util.stream.IntStream;

public class Ex5 {

  static long startTime = 0;

  public static void main(String[] args) {
    ThreadEx5_1 th1 = new ThreadEx5_1();
    th1.start();
    startTime = System.currentTimeMillis();

    IntStream.range(0, 300).forEach((x) -> System.out.printf("%s", new String("-")));
    System.out.print("소요시간1:" + (System.currentTimeMillis()-startTime));
  }
}

class ThreadEx5_1 extends Thread{
  public void run(){
    IntStream.range(0, 300).forEach((x) -> System.out.printf("%s", new String("|")));
    System.out.print("소요시간2:" + (System.currentTimeMillis()-Ex5.startTime));
  }
}
package ch13;

import java.util.stream.IntStream;

public class Ex4 {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    IntStream.range(0, 300).forEach((x) -> System.out.printf("%s", new String("-")));

    System.out.print("소요시간1:" + (System.currentTimeMillis() - startTime));

    IntStream.range(0, 300).forEach((x) -> System.out.printf("%s", new String("|")));

    System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
  }
}

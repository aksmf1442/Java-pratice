package net.sky;

import java.util.stream.IntStream;

public class TDD {


  public int add(String s) {
    if (s.length()==0){
      return 0;
    }
    String[] result = s.split("[,:]");
    return IntStream.range(0, result.length).map((x) -> Integer.parseInt(result[x]))
        .sum();
  }
}

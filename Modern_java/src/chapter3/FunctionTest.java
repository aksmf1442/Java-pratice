package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

  public static void main(String[] args) {
    List<Integer> l = map(
        Arrays.asList("kim", "ha", "neul"),
        (String s) -> s.length()
    );
    System.out.println(l.toString());
  }
  
  // String length 반환 함수
  public static <T, R> List<R> map(List<T> list, Function<T, R> f){
    List<R> result = new ArrayList<>();
    for (T t: list){
      result.add(f.apply(t));
    }
    return result;
  }
}

package ch14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Ex4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    IntStream.range(0, 10).forEach(list::add); // (i) -> list.add(i)

    // list의 모든 요소를 출력
    list.forEach(i -> System.out.print(i+", "));
    System.out.println();

    list.removeIf(x->x%2==0 || x%3==0);
    System.out.println(list);

    list.replaceAll(i ->i*10);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    map.forEach((k,v) -> System.out.println("{" + k + "," + v +"},"));
    System.out.println();
  }
}

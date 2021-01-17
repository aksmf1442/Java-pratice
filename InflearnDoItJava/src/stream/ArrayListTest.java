package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

  public static void main(String[] args) {
    List<String> sList = new ArrayList<>();
    sList.add("토마스");
    sList.add("James");
    sList.add("Edward");

    Stream<String> stream = sList.stream();
    stream.forEach(s-> System.out.println(s));

    // 위의 스트림과 같다.
//    for(String s : sList){
//      System.out.println(s);
//    }

    // sorted()중간 연산자 forEach() 최종연산자
    sList.stream().sorted().forEach(s-> System.out.println(s));


  }
}

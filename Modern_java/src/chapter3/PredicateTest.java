package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

  public static void main(String[] args) {
    Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
    List<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("");
    listOfStrings.add("a");
    listOfStrings.add("b");
    System.out.println(listOfStrings.toString());
    List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
    System.out.println(nonEmpty.toString());
  }

  public static <T> List<T> filter(List<T> list, Predicate<T> p){
    List<T> results = new ArrayList<>();
    for (T t: list){
      if (p.test(t)){
        results.add(t);
      }
    }
    return results;
  }
}

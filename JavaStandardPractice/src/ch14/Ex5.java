package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Ex5 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
    Consumer<Integer> c = i -> System.out.print(i + ", ");
    Predicate<Integer> p = i -> i % 2 == 0;
    Function<Integer, Integer> f = i -> i/10*10;
    List<Integer> list = new ArrayList<>();
    makeRandomList(s, list);
    System.out.println(list);
    printEvenNum(p, c, list);
    List<Integer> newList = doSomething(f, list);
    System.out.println(newList);
  }

  private static List<Integer> doSomething(Function<Integer, Integer> f, List<Integer> list) {
    List<Integer> newList = new ArrayList<>(list.size());
    list.stream().forEach((i) -> newList.add(f.apply(i)));
    return newList;
  }

  private static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c, List<Integer> list) {
    System.out.print("[");
    list.stream().filter(p::test).forEach(c::accept);
    System.out.println("]");
  }

  private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
    IntStream.range(0, 10).forEach((x) -> list.add(s.get()));
  }
}

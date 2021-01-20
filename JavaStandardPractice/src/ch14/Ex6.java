package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Ex6 {

  public static void main(String[] args) {
    IntSupplier s = () -> (int) (Math.random() * 100) + 1;
    IntConsumer c = i -> System.out.print(i + ", ");
    IntPredicate p = i -> i % 2 == 0;
    IntFunction<Integer> f = i -> i/10*10;
    List<Integer> list = new ArrayList<>();
    makeRandomList(s, list);
    System.out.println(list);
    printEvenNum(p, c, list);
    List<Integer> newList = doSomething(f, list);
    System.out.println(newList);
  }

  private static List<Integer> doSomething(IntFunction<Integer> f, List<Integer> list) {
    List<Integer> newList = new ArrayList<>(list.size());
    list.stream().forEach((i) -> newList.add(f.apply(i)));
    return newList;
  }

  private static void printEvenNum(IntPredicate p, IntConsumer c, List<Integer> list) {
    System.out.print("[");
    list.stream().filter(p::test).forEach(c::accept);
    System.out.println("]");
  }

  private static void makeRandomList(IntSupplier s, List<Integer> list) {
    IntStream.range(0, 10).forEach((x) -> list.add(s.getAsInt()));
  }
}

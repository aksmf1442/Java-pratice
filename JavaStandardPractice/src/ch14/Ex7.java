package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex7 {

  public static void main(String[] args) {
    Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // 16진수 변환
    Function<Integer, String> g = Integer::toBinaryString; // 이진수로 변환

    Function<String, String> h = f.andThen(g); // 16진수로 변환후 이진수로 변환
    Function<Integer, Integer> h2 = f.compose(g); // 이진수로 변환후 16진수로 변환

    System.out.println(h.apply("FF"));
    System.out.println(h2.apply(2));

    Function<String, String> f2 = x -> x;
    System.out.println(f2.apply("AAA"));

    Predicate<Integer> p = i -> i < 100;
    Predicate<Integer> q = i -> i < 200;
    Predicate<Integer> r = i -> i%2 == 0;
    Predicate<Integer> notP = p.negate();

    Predicate<Integer> all = notP.and(q.or(r));
    System.out.println(all.test(150));

    String str1 = "abc";
    String str2 = "abc";

    Predicate<String> p2 = Predicate.isEqual(str1);
    boolean result = p2.test(str2);
    System.out.println(result);


  }
}

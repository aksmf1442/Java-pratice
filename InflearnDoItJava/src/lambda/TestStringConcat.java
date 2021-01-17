package lambda;

public class TestStringConcat {

  public static void main(String[] args) {
    // 객체지향 프로그래밍
    StringConcatImpl sImpl = new StringConcatImpl();
    sImpl.makeString("hello", "java");

    // 람다식
    StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
    concat.makeString("hello", "java");

    // 람다식은 내부에서 익명클래스가 구현된다.
    StringConcat concat2 = new StringConcat() {
      @Override
      public void makeString(String s1, String s2) {
        System.out.println(s1 + " " + s2);
      }
    };
    concat2.makeString("hello","java");
  }
}

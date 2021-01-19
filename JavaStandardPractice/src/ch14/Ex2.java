package ch14;
@FunctionalInterface
interface MyFunction2{
  void myMethod();
}

public class Ex2 {

  public static void main(String[] args) {
    MyFunction2 f = () -> {};

    Object obj = (MyFunction2)(()->{});
    String str = ((Object)(MyFunction2)(()->{})).toString();

    System.out.println(f);
    System.out.println(obj);
    System.out.println(str);

//    System.out.println(() -> {}); // 에러. 람다식은 Object타입으로 형변환 안됌.
    System.out.println((MyFunction2) (()->{}));
//    System.out.println((MyFunction2) (()->{}).toString);// 에러
    System.out.println(((Object)(MyFunction2)(()->{})).toString());
  }
}

package ch8.ex;

public class Ex10 {

  public static void main(String[] args){
    method1();
  }

  static void method1() throws RuntimeException{
    method2();
  } // method1()

  static void method2() {
    throw new NullPointerException(); // NullPointerException을 발생시킨다.
  }
}

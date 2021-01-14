package ch8.ex;

public class Ex2 {

  public static void main(String[] args) {
    int number = 100;
    int result = 0;

    // 정수를 0으로 나누면 에러(실수는 괜찮다.)
//    for (int i = 0; i < 10; i++){
//      result = number / (int)(Math.random() * 10);
//      System.out.println(result);
//    }


    // try catch문으로 에러처리
    for (int i = 0; i < 10; i++){
      try {
        result = number / (int) (Math.random() * 10);
        System.out.println(result);
      }catch (ArithmeticException e){
        System.out.println("0");
      }
    }

  }
}

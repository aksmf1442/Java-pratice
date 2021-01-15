package ch8.ex;

public class Ex14 {

  public static void main(String[] args) {
    try{
      method1();
    }catch (Exception e){
      System.out.println("method1메서드에서 예외가 처리되었습니다.");
      e.printStackTrace();
    }
  }

  private static void method1() throws Exception {
    throw new Exception(); // 예외 처리를 호출한 메서드에 책임 전가
  }

}

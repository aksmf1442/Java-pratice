package innerclass;

import innerclass.OutClass.InStaticClass;

class OutClass {

  private int num = 10;
  private static int sNum = 20;
  private InClass inClass;

  public OutClass(){
    inClass = new InClass();
  }

  class InClass {
    int inNum = 200;
//    static int sInNum = 100; // 예외

    void inTest(){
      System.out.println(num);
      System.out.println(sNum);
    }
  }

  public void usingTest(){
    inClass.inTest();
  }

  static class InStaticClass{
    int iNum = 100;
    static int sInNum = 200;

    static void inTest(){
//      num += 10; // 아직 인스턴스가 생성 안되서 사용불가
      sNum +=10;
      System.out.println(sNum);
      System.out.println(sInNum);
    }
  }
}

public class InnerTest {

  public static void main(String[] args) {
    OutClass outClass = new OutClass();
    outClass.usingTest();

    OutClass.InStaticClass sInClass = new InStaticClass();
    OutClass.InStaticClass.inTest();
  }
}

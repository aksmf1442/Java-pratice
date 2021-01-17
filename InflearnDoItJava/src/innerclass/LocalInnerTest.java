package innerclass;

class Outer {

  int outNum = 100;
  static int sNum = 200;

  Runnable runnable = new Runnable() {
    @Override
    public void run() {
      System.out.println("runnable");
    }
  };

  public Runnable getRunnable(int i){
    int localNum = 100;

    return new Runnable() {
      @Override
      public void run() {
        System.out.println("로컬내부클래스");
      }
    };
  }

}

public class LocalInnerTest {

  public static void main(String[] args) {
    Outer outer = new Outer();
    Runnable runnable = outer.getRunnable(20);
    runnable.run();

    outer.runnable.run();
  }


}

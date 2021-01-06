import java.util.Scanner;

public class Boj1000 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(add(a, b));
  }

  public static int add(int a, int b) {
    return a + b;
  }
}

class Test {

  public void addTest() {
    int result = Boj1000.add(3, 5);
    if (result == 8) {
      System.out.println("add : pass");
    } else {
      System.out.println("add : false");
    }
  }
}
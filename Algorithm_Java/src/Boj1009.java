import java.util.Scanner;

public class Boj1009 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int result = a % 10;
      for (int j = 0; j < b - 1; j++) {
        result *= a;
        result %= 10;
      }
      result = (result == 0 ? 10 : result);
      System.out.println(result);
    }
  }
}

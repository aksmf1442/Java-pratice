import java.util.ArrayList;
import java.util.Scanner;

public class Boj1052 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int result = 0;
    while (true) {
      ArrayList<Boolean> lst = new ArrayList<>();
      int tmp = n;
      while (tmp > 0) {
        lst.add((tmp % 2) == 1);
        tmp /= 2;
      }
      int count = 0;

      for (int i = 0; i < lst.size(); i++) {
        count += (lst.get(i).equals(true) ? 1 : 0);
      }

      if (count <= k) {
        break;
      }
      n += 1;
      result += 1;
    }
    System.out.println(result);
  }
}

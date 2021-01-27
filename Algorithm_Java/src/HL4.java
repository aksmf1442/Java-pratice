public class HL4 {
  static int saveThePrisoner(int n, int m, int s) {
    m %= n;
    s = (s+m-1)%n;
    if (s == 0){
      return n;
    }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(saveThePrisoner(5,2,1)); // 2
    System.out.println(saveThePrisoner(5,2,2)); // 3
    System.out.println(saveThePrisoner(7,19,2)); // 6
    System.out.println(saveThePrisoner(3,7,3)); // 3
  }
}

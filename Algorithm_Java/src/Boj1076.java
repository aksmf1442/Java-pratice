import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj1076 {

  public static void main(String[] args) {
    Map<String, String> value = valueReturn();
    Map<String, Long> multiply = multiplyReturn();
    Scanner scanner = new Scanner(System.in);
    String color1 = scanner.next();
    String color2 = scanner.next();
    int sum = Integer.parseInt(value.get(color1) + value.get(color2));
    String color3 = scanner.next();
    long mul = multiply.get(color3);
    long result = sum * mul;
    System.out.println(result);
  }

  private static Map<String, Long> multiplyReturn() {
    Map<String, Long> value = new HashMap<>();
    value.put("black", 1L);
    value.put("brown", 10L);
    value.put("red", 100L);
    value.put("orange", 1000L);
    value.put("yellow", 10000L);
    value.put("green", 100000L);
    value.put("blue", 1000000L);
    value.put("violet", 10000000L);
    value.put("grey", 100000000L);
    value.put("white", 1000000000L);

    return value;
  }

  public static Map<String, String> valueReturn() {
    Map<String, String> value = Map.of(
        "black", "0",
        "brown", "1",
        "red", "2",
        "orange", "3",
        "yellow", "4",
        "green", "5",
        "blue", "6",
        "violet", "7",
        "grey", "8",
        "white", "9"
    );
    return value;
  }


}

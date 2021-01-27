

public class HL2 {

  static String timeConversion(String s) {
    int length = s.length();
    String result = "";
    String time = s.substring(length - 2, length);
    int tmp = Integer.parseInt(s.substring(0, 2));
    String candidate = "";
    if (time.equals("PM")) {
      tmp += 12;
      if (tmp == 24) {
        candidate = "12";
      } else {
        candidate = (tmp>=10?""+tmp:"0"+tmp);
      }
    } else {
      if (tmp == 12) {
        candidate = "00";
      } else {
        candidate = (tmp>=10?""+tmp:"0"+tmp);
      }
    }

    return candidate + s.substring(2, length - 2);
  }

  public static void main(String[] args) {
    System.out.println(timeConversion("12:00:00PM"));
  }
}

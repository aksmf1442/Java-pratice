package pcroom;

import java.time.LocalDate;
import java.util.Random;

public class Main {

  /*
      +------------+---------------+------+-----+---------+-------+
      | Field      | Type          | Null | Key | Default | Extra |
      +------------+---------------+------+-----+---------+-------+
      | nickname   | varchar(64)   | YES  |     | NULL    |       |
      | money      | decimal(10,2) | YES  |     | NULL    |       |
      | last_visit | datetime      | YES  |     | NULL    |       |
      +------------+---------------+------+-----+---------+-------+
   */
  private static Random r = new Random();

  private static LocalDate today = LocalDate.now();

  public static void main(String[] args) {
    Main main = new Main();
    int count = Integer.parseInt(args[0]);
    main.genData(count, 3);
  }

  private void progress(int curr, int tot) {
    if (curr == tot - 1) {
      System.err.println("\n");
    } else if (curr % (tot / 10) == 0) {
      System.err.print("*");
    }
  }

  private void genData(int count, int clen) {
    int money = 99999;
    for (int i = 0; i < count; i++) {
      progress(i, count);
      System.out.printf("%s,%d,%s\n", genNickname(clen), genMoney(money), genData());
    }
  }

  private Object genData() {
    return today.minusDays(r.nextInt(30));
  }

  private Object genMoney(int money) {
    return r.nextInt(99999) + 1;
  }

  private Object genNickname(int clen) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < clen; i++) {
      sb.append((char) ('a' + r.nextInt(24)));
    }
    for (int i = 0; i < 4; i++) {
      sb.append(r.nextInt(9) + 1);
    }
    return sb.toString();
  }
}

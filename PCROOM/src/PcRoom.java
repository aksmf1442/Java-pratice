import static pc.PcDB.emptyPc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import util.DatabaseUtil;

public class PcRoom {

  public static void main(String[] args) {
    Connection conn = DatabaseUtil.getConnection();
    PartTimer partTimer = new PartTimer(conn);
    Scanner sc = new Scanner(System.in);
    System.out.println("> 빈 자리는 다음과 같습니다.");
    System.out.println(emptyPc(conn).toString());

    while (true) {
      System.out.print("> ");
      String[] state = sc.nextLine().split(" ");

      if (state[0].equals("q")) {
        System.out.println("종료");
        break;
      }

      // 아르바이트생에게 손님응대 맡기기.
      partTimer.work(state);
    }

    // 연결 해제
    try {
      conn.close();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}

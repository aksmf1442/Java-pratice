import static pc.PcDB.emptyPc;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import user.UserDB;

public class PartTimer {

  private UserDB userDB;
  private Scanner sc;
  private Connection conn;

  public PartTimer(Connection conn){
    this.conn = conn;
    userDB = new UserDB(conn);
    sc = new Scanner(System.in);
  }

  public void work(String[] state) {
    // 사용중이지 않은 pc 값 랜덤으로 하나 뽑아오기.
    String pc = emptyPc(conn).get(new Random().nextInt(emptyPc(conn).size()));

    if (state.length == 1 && state[0].equals("new")) {
      pcGuide(pc);
    } else if (state.length == 2 && state[0].equals("stop")) {
      pcStop(state);
    } else {
      System.out.println("잘못된 입력");
    }

    System.out.println(emptyPc(conn).toString());
  }

  private void pcStop(String[] state) {
    int UsingPc = userDB.UsingPc(state[1]);
    userDB.finishPc(state[1], LocalDateTime.now().toString());
    if (UsingPc == -1) {
      return;
    }
    System.out.printf("이제 %d번 자리가 비었습니다.\n", UsingPc);
  }

  private void pcGuide(String pc) {
    System.out.printf("%s번 자리에 앉으세요 : ", pc);
    String user = sc.nextLine();
    userDB.join(user, LocalDateTime.now().toString(), pc);
  }


}

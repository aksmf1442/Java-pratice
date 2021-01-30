package play;

import java.util.Scanner;
import user.UserDAO;

public class Play {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UserDAO userDAO = new UserDAO();
    while (true){
      System.out.print("i");
      String id = sc.next();
      System.out.print("password를 입력해주세요 :");
      String password = sc.next();
      userDAO.join(id, password);
    }
  }
}

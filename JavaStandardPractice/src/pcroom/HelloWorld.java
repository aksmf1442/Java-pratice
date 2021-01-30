package pcroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld {
  public static void main(String[] args) {
    Connection con = null;

    String server       = "localhost:3306"; // MySQL 서버 주소
    String database     = "PCROOM_DB"; // MySQL DATABASE 이름
    String user_name    = "haneulkim-mysql"; //  MySQL 서버 아이디
    String password     = "1720"; // MySQL 서버 비밀번호


    // 1.드라이버 로딩
    try {//cj.jdbc여야 한다. 안그러면 deprecated되었다는 에러가 출력된다
      Class.forName("com.mysql.cj.jdbc.Driver");//
    } catch (ClassNotFoundException e) {
      System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
      e.printStackTrace();
    }

    // 2.연결
    try {
      con = DriverManager.getConnection( "jdbc:mysql://"
          + server + "/"
          + database
          + "?useSSL=false", user_name, password);
      System.out.println("정상적으로 연결되었습니다.");
    } catch(SQLException e) {
      System.err.println("con 오류:" + e.getMessage());
      e.printStackTrace();
    }

    // 3.해제
    try {
      if(con != null)
        con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}

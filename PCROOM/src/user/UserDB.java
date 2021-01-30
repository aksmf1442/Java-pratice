package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pc.PcDB;

public class UserDB {

  private Connection conn;
  PcDB pcDB;

  public UserDB(Connection conn){
    this.conn = conn;
    pcDB = new PcDB(conn);
  }

  public int join(String userId, String start_time, String usePc) {
    String SQL = "INSERT INTO user_list VALUES (?, ?, ?, ?)";
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      pstmt.setString(1, userId);
      pstmt.setString(2, start_time);
      pstmt.setString(3, null);
      pstmt.setString(4, usePc);
      int result = pstmt.executeUpdate();
      pcDB.join(usePc, userId);
      return result;
    } catch (Exception e) {
      System.out.println("이미 종료했거나 사용중인 id입니다.");
    }
    return -1;
  }

  public int finishPc(String id, String end_time) {
    String SQL = "UPDATE user_list SET end_time=? WHERE id = ?";
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      pstmt.setString(1, end_time);
      pstmt.setString(2, id);
      pcDB.finishUser(id);
      return pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -1;
  }

  public int UsingPc(String id) {
    String SQL = "SELECT use_pc FROM user_list WHERE id = " + id;
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      ResultSet rs = pstmt.executeQuery(SQL);
      if (rs.next()) {
      }
      return rs.getInt(1);
    } catch (Exception e) {
      System.out.println("사용중이지 않은 Id입니다.");
    }
    return -1;
  }

}

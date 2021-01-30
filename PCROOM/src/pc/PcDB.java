package pc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PcDB {

  private Connection conn;

  public PcDB(Connection conn){
    this.conn = conn;
  }

  public int join(String pcNum, String user) {
    String SQL = "UPDATE pc_list SET user = ? WHERE pc_num = ?";
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      pstmt.setString(1, user);
      pstmt.setString(2, pcNum);
      return pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -1;
  }

  public int finishUser(String user) {
    String SQL = "UPDATE pc_list SET user = null WHERE user = ?";
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      pstmt.setString(1, user);
      int result = pstmt.executeUpdate();
      return result;
    } catch (Exception e) {
      System.out.println("없는 id 입니다.");
    }
    return -1;
  }

  public static List<String> emptyPc(Connection conn) {
    List<String> pc = new ArrayList<>();
    String SQL = "SELECT pc_num FROM pc_list WHERE user IS NULL";
    try {
      PreparedStatement pstmt = conn.prepareStatement(SQL);
      ResultSet rs = pstmt.executeQuery(SQL);
      while (rs.next()) {
        int num = rs.getInt(1);
        pc.add(Integer.toString(num));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return pc;
  }
}

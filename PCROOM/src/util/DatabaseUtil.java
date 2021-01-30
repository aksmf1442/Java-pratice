package util;

import java.sql.Connection;
import java.sql.DriverManager;
// DB연결
public class DatabaseUtil {

  public static Connection getConnection() {
    try {
      String dbURL = "jdbc:mysql://localhost:3306/PCROOM_DB";
      String dbID = "haneulkim";
      String dbPassword = "1720";
      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(dbURL, dbID, dbPassword);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}

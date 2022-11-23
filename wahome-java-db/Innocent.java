// simple java program that print books from database library from a table called all_books

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Innocent {

  public static void main(String[] args) {
    try {
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/library?characterEncoding=latin1";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "wahome", "guruwalker");

      // the mysql insert statement
      String query = "SELECT * FROM all_books";

      // create the mysql insert preparedstatement
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        String name = rs.getString("name");
        String description = rs.getString("description");
        int id = rs.getInt("id");

        // print the results
        System.out.format("%d, %s, %s", id, name, description);
      }
      st.close();
    } catch (Exception e) {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
      System.err.println(e);
    }
  }
}

// set com.mysql.jdbc.Driver to java classpath in ubuntu


package jdbc;

import java.sql.*;

public class NewJDBC {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/movies";
        String user= "ajbhuiya";
        String pass="firoz";
        String query = "select * from movie";
        Class.forName("com.mysql.cj.jdbc.Driver");//loads jdbc driver


      try{  Connection con = DriverManager.getConnection(url,user,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
          while (rs.next()) {
              int id = rs.getInt("id");
              String last = rs.getString("title");
              String first = rs.getString("release_year");
              String city = rs.getString("genre");

              // Display Values
              System.out.println("ID: " + id);
              System.out.println("title " + last);
              System.out.println("release_year " + first);


          }
      } catch(SQLException ex){
          ex.printStackTrace();//helps the programmer understand where the actual problem occurred.
          System.out.println("Something might have went wrong with connection");
      }
    }
}

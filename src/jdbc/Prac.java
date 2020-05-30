package jdbc;

import java.sql.*;

public class Prac {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/movies";
        String user = "ajbhuiya";
        String pass ="firoz";
        String query = "select * from movie";

        Class.forName("com.mysql.cj.jdbc.Driver");//loads jdbc driver
        Connection con = DriverManager.getConnection(url,user,pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
     while (rs.next()){
         System.out.println(rs.getString("id"));
        /* String title = rs.getString("title");
         System.out.println(title);*/
     }



    }

}
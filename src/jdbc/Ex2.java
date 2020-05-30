package jdbc;

import java.sql.*;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/movies";
        String uname = "ajbhuiya";
        String pass = "firoz";
        String query = "select * from movie";

        Class.forName("com.mysql.cj.jdbc.Driver");//loads class

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        System.out.println(rs.getString("id"));
        st.close();
        rs.close();

    }

}

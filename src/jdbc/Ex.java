package jdbc;

import java.sql.*;

public class Ex {
    //load and reg drier
    //create connection-connection
    //create a statement
    //execute query
    //process and then close
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/movies";
        String uname = "ajbhuiya";
        String pass = "firoz";
        String query = "select * from movie";

        Class.forName("com.mysql.cj.jdbc.Driver");//loads jdbc driver
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);//rset has power to store data in tabular structure
        rs.next();//takes pointer to next value
        String name = rs.getString("id");
        System.out.println(name);
        st.close();
        con.close();




    }
}

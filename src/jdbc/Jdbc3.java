package jdbc;

import java.sql.*;

public class Jdbc3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/movies";
        String user = "ajbhuiya";
        String pass = "firoz";
        String query = "select * from movie";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("id") + "\t" +
                        rs.getString("title") + "\t" +
                        rs.getString("genre"));


            }




        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }}
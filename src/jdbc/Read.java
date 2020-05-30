package jdbc;

import java.sql.*;

public class Read {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";
        String user= "ajbhuiya";
        String pass = "firoz";


        try {
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery("select * from movie");

            while(rs.next()){
                int id = rs.getInt("id");
                String title =rs.getString("title");

                System.out.println("Movie : " + id);
                System.out.println("Movie title " + title);

                con.close();
                st.close();
                rs.close();
            }



        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}

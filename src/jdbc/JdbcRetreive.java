package jdbc;

import java.sql.*;

public class JdbcRetreive {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";
        String user = "ajbhuiya";
        String pass = "firoz";

        try {

            //1create a connection by creating connection obj
            Connection connection = DriverManager.getConnection(url, user, pass);// we using drvrman to connect to mysql
            //2. create a statement
            System.out.println("Connected database successfully...");
            Statement stmt = connection.createStatement();
            String query = "select * from movie";
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                int id = results.getInt("id");
                String last = results.getString("title");
                String first = results.getString("release_year");
                String city = results.getString("genre");

                // Display Values
                System.out.println("ID: " + id);
                System.out.println("title " + last);
                System.out.println("release_year " + first);


            }
        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Something might have went wrong with connection");
        }
    }
}

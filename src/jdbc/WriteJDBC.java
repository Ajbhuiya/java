package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteJDBC {

    public static void main(String[] args) {

    String url= "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";//how we gonna connect to our database
    String user= "ajbhuiya";
    String password="firoz";

        try {
            Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();//According to javadoc, createStatement() method creates a Statement instance for sending SQL statements to the database.

            String query= "insert into movie (id, title, release_year, genre, mpaa_rating)" +
                    "values (10, 'independence day', 1999, 'SciFi', 'R');";

            st.execute(query);
            System.out.println("Movie added");







        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws SQLException {

        String url= "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";//how we gonna connect to our database
        String user= "ajbhuiya";
        String password="firoz";

        try {

            //1create a connection by creating connection obj
            Connection connection = DriverManager.getConnection(url, user, password);// we using drvrman to connect to mysql
            //2. create a statement
            Statement statement= connection.createStatement();// to write to sql, execute query

            //3.execute the sql query
            String query= "insert into movie (id, title, release_year, genre, mpaa_rating)" +
                    "values (9, 'inception', 1999, 'SciFi', 'R');";
            statement.execute(query);
            //4. process the result if necessary
            System.out.println("Movie added");


        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Something might have went wrong with connection");
        }









    }
}

       /* //jdbc needs these 3 things for connection
        String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
        String user = "root";
        String password ="firoz";

        Connection connection = null;//connection is a interface
        Statement statement = null;

        Movie titanic = new Movie(5,"titanic",1997,"romance","Pg-13")
        //created object of movie class

        ArrayList<Movie>movies= new ArrayList<>();
        movies.add(titanic);

        try{
            connection= DriverManager.getConnection(url,user,password);//creating connection
       statement=connection.createStatement();//create a connection from jdk to mysql server

       //insert into tableName(id,title) values(5,"titanic);
            for (Movie);



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
*/
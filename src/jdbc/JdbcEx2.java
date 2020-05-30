package jdbc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.Properties;

public class JdbcEx2 {
    // Connection object
    static Connection conn = null;
    // Statement object
    private static Statement stmt;
    // Result Set
    private static ResultSet results = null;
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC"; // ORacle "jdbc:oracle:thin:@localhost:1521/sid"

    // Constant for Database Username
    public static String DB_USER = "ajbhuiya";
    // Constant for Database Password
    public static String DB_PASSWORD = "firoz";
    // Driver
    //public static String driver = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver"- manually done in for name

    // WebDriver
    // public static WebDriver dv;

    @BeforeClass
    public void beforeClass() {
        // Intialize WebDriver
        // dv = new FirefoxDriver();

        // Properties for creating connection to database
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "");

        try {
            // STEP 1: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // STEP 2: Get connection to DB
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // conn = DriverManager.getConnection(DB_URL, props);
            System.out.println("Connected database successfully...");

            // STEP 3: Statement object to send the SQL statement to the Database
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws SQLException {
        String query = "select * from movie";
        try {
            // STEP 4: Extract data from result set
            results = stmt.executeQuery(query);
            while (results.next()) {
                int id = results.getInt("id");
                String last = results.getString("title");
                String first = results.getString("genre");

                // Display Values
                System.out.println("ID: " + id);
                System.out.println("Last Name: " + last);
                System.out.println("First Name: " + first);

                // From GUI
//        		WebElement element = dv.findElement(By.id("uname"));
//        		String actualUserName = element.getText();
//        		Assert.assertEquals(actualUserName, first);
            }
            results.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass() {
        try {
            if (results != null)
                results.close();
            if (stmt != null)
                conn.close();
            if (conn != null)
                conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
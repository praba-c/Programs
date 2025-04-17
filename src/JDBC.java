import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    /*
        Steps:
        import package
        load and register
        create connection
        create and execute statement
        process the results
        close
     */
    public static void main(String[] args) throws Exception {
        // load
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/demo";
        Connection connection = DriverManager.getConnection("", "", "");
    }
}

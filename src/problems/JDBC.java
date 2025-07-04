package problems;

import java.sql.*;

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
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/my_database";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("delete from employees where age = 13");
//        resultSet.next();
//        String name = resultSet.getString("Name");
//        System.out.println(name);

//        while (resultSet.next()) {
//            System.out.print(resultSet.getInt(1) + "    | ");
//            System.out.print(resultSet.getString(2) + "    | ");
//            System.out.print(resultSet.getInt(3) + "    | ");
//            System.out.println(resultSet.getString(4));
//        }

        int Id = 3;
        String Name = "Padma";
        int Age = 23;
        String DOB = "2002-02-01";
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into employees values (?,?,?,?)");
//        preparedStatement.setInt(1, Id);
//        preparedStatement.setString(2, Name);
//        preparedStatement.setInt(3, Age);
//        preparedStatement.setString(4, DOB);
//        preparedStatement.execute();
        connection.close();
    }
}

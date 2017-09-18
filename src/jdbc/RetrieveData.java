package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static jdbc.ConnectionData.*;

public class RetrieveData {
    private final static String selectQuery = "SELECT * FROM users;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(selectQuery);
            System.out.printf("%-20s%s\n", "id", "username");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                System.out.printf("%-20d%s\n", id, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

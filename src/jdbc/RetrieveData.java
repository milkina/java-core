package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static jdbc.ConnectionData.URL;
import static jdbc.ConnectionData.USER;
import static jdbc.ConnectionData.PASSWORD;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM users;";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%s%n", "id", "username");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                System.out.printf("%-20d%s%n", id, name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

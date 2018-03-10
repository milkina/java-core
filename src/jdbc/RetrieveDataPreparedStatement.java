package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static jdbc.ConnectionData.URL;
import static jdbc.ConnectionData.USER;
import static jdbc.ConnectionData.PASSWORD;

public class RetrieveDataPreparedStatement {
    private static final String SELECT_QUERY =
            "SELECT * FROM users WHERE id>? AND username LIKE ?";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(SELECT_QUERY)) {

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "P%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("%d%23s%n", resultSet.getInt("id"), resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static jdbc.ConnectionData.URL;
import static jdbc.ConnectionData.USER;
import static jdbc.ConnectionData.PASSWORD;

public class InsertData {
    private static final String INSERT_QUERY =
            "INSERT INTO users (username) VALUES ('sidorov');";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute(INSERT_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

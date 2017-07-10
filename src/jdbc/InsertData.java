package jdbc;

import java.sql.DriverManager;
import java.sql.Statement;

import static jdbc.Connection.*;

/**
 * Created by Tatyana on 08.07.2017.
 */
public class InsertData {
    private final static String insertQuery = "INSERT INTO users (username) VALUE ('petrov');" +
            "INSERT INTO users (username) VALUE ('sidorov');" +
            "INSERT INTO users (username) VALUE ('ivanov');";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(insertQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

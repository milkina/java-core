package jdbc;

import java.sql.DriverManager;
import java.sql.Statement;

import static jdbc.ConnectionData.*;

public class InsertData {
    private final static String insertQuery = "INSERT INTO users (username) VALUES ('sidorov');";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute(insertQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

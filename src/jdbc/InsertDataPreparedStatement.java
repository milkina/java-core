package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static jdbc.ConnectionData.*;

public class InsertDataPreparedStatement {
    private final static String insertQuery = "INSERT INTO users (username) VALUES (?);";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, "misha");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "grisha");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

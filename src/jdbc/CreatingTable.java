package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static jdbc.ConnectionData.*;

public class CreatingTable {
    private final static String CREATE_TABLE_QUERY =
                    "CREATE TABLE `users` " +
                    "(`id` INT(5) NOT NULL AUTO_INCREMENT," +
                    " `username` VARCHAR(50), " +
                    "PRIMARY KEY(`id`));";

    public static void main(String[] args)throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
             statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



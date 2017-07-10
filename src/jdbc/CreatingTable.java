package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static jdbc.Connection.*;

/**
 * Created by Tatyana on 06.07.2017.
 */
public class CreatingTable {
    private final static String createTableQuery = "CREATE TABLE `users` " +
            "(`user_id` INT(5) NOT NULL AUTO_INCREMENT, `username` VARCHAR(50), " +
            "PRIMARY KEY(`user_id`));";

    public static void main(String[] args)throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

             statement.executeUpdate(createTableQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static jdbc.Connection.PASSWORD;
import static jdbc.Connection.URL;
import static jdbc.Connection.USER;

public class CreatingDatabase {
    //Так мы создаем базу данных:
    private final static String createDatabaseQyery =
            "CREATE DATABASE IF NOT EXISTS article ";

    public static void main(String[] args) throws ClassNotFoundException{
        //Загружаем драйвер
        Class.forName("com.mysql.jdbc.Driver");
        //Нужно создать подключение к БД. У MySQL обязательно есть системная база,
        //к ней и будем создавать соединение.
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mysql", USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            //Обратите внимание, что создаем базу с помощью executeUpdate(). Об этом мы поговорим немного позже.
            statement.executeUpdate(createDatabaseQyery);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

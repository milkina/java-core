package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAO<Integer, User> {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM users";

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                users.add(new User(id, name));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return users;
    }

    @Override
    public User findEntityById(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(User entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(User entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User update(User entity) {
        throw new UnsupportedOperationException();
    }
}

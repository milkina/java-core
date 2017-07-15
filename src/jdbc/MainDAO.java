package jdbc;

public class MainDAO {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        System.out.print(userDAO.findAll());
    }
}

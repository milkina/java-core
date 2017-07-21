package jdbc;

public class MainDAO {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.findEntityById(1));
    }
}

package jdbc;

public class ConnectionData {
    //for MySQL
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB = "catalog";
    public static final String URL = "jdbc:mysql://localhost:3306/" + DB;
    public static final String USER = "root";
    public static final String PASSWORD = "admin";

    //for HA
  /*  public static final String DRIVER = "org.h2.Driver";
    public static final String DB = "test";
    public static final String URL = "jdbc:h2:tcp://localhost/~/" + DB;
    public static final String USER = "sa";
    public static final String PASSWORD = "";*/
}

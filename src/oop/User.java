package oop;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        String str = "**************";
        int length = password.length() > str.length() ? str.length() : password.length();
        return password.charAt(0) + str.substring(1, length);
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

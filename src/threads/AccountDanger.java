package threads;

public class AccountDanger{
    public static void main(String[] args) {
        Account account = new Account();
        Thread one = new Thread(account);
        Thread two = new Thread(account);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }
}

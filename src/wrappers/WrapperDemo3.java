package wrappers;

public class WrapperDemo3 {
    public static void main(String[] args) {
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");
        long long3 = Long.parseLong("101010", 2);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);
    }
}

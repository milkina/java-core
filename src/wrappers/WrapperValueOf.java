package wrappers;

public class WrapperValueOf {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);
        // преобразовывает 101011 к 43
        Integer integer3 = Integer.valueOf("101011", 2);

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
    }
}

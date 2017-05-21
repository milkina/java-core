package wrappers;

public class AutoBoxDemo5 {
    public static void main(String[] args) {
        Integer i1 = 23;
        Integer i2 = 23;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 2300;
        Integer i4 = 2300;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}

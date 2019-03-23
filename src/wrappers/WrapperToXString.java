package wrappers;

public class WrapperToXString {
    public static void main(String[] args) {
        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);
    }
}

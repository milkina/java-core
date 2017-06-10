package collections;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        System.out.println("Length = " + bs1.length()
                + " size = " + bs1.size());
        System.out.println(bs1);
        bs2.set(1);
        bs2.set(2);
        bs1.and(bs2);
        System.out.println(bs1);
    }
}

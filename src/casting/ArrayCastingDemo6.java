package casting;

import oop.Box6;
import oop.HeavyBox1;

public class ArrayCastingDemo6 {
    public static void main(String[] args) {
        HeavyBox1[] heavyBox = new HeavyBox1[4];
        Box6[] box = heavyBox;
        box[0] = new Box6();//ArrayStoreException
    }
}

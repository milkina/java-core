package casting;

import oop.Box;
import oop.HeavyBox1;

public class ArrayCastingDemo6 {
    public static void main(String[] args) {
        HeavyBox1[] heavyBox = new HeavyBox1[4];
        Box[] box = heavyBox;
      //  box[0] = new Box(); //ArrayStoreException
    }
}

package casting;

import oop.Box6;
import oop.HeavyBox1;

public class ArrayCastingDemo5 {
    public static void main(String[] args) {
        Box6[] boxArray = new Box6[5];
        HeavyBox1[] heavyBoxArray = new HeavyBox1[6];
        boxArray = heavyBoxArray;
      //  heavyBoxArray = (HeavyBox1[]) boxArray;
    }
}

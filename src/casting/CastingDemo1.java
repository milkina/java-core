package casting;

import oop.Box6;
import oop.ColorBox;
import oop.HeavyBox1;

public class CastingDemo1 {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        // System.out.println(box1.weight);

        HeavyBox1 heavyBox1 = (HeavyBox1) box1;
        System.out.println("Вес: " + heavyBox1.weight);

        Box6 box2 = new ColorBox();
        HeavyBox1 heavyBox2 = (HeavyBox1) box2; //ClassCastException

        Box6 box3 = new Box6();
        HeavyBox1 heavyBox3 = (HeavyBox1) box3; //ClassCastException
    }
}

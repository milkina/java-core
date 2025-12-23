package casting;

import oop.Box;
import oop.ColorBox;
import oop.HeavyBox1;

public class CastingDemo1 {
    public static void main(String[] args) {
        Box box1 = new HeavyBox1();
        // System.out.println(box1.weight);

        HeavyBox1 heavyBox1 = (HeavyBox1) box1;
        System.out.println("Вес: " + heavyBox1.weight);

        Box box2 = new ColorBox();
        HeavyBox1 heavyBox2 = (HeavyBox1) box2; //ClassCastException

        Box box3 = new Box();
        HeavyBox1 heavyBox3 = (HeavyBox1) box3; //ClassCastException
    }
}

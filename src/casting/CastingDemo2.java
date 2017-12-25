package casting;

import oop.Box6;
import oop.ColorBox;
import oop.HeavyBox1;

public class CastingDemo2 {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        if (box1 instanceof HeavyBox1) {
            System.out.println("Приведение 1");
        }
        if (box1 instanceof Box6) {
            System.out.println("Приведение 2");
        }
        if (box1 instanceof Object) {
            System.out.println("Приведение 3");
        }

        Box6 box2 = new ColorBox();
        if (box2 instanceof HeavyBox1) {
            System.out.println("Приведение 4");
        }

        Box6 box3 = new Box6();
        if (box3 instanceof HeavyBox1) {
            System.out.println("Приведение 5");
        }
    }
}

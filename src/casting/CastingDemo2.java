package casting;

import oop.Box;
import oop.ColorBox;
import oop.HeavyBox1;

public class CastingDemo2 {
    public static void main(String[] args) {
        Box box1 = new HeavyBox1();
        if (box1 instanceof HeavyBox1) {
            System.out.println("Приведение 1");
        }
        if (box1 instanceof Box) {
            System.out.println("Приведение 2");
        }
        if (box1 instanceof Object) {
            System.out.println("Приведение 3");
        }

        Box box2 = new ColorBox();
        if (box2 instanceof HeavyBox1) {
            System.out.println("Приведение 4");
        }

        Box box3 = new Box();
        if (box3 instanceof HeavyBox1) {
            System.out.println("Приведение 5");
        }
    }
}

package casting;

import oop.Box;
import oop.HeavyBox1;

public class ArrayCastingDemo5 {
    public static void main(String[] args) {
        rightConversion();
        wrongConversion();
    }

    private static void rightConversion() {
        Box[] boxArray = new Box[5];
        HeavyBox1[] heavyBoxArray = new HeavyBox1[6];
        boxArray = heavyBoxArray;
    }

    private static void wrongConversion() {
        Box[] boxArray = new Box[5];
        HeavyBox1[] heavyBoxArray = new HeavyBox1[6];
        //ошибка времени выполнения
        heavyBoxArray = (HeavyBox1[]) boxArray;
    }
}

package oop;

public class TestDemo {
    /**
     * Изменение объекта
     *
     * @param o
     */
    static void changeObject(Box o) {
        o.width *= 2;
        o.height /= 2;
        o.depth += 2;
    }

    /**
     * Изменение примитивных типов
     *
     * @param a
     * @param b
     */
    static void changePrimitives(int a, int b) {
        a *= 2;
        b /= 2;
    }

    public static void main(String[] args) {
        Box box = new Box(5, 6, 7);

        int x = 10;
        int y = 10;
        System.out.println("x и y перед вызовом: " + x + " " + y);
        changePrimitives(x, y);
        System.out.println("x и y после вызова: " + x + " " + y);

        System.out.println("box перед вызовом: " + box.width + " " + box.height + " " + box.depth);
        changeObject(box);
        System.out.println("box после вызова: " + box.width + " " + box.height + " " + box.depth);
    }
}

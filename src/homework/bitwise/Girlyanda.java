package homework.bitwise;

public class Girlyanda {

    public static final int LAMPS_COUNT = 32;

    public static void main(String[] args) {
        int girlyanda = 45;
        runString(girlyanda, 20);
    }

    private static void runString(int girlyanda, int count) {
        for (int i = 0; i < count; i++) {
            if (girlyanda < 0) {
                girlyanda <<= 1;
                girlyanda++;
            } else {
                girlyanda <<= 1;
            }

            print(girlyanda);
        }
    }

    private static void print(int girlyanda) {
        String str = Integer.toBinaryString(girlyanda);
        if (str.length() < LAMPS_COUNT) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < LAMPS_COUNT - str.length(); i++) {
                stringBuilder.append("0");
            }
            str = stringBuilder.toString() + str;
        }
        System.out.println(str);
    }
}

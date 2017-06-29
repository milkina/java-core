package homework;

/**
 * Created by Tatyana on 28.06.2017.
 */
public class StringBuilderThread extends Thread {
    private  StringBuilder stringBuilder;

    public StringBuilderThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }
}

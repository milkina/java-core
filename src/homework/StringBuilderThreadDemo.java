package homework;

public class StringBuilderThreadDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");

        StringBuilderThread thread1 = new StringBuilderThread(stringBuilder);
        StringBuilderThread thread2 = new StringBuilderThread(stringBuilder);
        StringBuilderThread thread3 = new StringBuilderThread(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

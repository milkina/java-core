package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            System.out.println(nf.parse("Какое-то число"));
        } catch (ParseException e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            System.out.println(Arrays.toString(stackTraceElements));
        }
        System.out.println("Конец программы.");
    }
}


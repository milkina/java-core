package exceptions;

public class FinallyUse {
    public static void procA() {
        try {
            System.out.println("Внутри procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally для procA ");
        }
    }

    public static void procB() {
        try {
            System.out.println("Внутри procB");
            return;
        } finally {
            System.out.println("finally для procB ");
        }
    }

    public static void procC() {
        try {
            System.out.println("Внутри procC");
        } finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение выброшено");
        }
        procB();
        procC();
    }
}

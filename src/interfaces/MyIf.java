package interfaces;

public interface MyIf {
    int getNumber();

    default String defaultMethod() {
        return "Объект типа String по умолчанию";
    }

    static int staticMethod() {
        return 0;
    }
}

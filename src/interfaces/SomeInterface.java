package interfaces;

/**
 * Created by Tatyana on 25.12.2017.
 */
public interface SomeInterface {
    default String defaultMethod() {
        return "Объект типа String по умолчанию";
    }
}

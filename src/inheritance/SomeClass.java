package inheritance;

public class SomeClass extends SuperClass {
    public SomeClass() {
      //  System.out.println("В конструкторе SomeClass");// ошибка компиляции до Java 22
        super();
    }
}

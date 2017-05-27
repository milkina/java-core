package generics;

public class HierarchyDemo {
    public static void main(String args[]) {
        GenericSuper<Integer> iOb = new GenericSuper<>(88);
        GenericSub<Integer> iOb2 = new GenericSub<>(99);
        GenericSub<String> strOb2 = new GenericSub<>("Generics Test");

        if (iOb2 instanceof GenericSub<?>) {
            System.out.println("iOb2 is instance of GenericSub");
        }
        if (iOb2 instanceof GenericSuper<?>) {
            System.out.println("iOb2 is instance of GenericSuper");
        }
        System.out.println();

        if (strOb2 instanceof GenericSub<?>) {
            System.out.println("strOb is instance of GenericSub");
        }

        if (strOb2 instanceof GenericSuper<?>) {
            System.out.println("strOb is instance of GenericSuper");
        }
        System.out.println();

        if (iOb instanceof GenericSub<?>) {
            System.out.println("iOb is instance of GenericSub");
        }

        if (iOb instanceof GenericSuper<?>) {
            System.out.println("iOb is instance of GenericSuper");
        }

        // The following can't be compiled because
        // generic type info does not exist at run-time.
       /* if (iOb2 instanceof GenericSub<Integer>) {
            System.out.println("iOb2 is instance of Gen2<Integer>");
        }*/
    }
}

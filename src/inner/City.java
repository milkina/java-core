package inner;

public class City {
    static class District {
        void go() {
            System.out.println("Go to the District");
        }
    }

    public static void main(String[] args) {
        Town4.Street street = new Town4.Street(); // both class names
        street.go();
        District district = new District(); // access the enclosed class
        district.go();
    }
}

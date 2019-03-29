package inner;

public class City {
    public static class District {
        public void go() {
            System.out.println("Go to the District.");
        }
    }

    public static void main(String[] args) {
        Town4.Street street = new Town4.Street();
        street.go();
        District district = new District();
        district.go();
    }
}

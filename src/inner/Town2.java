package inner;


public class Town2 {
    private String postCode = "33333";

    public void createAddress() {
        final int houseNumber = 34;
        class Street {
            public void printAddress() {
                System.out.println("PostCode is " + postCode);
                System.out.println("House Number is " + houseNumber);
            }
        }
        Street street = new Street();
        street.printAddress();
    }

    public static void main(String[] args) {
        Town2 town = new Town2();
        town.createAddress();
    }
}

package inner;

public class Town {
    private String postCode = "33333";

    public class Street {
        public void printAddress() {
            System.out.println("Town is " + Town.this);
            System.out.println("PostCode is " + postCode);
            System.out.println("Street is " + this);
        }
    }

    public void createStreet() {
        Street street = new Street();
        street.printAddress();
    }

    public static void main(String[] args) {
        Town town = new Town();
        town.createStreet();
        Town.Street street1 = town.new Street();
        Town.Street street2 = new Town().new Street();
        street1.printAddress();
        street2.printAddress();
    }
}

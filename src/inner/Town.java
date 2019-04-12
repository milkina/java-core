package inner;

public class Town {
    private String postCode = "33333";

    public class Street {
        private int house;

        public void printAddress() {
            System.out.println("Город " + Town.this);
            System.out.println("Индекс " + postCode);
            System.out.println("Улица " + this);
            System.out.println("Дом " + house);
        }
    }

    public void createStreet() {
        Street street = new Street();
        street.house = 78;
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

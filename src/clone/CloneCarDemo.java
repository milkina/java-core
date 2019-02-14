package clone;

import clone.car.Car;

public class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Грузовик", new Driver("Василий", 45));
        Car clonedCar = car.clone();
        System.out.println("Оригинал:\t" + car);
        System.out.println("Клон:   \t" + clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Вася");

        System.out.println("Оригинал после изменения имени водителя:\t" + car);
        System.out.println("Клон после изменения имени водителя:   \t\t" + clonedCar);
    }
}

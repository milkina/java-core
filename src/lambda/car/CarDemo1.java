package lambda.car;


public class CarDemo1 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(CarTypes.COMPACT, 34000),
                new Car(CarTypes.SPORT, 44000),
                new Car(CarTypes.COMPACT, 14000),
                new Car(CarTypes.COMPACT, 10000),
        };
        CarDemo1 carDemo = new CarDemo1();
        System.out.println(carDemo.getCompactCarsNumber(cars));
        System.out.println(carDemo.getExpensiveCarsNumber(cars));
    }

    private int getCompactCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getType().equals(CarTypes.COMPACT)) {
                result++;
            }
        }
        return result;
    }

    private int getExpensiveCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getCost() > 20000) {
                result++;
            }
        }
        return result;
    }
}

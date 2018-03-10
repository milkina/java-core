package lambda.car;


import java.util.ArrayList;
import java.util.List;

public class CarDemo1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(CarTypes.COMPACT, 34000));
        cars.add(new Car(CarTypes.SPORT, 44000));
        cars.add(new Car(CarTypes.COMPACT, 14000));
        cars.add(new Car(CarTypes.COMPACT, 10000));

        CarDemo1 carDemo = new CarDemo1();
        System.out.println(carDemo.findCompactCars(cars));
        System.out.println(carDemo.findExpensiveCars(cars));
    }

    private List<Car> findCompactCars(List<Car> cars) {
        List<Car> compactCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getType().equals(CarTypes.COMPACT)) {
                compactCars.add(car);
            }
        }
        return compactCars;
    }

    private List<Car> findExpensiveCars(List<Car> cars) {
        List<Car> twentyKCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCost() > 20000) {
                twentyKCars.add(car);
            }
        }
        return twentyKCars;
    }
}

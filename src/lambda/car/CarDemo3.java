package lambda.car;

import java.util.ArrayList;
import java.util.List;

public class CarDemo3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(CarTypes.COMPACT, 34000));
        cars.add(new Car(CarTypes.SPORT, 44000));
        cars.add(new Car(CarTypes.COMPACT, 14000));
        cars.add(new Car(CarTypes.COMPACT, 10000));

        CarDemo3 carDemo = new CarDemo3();
        System.out.println(carDemo.findCars(cars, (Car car) -> car.getType().equals(CarTypes.COMPACT)));
    }

    private List<Car> findCars(List<Car> cars, Searchable s) {
        List<Car> searchedCars = new ArrayList<>();
        for (Car car : cars) {
            if (s.test(car)) {
                searchedCars.add(car);
            }
        }
        return searchedCars;
    }
}

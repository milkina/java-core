package lambda.car;

import java.util.ArrayList;
import java.util.List;

public class CarDemo2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(CarTypes.COMPACT, 34000));
        cars.add(new Car(CarTypes.SPORT, 44000));
        cars.add(new Car(CarTypes.COMPACT, 14000));
        cars.add(new Car(CarTypes.COMPACT, 10000));

        CarDemo2 carDemo = new CarDemo2();
        System.out.println(carDemo.findCars(cars, new CompactCarSearch()));
        System.out.println(carDemo.findCars(cars, new TwentyKCarSearch()));

        System.out.println(carDemo.findCars(cars, new Searchable() {
            @Override
            public boolean test(Car car) {
                return car.getType().equals(CarTypes.COMPACT);
            }
        }));
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

package lambda.car;

public class TwentyKCarSearch implements Searchable {
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}

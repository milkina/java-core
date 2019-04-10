package lambda.car;

public class ExpensiveCarSearch implements Searchable {
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}

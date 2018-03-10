package lambda.car;

public class Car {
    private CarTypes type;
    private double cost;

    public Car(CarTypes type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public CarTypes getType() {
        return type;
    }

    public void setType(CarTypes type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.getCost(), getCost()) != 0) return false;
        return getType() == car.getType();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getType() != null ? getType().hashCode() : 0;
        temp = Double.doubleToLongBits(getCost());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }
}

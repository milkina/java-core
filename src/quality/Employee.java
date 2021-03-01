package quality;

public class Employee {
    private double salary;
    private boolean hasBonus;

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return hasBonus ? 100 : 0;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        double income = employee.getSalary() + employee.getBonus();
    }
}

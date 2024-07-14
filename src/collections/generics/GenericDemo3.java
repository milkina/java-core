package collections.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo3 {
    public static void main(String[] args) {
       /* List<?> persons = ...// unbounded wildcard
        List<? extends Employee> employees = ... // upper bounded wildcard
        List<? super Employee> managers = ...// // lower bounded wildcard
*/
        List<Person> persons = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<Manager> managers = new ArrayList<>();
        List<Employee> employees1 = Arrays.asList(new Employee(), new Manager());
       // List<Employee> employees2 = Arrays.asList(new Person());


        processUnbounded(persons);//compilation error
        processUnbounded(employees);
        processUnbounded(managers);

        // processUpperBounded(persons);//compilation error
        processUpperBounded(employees);
        processUpperBounded(managers);

        processLowerBounded(persons);
        processLowerBounded(employees);
     //   processLowerBounded(managers);//compilation error
    }

    public static void processUnbounded(List<?> employees) {
        //  employees.add(new Object());
        employees.add(null);
        System.out.println(employees.get(0));
    }

    public static void processUpperBounded(List<? extends Employee> employees) {
    //    employees.add(new Employee());//compilation error
        employees.add(null);
        Employee employee = employees.getFirst();
    }

    public static void processLowerBounded(List<? super Employee> employees) {
     //   employees.add(new Person()); //compilation error
        employees.add(new Employee());
        employees.add(new Manager());
        Object employee = employees.getFirst();
        if (employee instanceof Employee) {
            Employee myEmployee = (Employee) employee;
        }
    //    Employee employee = employees.getFirst();//compilation error
    }
}

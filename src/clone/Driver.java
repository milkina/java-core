package clone;

/**
 * Created by Tatyana on 09.12.2017.
 */
public class Driver implements Cloneable {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Driver driver = (Driver) o;

        if (getAge() != driver.getAge()) {
            return false;
        }
        return getName() != null ? getName().equals(driver.getName())
                : driver.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Driver{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }

    @Override
    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }
}

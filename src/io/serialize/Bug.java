package io.serialize;

import java.io.Serializable;
import java.util.Objects;

public class Bug extends Insect implements Serializable {
    private boolean fly;

    public Bug(String type, boolean fly) {
        super(type);
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bug bug = (Bug) o;
        return fly == bug.fly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fly);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "fly=" + fly +
                "} " + super.toString();
    }
}

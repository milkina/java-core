package io.serialize;

import java.util.Objects;

public class Insect {
    private String name;

    public Insect(String type) {
        this.name = type;
    }

    public Insect() {
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insect insect = (Insect) o;
        return Objects.equals(name, insect.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Insect{" +
                "name='" + name + '\'' +
                '}';
    }
}

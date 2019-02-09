package io.serialize;

import java.io.Serializable;

public class Bird implements Serializable {
    private String name;
    private transient Ring ring;

    public Bird(String name, Ring ring) {
        this.name = name;
        this.ring = ring;
    }

    public Ring getRing() {
        return ring;
    }
}

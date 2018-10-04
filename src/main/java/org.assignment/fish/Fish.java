package org.assignment.fish;

import org.assignment.Animal;

public class Fish extends Animal {

    private String size;
    private String color;

    public Fish() {
        super(false, false, false, true);
    }

    public Fish(String size, String color) {
        this();
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}

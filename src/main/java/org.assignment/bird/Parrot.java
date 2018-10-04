package org.assignment.bird;

import org.assignment.Animal;

public class Parrot extends Bird {

    public Parrot() {
        super(true, "");
    }

    public Parrot(Animal animal) {
        super(true, animal.getSound());
    }

}

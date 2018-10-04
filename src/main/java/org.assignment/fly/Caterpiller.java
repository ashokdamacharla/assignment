package org.assignment.fly;

import org.Animal;

public class Caterpiller extends Animal {

    public Caterpiller() {
        super(false, true, false, false);
    }

    ButterFly metamorph() {
        return new ButterFly();
    }
}

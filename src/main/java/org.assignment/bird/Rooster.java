package org.assignment.bird;

import org.assignment.Animal;

public class Rooster extends Animal {

    private Chicken chicken = new Chicken("Cock-a-doodle-doo");

    void sing() {
        chicken.sing();
    }

    public boolean isSinging() {
        return chicken.isSinging();
    }

    public String getSound() {
        return chicken.getSound();
    }

}

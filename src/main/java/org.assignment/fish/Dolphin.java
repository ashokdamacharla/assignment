package org.assignment.fish;

import org.assignment.Animal;

public class Dolphin extends Animal {

    private Fish fish = new Fish();

    @Override
    public void swim() {
        fish.swim();
    }

    public boolean isSwimming() {
        return fish.isSwimming();
    }

}

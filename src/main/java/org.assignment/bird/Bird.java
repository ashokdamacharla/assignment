package org.assignment.bird;

import org.assignment.Animal;

public class Bird extends Animal {

    public Bird(boolean isFlying, String sound) {
        super(isFlying, true, true, false, sound);
    }

    public Bird(boolean isFlying, boolean isSwimming, String sound) {
        super(isFlying, true, true, isSwimming, sound);
    }

    public void sing() {
        if(isSinging()) {
            System.out.println("Singing with sound:" + getSound());
        } else {
            System.out.println("I can't make sound.");
        }
    }

}

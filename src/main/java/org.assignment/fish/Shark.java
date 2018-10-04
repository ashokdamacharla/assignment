package org.assignment.fish;

public class Shark extends Fish {

    public Shark() {
        super("LARGE", "GREY");
    }

    public void eat(Fish fish) {
        System.out.println("I am eating Fish:" + fish);
    }

}

package org.assignment;

import org.assignment.bird.*;
import org.assignment.fish.ClownFish;
import org.assignment.fish.Dolphin;
import org.assignment.fish.Fish;
import org.assignment.fish.Shark;
import org.assignment.fly.ButterFly;
import org.assignment.fly.Caterpiller;

import java.util.Arrays;
import java.util.List;

public class AnimalCounters {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new ButterFly(),
                new Caterpiller()
        );

        System.out.println("Total animals fly:" + animals.stream().filter(a -> a.isFlying()).count());
        System.out.println("Total animals Walk:" + animals.stream().filter(a -> a.isWalking()).count());
        System.out.println("Total animals Sing:" + animals.stream().filter(a -> a.isSinging()).count());
        System.out.println("Total animals Swim:" + animals.stream().filter(a -> a.isSwimming()).count());

    }

}

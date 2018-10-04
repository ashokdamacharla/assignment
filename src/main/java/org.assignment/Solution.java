package org.assignment;

import org.assignment.bird.Bird;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird(true, "");
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
package org.assignment;

public class Animal {

    private boolean isFlying;
    private boolean isWalking;
    private boolean isSinging;
    private boolean isSwimming;

    private String sound;

    public Animal(boolean isFlying, boolean isWalking, boolean isSinging, boolean isSwimming) {
        this.isFlying = isFlying;
        this.isWalking = isWalking;
        this.isSinging = isSinging;
        this.isSwimming = isSwimming;
    }

    public Animal(boolean isFlying, boolean isWalking, boolean isSinging, boolean isSwimming, String sound) {
        this.isFlying = isFlying;
        this.isWalking = isWalking;
        this.isSinging = isSinging;
        this.isSwimming = isSwimming;

        this.sound = sound;
    }

    public void fly() {
        if(isFlying()) {
            System.out.println("I am Flying.");
        } else {
            System.out.println("I can't Fly.");
        }
    }

    public void walk() {
        if(isWalking()) {
            System.out.println("I am walking.");
        } else {
            System.out.println("I can't walking.");
        }
    }

    public void swim() {
        if(isSwimming()) {
            System.out.println("I am swimming.");
        } else {
            System.out.println("I can't swim.");
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public boolean isSinging() {
        return isSinging;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public String getSound() {
        return sound;
    }
}

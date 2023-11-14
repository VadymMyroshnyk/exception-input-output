package com.example.exception.error.stackoverflowerror;

public class SpaceShip extends Vehicle {

    @Override
    public void accelerate(float acceleration, float maxVelocity) {
        this.accelerate(acceleration, maxVelocity); // this <-> super
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.accelerate(1, 1);
    }
}

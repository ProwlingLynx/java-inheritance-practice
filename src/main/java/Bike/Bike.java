package Bike;

import base.Vehicle;

public class Bike extends Vehicle {
    int wheels;
    int pedals;

    public Bike(int weight, int speed) {
        super(weight, speed);
        this.wheels = 2;
        this.pedals = 2;
    }

    public void fastPedal() {
        super.move();
    }

    public void getPedalCount() {
        System.out.println("I have " + pedals + " pedals! Whoop!");
    }

    public void getWheelCount() {
        System.out.println("I have " + wheels + " wheels! Still better than two feet!");
    }
}

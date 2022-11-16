package cars;

import base.Vehicle;

public class Car extends Vehicle {
    private int wheels;
    private String color;
    private int seats;
    private int maxFuel;
    private int gasTank;

    public Car(int weight, int speed, int wheels, String color, int seats, int maxFuel, int gasTank) {
        super(weight, speed);
        this.wheels = wheels;
        this.color = color;
        this.seats = seats;
        this.maxFuel = maxFuel;
        this.gasTank = gasTank;
    }

   public void getWheelCount() {
       System.out.println("I have " + wheels + " wheels!" + "Look at me go~");
   }

    public void drive() {
        if (gasTank <= 0) {
            System.out.println("Out of fuel!");
        } else {
            super.move();
            gasTank--;
        }


    }

    public void refuel(int addedFuel) {
        gasTank = Math.min(maxFuel, gasTank + addedFuel);
        System.out.println("Refuel complete!");
        System.out.println("Gas tank has: " + gasTank + " gallons of gas");
    }
}

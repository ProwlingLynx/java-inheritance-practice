package org.example;

import cars.FordFusion;

public class Main {
    public static void main(String[] args) {
        FordFusion myCar = new FordFusion(3, 60, "black", 4, 10, 0);


        myCar.refuel(3);
        myCar.drive();
        myCar.setSpeed(100);
        myCar.drive();
        myCar.getWheelCount();
        myCar.crashAndBurn();




    }
}
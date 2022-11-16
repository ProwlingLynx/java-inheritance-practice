package org.example;

import Bike.Bike;
import cars.FordFusion;

public class Main {
    public static void main(String[] args) {
        FordFusion myCar = new FordFusion(3, 60, "black", 4, 10, 0);
        Bike myBike = new Bike(30, 15);

        myCar.refuel(3);
        myCar.drive();
        myCar.setSpeed(100);
        myCar.drive();
        myCar.getWheelCount();
        myCar.crashAndBurn();

        System.out.println("\n---------------------------------\n");

        myBike.fastPedal();
        myBike.getWheelCount();
        myBike.getPedalCount();




    }
}
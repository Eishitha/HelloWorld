package com.example.sahitya.abcd;

public class MasterVehicle {
    public static void main(String[] args) {
        Bicycle cycle = new Bicycle();
        cycle.changeGear(2);
        cycle.speedUp(4);
        cycle.applyBreak(3);

        Bike myBike = new Bike();
        myBike.changeGear(5);
        myBike.speedUp(4);
        myBike.applyBreak(3);

        cycle.display();
        myBike.display();
    }
}

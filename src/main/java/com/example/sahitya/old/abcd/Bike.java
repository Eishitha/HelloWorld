package com.example.sahitya.old.abcd;

public class Bike implements Vehicle{
    int gear;
    int speed=10;
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void display(){
        System.out.println("\n Present Bike state");
        System.out.println("Gear: " +gear+ " Speed: "+speed );
    }
}

package com.example.sahitya.old.abcd;

public  class Bicycle implements Vehicle{
    int gear;
    int speed;
    public void changeGear(int newGear){
        gear = newGear;
    }

     @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    public void display(){
        System.out.println("Present Bicycle state");
        System.out.println(" Gear: " +gear+" Speed: "+speed );
    }
}

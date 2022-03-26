package com.example.sahitya.old;

public class Train {
   public  void carRange() {
		System.out.println("TRAIN IS RUNNING FAST!SOME PASSENGERS MISSED THE TRAIN");
	}
	public void carSpeed(int speed) {
		System.out.println("TRAIN SPEED IS " +speed);	
	}
	
	public static void main(String[] args) {
		Train myVeh = new Train();
		myVeh.carRange();
		myVeh.carSpeed(700);
		
	}
}

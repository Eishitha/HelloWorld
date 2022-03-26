package com.example.sahitya.old;

public class Statpub {
	 static void mystatic() {
		 System.out.println("I AM STATIC MEMBER");
	 }
	 public void mypublic() {
		 System.out.println("I AM PUBLIC MEMBER");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystatic();
		
		Statpub obj = new Statpub();
		obj.mypublic();
	}

}

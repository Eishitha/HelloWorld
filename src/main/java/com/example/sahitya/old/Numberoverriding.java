package com.example.sahitya.old;

public class Numberoverriding {
 int x =78;
 public static void main(String[] args) {
	 Numberoverriding sw = new Numberoverriding();
	 Numberoverriding sw1 = new Numberoverriding();
	 sw1.x =56;
	 System.out.println(sw.x);
	 System.out.println(sw1.x);
 }
}

package com.example.sahitya.old.abcd;

public class Lambda {
    public static void main(String[] args) {
        Cab cab = (source, destination) ->{
            System.out.println("Uber booked from "+source+" to " +destination+"!!Arriving soon!!!");
            return 200.09;
        };
       double fare= cab.bookCab("Vizag","Kommadi");
       System.out.println("Fare will be "+fare);

    }
}

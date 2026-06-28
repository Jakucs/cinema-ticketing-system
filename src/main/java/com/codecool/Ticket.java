package com.codecool;

public abstract class Ticket {
    private int seatNumber;
    private double price;

    public Ticket (int seatNumber, double price){
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public abstract double getPrice();
}

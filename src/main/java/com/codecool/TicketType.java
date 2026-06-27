package com.codecool;

public enum TicketType {
    CHILD(1200),
    ADULT(2000),
    SENIOR(1500);

    private double price;

    private TicketType(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}

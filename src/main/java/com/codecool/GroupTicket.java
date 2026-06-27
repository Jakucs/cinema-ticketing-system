package com.codecool;

public class GroupTicket {
    private int groupSize;
    private int seatNumber;

    public GroupTicket(int seatNumber, int people){
        this.seatNumber = seatNumber;
        this.groupSize = people;
    }

    public double getPrice(){
        return groupSize * 1800;
    }
}

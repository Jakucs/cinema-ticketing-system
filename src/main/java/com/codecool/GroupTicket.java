package com.codecool;

public class GroupTicket extends Ticket{
    private int groupSize;

    public GroupTicket(int seatNumber, int people){
        super(seatNumber, 0);
        this.groupSize = people;
    }

    @Override
    public double getPrice(){
        return groupSize * 1800;
    }
}

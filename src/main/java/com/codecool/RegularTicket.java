package com.codecool;

public class RegularTicket extends Ticket{
    private TicketType ticketType;

    public RegularTicket(int seatNumber, TicketType ticketType){
        super(seatNumber, ticketType.getPrice());
        this.ticketType = ticketType;
    }

    @Override
    public double getPrice(){
        return ticketType.getPrice();
    }

}
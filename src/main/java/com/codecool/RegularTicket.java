package com.codecool;

public class RegularTicket extends Ticket{
    private TicketType ticketType;

    public RegularTicket(TicketType ticketType, int seatNumber){
        this.ticketType = ticketType;
    }

    public double getPrice(){
        return ticketType.getPrice();
    }

}

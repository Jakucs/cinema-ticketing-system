package com.codecool;

import java.time.LocalDate;
import java.util.List;

public class Screening {
    private Movie movie;
    private String movieName;
    private LocalDate date;
    private List<Ticket> soldTickets;

    public Screening(Movie movie, LocalDate date){
        this.movie = movie;
        this.date = date;
    }

    public void addTicket(Ticket ticket){
        soldTickets.add(ticket);
    }

/*    public double calculateScreeningIncome(){
        double total = 0;
        for(Ticket soldTicket : soldTickets){
            total+=soldTicket.
        }
    }*/
}

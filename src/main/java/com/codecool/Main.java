package com.codecool;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        RegularTicket regularTicket = new RegularTicket(1, TicketType.ADULT);
        RegularTicket regularTicket2 = new RegularTicket(2, TicketType.ADULT);
        RegularTicket regularTicket3 = new RegularTicket(3, TicketType.ADULT);
        RegularTicket regularTicket4 = new RegularTicket(4, TicketType.CHILD);
        RegularTicket regularTicket5 = new RegularTicket(5, TicketType.CHILD);
        RegularTicket regularTicket6 = new RegularTicket(6, TicketType.ADULT);
        RegularTicket regularTicket7 = new RegularTicket(7, TicketType.ADULT);
        RegularTicket regularTicket8 = new RegularTicket(8, TicketType.ADULT);
        RegularTicket regularTicket9 = new RegularTicket(9, TicketType.SENIOR);
        RegularTicket regularTicket10 = new RegularTicket(10, TicketType.ADULT);
        GroupTicket groupTicket = new GroupTicket(1, 10);
        GroupTicket groupTicket2 = new GroupTicket(20, 10);
        GroupTicket groupTicket3 = new GroupTicket(30, 10);
        GroupTicket groupTicket4 = new GroupTicket(40, 10);
        GroupTicket groupTicket5 = new GroupTicket(50, 10);
        GroupTicket groupTicket6 = new GroupTicket(60, 10);
        GroupTicket groupTicket7 = new GroupTicket(70, 10);
        GroupTicket groupTicket8 = new GroupTicket(80, 10);
        GroupTicket groupTicket9 = new GroupTicket(90, 10);

        Movie movie = new Movie("Evil dead", Genre.HORROR, 120);
        Movie movie2 = new Movie("Dirty Dancing", Genre.DRAMA, 90);
        Movie movie3 = new Movie("Unknow", Genre.HORROR, 145);
        Movie movie4 = new Movie("Lucy", Genre.SCIFI, 137);
        Movie movie5 = new Movie("Vacaion", Genre.COMEDY, 119);
        Movie movie6 = new Movie("The worker", Genre.ACTION, 114);

        Screening screening = new Screening(movie, LocalDate.of(2026, 06, 29));
        Screening screening2 = new Screening(movie2, LocalDate.of(2026, 07, 8));
        Screening screening3 = new Screening(movie3, LocalDate.of(2026, 06, 30));
        Screening screening4 = new Screening(movie4, LocalDate.of(2026, 07, 1));
        Screening screening5 = new Screening(movie5, LocalDate.of(2026, 07, 7));
        Screening screening6 = new Screening(movie6, LocalDate.of(2026, 07, 3));

// Screening 1
        screening.addTicket(new RegularTicket(1, TicketType.ADULT));
        screening.addTicket(new RegularTicket(2, TicketType.ADULT));
        screening.addTicket(new RegularTicket(3, TicketType.CHILD));
        screening.addTicket(new RegularTicket(4, TicketType.SENIOR));
        screening.addTicket(new GroupTicket(20, 10));

// Screening 2
        screening2.addTicket(new RegularTicket(1, TicketType.ADULT));
        screening2.addTicket(new RegularTicket(2, TicketType.CHILD));
        screening2.addTicket(new RegularTicket(3, TicketType.ADULT));
        screening2.addTicket(new RegularTicket(4, TicketType.ADULT));
        screening2.addTicket(new GroupTicket(20, 8));
        screening2.addTicket(new GroupTicket(30, 5));

// Screening 3
        screening3.addTicket(new RegularTicket(1, TicketType.ADULT));
        screening3.addTicket(new RegularTicket(2, TicketType.SENIOR));
        screening3.addTicket(new RegularTicket(3, TicketType.CHILD));
        screening3.addTicket(new GroupTicket(20, 12));

// Screening 4
        screening4.addTicket(new RegularTicket(1, TicketType.CHILD));
        screening4.addTicket(new RegularTicket(2, TicketType.CHILD));
        screening4.addTicket(new RegularTicket(3, TicketType.ADULT));
        screening4.addTicket(new RegularTicket(4, TicketType.SENIOR));
        screening4.addTicket(new GroupTicket(20, 6));
        screening4.addTicket(new GroupTicket(30, 15));

// Screening 5
        screening5.addTicket(new RegularTicket(1, TicketType.ADULT));
        screening5.addTicket(new RegularTicket(2, TicketType.ADULT));
        screening5.addTicket(new RegularTicket(3, TicketType.ADULT));
        screening5.addTicket(new RegularTicket(4, TicketType.SENIOR));
        screening5.addTicket(new GroupTicket(20, 20));

// Screening 6
        screening6.addTicket(new RegularTicket(1, TicketType.SENIOR));
        screening6.addTicket(new RegularTicket(2, TicketType.ADULT));
        screening6.addTicket(new RegularTicket(3, TicketType.CHILD));
        screening6.addTicket(new RegularTicket(4, TicketType.ADULT));
        screening6.addTicket(new GroupTicket(20, 10));
        screening6.addTicket(new GroupTicket(30, 7));



    }
}
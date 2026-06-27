package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    List<Screening> screenings = new ArrayList<>();

    public void addScreening(Screening screening){
        screenings.add(screening);
    }

/*    public double calculateTotalIncomeFromAllScreenings(){
        double price = 0;
        for(Screening screening : screenings){

        }
    }*/

/*    public Screening getScreeningsOfASpecificGenre(Genre genre){
        for(Screening screening : screenings){

        }
    }*/
}

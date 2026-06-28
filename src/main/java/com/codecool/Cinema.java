package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    List<Screening> screenings = new ArrayList<>();

    public Cinema(String name){
        this.name = name;
    }

    public void addScreening(Screening screening){
        screenings.add(screening);
    }

    public double calculateTotalIncomeFromAllScreenings(){
        double price = 0;
        for(Screening screening : screenings){
            price += screening.calculateScreeningIncome();
        }
        return price;
    }

    public List<Screening> getScreeningsOfASpecificGenre(Genre genre){
        List<Screening> result = new ArrayList<>();
        for(Screening screening : screenings){
            if(screening.getGenre().equals(genre)){
                result.add(screening);
            }
        }
        return result;
    }
}

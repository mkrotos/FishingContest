package com.krotos;


import com.krotos.Person;

public class Player extends Person {

    //pozycja na łowisku
    private int position;
    //sektor
    private char sector;
    //waga ryb
    private Double fishWeight;
    //punkty sektorowe
    private Integer sectorScore;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public char getSector() {
        return sector;
    }

    public void setSector(char sector) {
        this.sector = sector;
    }

    public Double getFishWeight() {
        return fishWeight;
    }

    public void setFishWeight(Double fishWeight) {
        this.fishWeight = fishWeight;
    }

    public Integer getSectorScore() {
        return sectorScore;
    }

    public void setSectorScore(Integer sectorScore) {
        this.sectorScore = sectorScore;
    }

    public int getTournamentScore() {
        return tournamentScore;
    }

    public void setTournamentScore(int tournamentScore) {
        this.tournamentScore = tournamentScore;
    }

    //punkty w turnieju
    private int tournamentScore;


    //get
    //set
    //addWeight
    //resetWeight
    //toString

}

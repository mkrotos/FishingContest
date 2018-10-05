package com.krotos.fishingcontest2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private long id;
    private char sector;
    private int sectorPosition;
    private double fishWeight;
    private int sectorScore;

    @ManyToOne
    private Player player;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", sector=" + sector +
                ", sectorPosition=" + sectorPosition +
                ", fishWeight=" + fishWeight +
                ", sectorScore=" + sectorScore +
                ", player=" + player +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSector(char sector) {
        this.sector = sector;
    }

    public void setSectorPosition(int sectorPosition) {
        this.sectorPosition = sectorPosition;
    }

    public void setFishWeight(double fishWeight) {
        this.fishWeight = fishWeight;
    }

    public void setSectorScore(int sectorScore) {
        this.sectorScore = sectorScore;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public long getId() {

        return id;
    }

    public char getSector() {
        return sector;
    }

    public int getSectorPosition() {
        return sectorPosition;
    }

    public double getFishWeight() {
        return fishWeight;
    }

    public int getSectorScore() {
        return sectorScore;
    }

    public Player getPlayer() {
        return player;
    }
}

package com.krotos.fishingcontest2.model;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Sector {

    @Id
    private char sectorName;
    @OneToMany(cascade = CascadeType.ALL)
    private Map<Integer,Player> positionsWithPlayers;

    @Override
    public String toString() {
        return "Sector{" +
                "sectorName=" + sectorName +
                ", positionsWithPlayers=" + positionsWithPlayers +
                '}';
    }

    public void setSectorName(char sectorName) {
        this.sectorName = sectorName;
    }

    public void setPositionsWithPlayers(Map<Integer, Player> positionsWithPlayers) {
        this.positionsWithPlayers = positionsWithPlayers;
    }

    public char getSectorName() {

        return sectorName;
    }

    public Map<Integer, Player> getPositionsWithPlayers() {
        return positionsWithPlayers;
    }
}

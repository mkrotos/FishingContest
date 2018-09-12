package com.krotos.services;

import com.krotos.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Sector {

    //lista pozycji w sektorze
    private List<Integer> listOfPositions=new ArrayList<>();
    //lista uczestników w sektorze
    private List<Player> listOfPlayers=new ArrayList<>();

    //konstruktory
    public Sector(){}

    public Sector(Integer ... positions){
        listOfPositions.addAll(Arrays.asList( positions));
    }

    //ustalanie ilosci punktow sektorowych
    public void countScores(){
        listOfPlayers.sort((p1,p2)->p2.getFishWeight().compareTo(p1.getFishWeight()));
        for(Player player:listOfPlayers){
            player.setSectorScore(listOfPlayers.indexOf(player));
        }
    }

    public void addPosition(int position){
        listOfPositions.add(position);
    }
    public void addPlayer(Player player){
        listOfPlayers.add(player);
    }
    //positionsToString()
    //playersToString()
    //playersScoresToString()
    //averageFishWeight()

}

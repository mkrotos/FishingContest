package com.krotos.domain;

import com.krotos.domain.Person;
import com.krotos.domain.Player;
import com.krotos.domain.Sector;

import java.util.Date;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tournament {
    private Random random=new Random();

    private String tournamentName;
    private Date dateOfTournament;
    private Person administrator;
    private List<Person> listOfJudges=new ArrayList<>();	//zmienic na mape ze stanowiskami? <sędzia główny, Person>?
    private String description;

    //lista uczestników
    private List<Player> listOfPlayers=new ArrayList<>();
    //mapa <pozycja,nazwa sektora>
    private Map<Integer,Character> mapOfPositions=new HashMap<>();
    //mapa <nazwa sektora,sektor>
    private Map<Character,Sector> mapOfSectors=new HashMap<>();
    //mapa <punkty w turnieju,nagroda>
    private Map<Integer,String> mapOfRewards=new HashMap<>();

    //losowanie pozycji
    public void lottery(){
        List<Integer> listOfPositions=new ArrayList<>(mapOfPositions.keySet());
        int index;
        for(Player player:listOfPlayers){
            index=random.nextInt(listOfPositions.size());
            player.position=listOfPositions.get(index);
            player.sector=mapOfPositions.get(player.position);
            listOfPositions.remove(index);
            mapOfSectors.get(player.sector).addPlayer(player);
        }
    }

    //ustalenie ilosci punktow turniejowych
    public void countScores(){
        List<Player> listOfResults=new ArrayList<>(listOfPlayers);
        listOfResults.sort((p1,p2)->p2.fishWeight.compareTo(p1.fishWeight));
        listOfResults.sort((p1,p2)->p1.sectorScore.compareTo(p2.sectorScore));
        for(Player player:listOfResults){
            player.tournamentScore=listOfResults.indexOf(player);
        }
    }

    //dodanie pozycji
    public void addPosition(int position,char sectorName){
        mapOfPositions.put(position,sectorName);
        mapOfSectors.get(sectorName).addPosition(position);
    }

    //dodanie sektora
    public void addSector(char name, Integer ... positions){
        mapOfSectors.put(name,new Sector(positions));
        for(int position:positions){
            mapOfPositions.put(position,name);
        }
    }

    //constructors
    //get() wszystko
    //addSdministrator()
    //setAdministrator()
    //setDate()
    //setDescription()
    //addJudge()
    //removeJudge()
    //addPlayer()
    //removePlayer()
    //addReward()
    //removeReward()
    //countScoresInAllSectors()
    //tournamentScoresToString()
    //bestPlayersToString()
    //bestPlayersAndRewardsToString()


}

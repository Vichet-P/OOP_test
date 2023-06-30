package Inheritance;

public class Player {
    String name;

    Player (String name){
        this.name = name;
    }
    void currentClub(){
        System.out.println("Is playing for Real Madrid");
    }
    void national(){
        System.out.println("Is playing for Croatia");
    }
    void oldClub(){
        System.out.println("Was played for Tottenham Hotspur");
    }
}

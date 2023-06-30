package Inheritance;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Luka Modric");
        System.out.println("Player name: "+player1.name);

        Club club = new Club();

        club.oldClub();
        club.currentClub();
        System.out.println("Trophies has won for club: "+club.clubTrophies);

        NationalTeam nationalTeam = new NationalTeam();
        nationalTeam.national();
        System.out.println("Trophies has won for nation: "+nationalTeam.nationalTrophies);




    }
}

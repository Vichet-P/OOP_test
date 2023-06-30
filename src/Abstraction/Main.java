package Abstraction;

public class Main {

    public static void main(String[] args) {
        // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
        //				abstract methods are declared without an implementation

        // Club club = new Club() ; it  cannot instantiated
        Player player = new Player();
        player.currentClub();

    }

}

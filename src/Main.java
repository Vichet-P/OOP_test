public class Main {
    public static void main(String[] args) {
        player player = new player();
        player playerCopy = new player();

        System.out.println(player.name);
        System.out.println(player.club);
        player.currentClub();
        player.nationalTeam();

        System.out.println("\nToni Kroos \n"+playerCopy.club);
        playerCopy.currentClub();
        playerCopy.winWorldCup();



    }
}
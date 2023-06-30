package Static_Friend;

public class Friend {
    String name;
    static int numberofFriend;
    Friend(String name){
        this.name = name;
        numberofFriend++;
    }
    static void displayFriend(){
        System.out.println("You have "+numberofFriend+" friends");
    }
}

package Static_Friend;

public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member
        Friend friend1 = new Friend("Seth");
        Friend friend2 = new Friend("James");
        Friend friend3 = new Friend("Halland");
        Friend friend4 = new Friend("Kroos");
        Friend friend5 = new Friend("Modric");

        System.out.println(Friend.numberofFriend);

        Friend.displayFriend();

    }
}

package Dynamic_Polymorphism;

import Dynamic_Polymorphism.Gender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gender gender;

        System.out.println("What is your gender: ");
        System.out.println("(Press M for Male) ; (Press F for Female)");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char choice = Character.toUpperCase(input.charAt(0));

            if (choice == 'M') {
                gender = new Male();
                gender.gender();
            } else if (choice == 'F') {
                gender = new Female();
                gender.gender();
            } else {
                System.out.println("Invalid gender input!");
            }
        } else {
            System.out.println("You don't want to tell your gender !!!");
        }
    }
}

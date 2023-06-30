import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {

        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try { // can put dangerous code here

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException e) { // if try doesn't work catch can handle itself
            System.out.println("You can't divide by zero! IDIOT!");
        }
        catch(InputMismatchException e) { // this is a specific Exception
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }
        catch(Exception e) { // this is for all Exception
            System.out.println("Something went wrong");
        }
        finally {  // it always print the code in itself
            scanner.close();
        }

    }
}

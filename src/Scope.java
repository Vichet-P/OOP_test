import java.util.Random;

public class Scope {
    Random random;
    int number;
    Scope(){
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(100)+1;
        System.out.println("Your number is : "+ number);
    }



}

package SuperClass;

public class Main {
    public static void main(String[] args) {

        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword

        Hero hero1 = new Hero("Spider-Man",23,"Speed and Jump");
        Hero hero2 = new Hero("Bat-Man",40,"Rich");
        Hero hero3 = new Hero("Super-Man",35,"Fly");


        System.out.println(hero1.name);
        System.out.println(hero2.power);

        System.out.println(hero1.toString());

    }
}

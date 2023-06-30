public class Overload__Main {
    public static void main(String[] args) {

    Overload_Con pizza = new Overload_Con("thicc crust","tomato","mozzerella","pepperoni");
    Overload_Con pizza2 = new Overload_Con("Tomato with beff");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println(pizza2.bread);

    }
}

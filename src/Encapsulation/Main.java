package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford Ranger","Black",2023);

        System.out.println("Display before set new car: ");
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

        System.out.println("\nDisplay after set new car: ");
        car.setBrand("BMW");
        car.setColor("White");
        car.setYear(2024);

        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getYear());


    }
}

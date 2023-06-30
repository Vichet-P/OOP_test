package Copy_Object;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("Chevrolet","Camaro",2021);
        Car car2 = new Car("Range Rover","Black",2023);
        Car car4 = new Car("BMW","Brown",2025);

        System.out.println("First way to do copy: car2.copy(car1);");
        car2.copy(car1); //this copy is just copy the values not copy the address,
        System.out.println("Second way to do copy: Car car3 = new Car(car4);");
        Car car3 = new Car(car4);

        //car1 = car2; // this copy is copy event the address of car1

        System.out.println("The address of car1 in memory is: "+car1);
        System.out.println("The address of car1 in memory is: "+car2);
        System.out.println();
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getBrand());
        System.out.println(car2.getColor());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getBrand());
        System.out.println(car3.getColor());
        System.out.println(car3.getYear());

    }
}

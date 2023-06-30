public class Sold_Car_Main {
    public static void main(String[] args) {
        Sold_Car sold_out = new Sold_Car();

        Car_for_Sell brand_car1 = new Car_for_Sell("Range Rover");
        Car_for_Sell brand_car2 = new Car_for_Sell("BMW");
        Car_for_Sell brand_car3 = new Car_for_Sell("Chevrolet");
        Car_for_Sell brand_car4 = new Car_for_Sell("Toyota");
        Car_for_Sell brand_car5 = new Car_for_Sell("Roll Royce");
        Car_for_Sell brand_car6 = new Car_for_Sell("Morning");

        sold_out.sold_out(brand_car1);
        sold_out.sold_out(brand_car2);

        System.out.println("\n");
        sold_out.in_stock(brand_car3);
        sold_out.in_stock(brand_car4);
        System.out.println("\n");
        sold_out.on_order(brand_car5);
        sold_out.on_order(brand_car6);

    }
}

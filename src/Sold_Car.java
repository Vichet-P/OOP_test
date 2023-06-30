public class Sold_Car {
    void sold_out(Car_for_Sell brand_car){
        System.out.println("The car "+brand_car.name+" is sold out");
    }
    void in_stock (Car_for_Sell car_inStock){
        System.out.println("The car "+car_inStock.name+" is in stock");
    }
    void on_order (Car_for_Sell car_inOrder){
        System.out.println("The car "+car_inOrder.name+" in in order");
    }
}

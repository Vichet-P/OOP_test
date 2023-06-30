public class Overload_Con {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Overload_Con(String bread){

        this.bread = bread;
    }
    Overload_Con(String bread,String sauce){

        this.bread = bread;
        this.sauce = sauce;
    }
    Overload_Con(String bread,String sauce,String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Overload_Con(String bread,String sauce,String cheese,String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}

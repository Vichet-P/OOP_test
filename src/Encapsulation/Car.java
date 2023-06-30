package Encapsulation;

public class Car {
    private String brand;
    private String color;
    private int year;
    Car (String name, String color, int year){
        this.setBrand(name);
        this.setColor(color);
        this.setYear(year);
    }

    // set get function to access the private to main class
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }

    // use set function to set private datatype
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }

}

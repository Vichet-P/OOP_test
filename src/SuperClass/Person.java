package SuperClass;

public class Person {
    String name;
    int age;
    Person (String name, int age){
        this.name = name;
        this.age =age;
    }
    public String toString(){ // it can display all the argument of constructor
        return this.name+"\n"+this.age+"\n";
    }
}

public class Student {
    String name;
    int id;
    int age;
    String province;
    double score;
    Student(String name, int id, int age, double score){
        this.name = name;
        this.id = id;
        this.age = age;
        this.score = score;
    }
    void scholarshipA(){
        System.out.println(this.name+" got a scholarship type A");
    }
    void scholarshipB(){
        System.out.println(this.name+" got a scholarship type B");
    }
    void scholarshipC(){
        System.out.println(this.name+" got a scholarship type C");
    }
}

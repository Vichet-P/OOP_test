public class Student_Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jamse",20211002,21,99.05);
        Student student2 = new Student("Piseth",20210690,20,95.9);
        Student student3 = new Student("Marcus",20202090,23,76.05);

        System.out.println("Name: "+student1.name+"\nID :"+student1.id+"\nScore: "+student1.score);
        student1.scholarshipA();
        System.out.println("\nName: "+student2.name+"\nID :"+student2.id+"\nScore: "+student2.score);
        student2.scholarshipB();
        System.out.println("\nName: "+student3.name+"\nID :"+student3.id+"\nScore: "+student3.score);
        student3.scholarshipC();

    }
}

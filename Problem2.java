package Practice_4Pillars;
/*Create a class hierarchy for a university system.
The superclass 'Person' should have attributes like 'name', 'email', and 'age'. Subclasses 'Student' and 'Professor'
should inherit from 'Person' and have additional fields like 'studentID' and 'professorID' respectively.
Demonstrate how to instantiate and use the subclasses in a Java program.
*/
class Person{
    String name;
    String email;
    int age;

    Person(String name, String email, int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
}

class Student extends Person{
    int studentID;
    Student(String name, String email, int age, int studentID){
        super(name,email,age);
        this.studentID=studentID;
    }

    void Display(){
        System.out.println(name+"\t"+email+"\t"+age+"\t"+studentID);
        System.out.println();
    }

}

class Professor extends Person{
    int professorID;
    Professor(String name, String email, int age, int professorID){
        super(name, email, age);
        this.professorID=professorID;
    }

    void Display(){
        System.out.println(name+"\t"+email+"\t"+age+"\t"+professorID);
        System.out.println();
    }

}

public class Problem2 {
    public static void main(String[] args) {
        Student stud1 = new Student("Vishal Chaudhari", "vishal@gmail.com", 22, 101);
        stud1.Display();

        Professor prof1 = new Professor("Vikash Dubey", "vikash@gmail.com", 32, 320001);
        prof1.Display();



    }
}

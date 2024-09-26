package Practice_4Pillars;
//You are designing a system for a zoo. Create a superclass 'Animal' with properties like 'name' and 'age'.
// Then create subclasses like 'Lion', 'Elephant', and 'Giraffe'. Each subclass should have additional specific properties and methods.
// Write a Java program to implement this hierarchy and demonstrate how to create objects of each class.

class Animal{
    String name;
    int age;
}

class Lion extends Animal{
    Lion(String name, int age){
        this.name=name;
        this.age=age;
    }

    void Prop(){
        System.out.println("Lion is the King of Jungle");
    }

    void Display(){
        System.out.println(name+" "+age);
    }
}

class Elephant extends Animal{
    Elephant(String name, int age){
        this.name=name;
        this.age=age;
    }

    void Prop(){
        System.out.println("The Elephant is large in size and live in a group");
    }

    void Display(){
        System.out.println(name+" "+age);
    }
}



class Giraffe extends Animal{
    Giraffe(String name, int age){
        this.name=name;
        this.age=age;
    }

    void Prop(){
        System.out.println("Giraffe has long neck");
    }

    void Display(){
        System.out.println(name+" "+age);
    }
}



public class Problem1 {
    public static void main(String[] args) {
        Lion l = new Lion("Lion", 14);
        l.Display();
        l.Prop();

        Elephant e = new Elephant("Elephant", 36);
        e.Display();
        e.Prop();

        Giraffe g = new Giraffe("Giraffe", 19);
        g.Display();
        g.Prop();
    }
}

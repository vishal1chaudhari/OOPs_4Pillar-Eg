package Practice_4Pillars;
/*
 Create an abstract class 'Vehicle' with an abstract method 'start'.
 Create concrete subclasses 'Car' and 'Motorcycle', each implementing the 'start' method.
 Write a program to start both types of vehicles using abstraction.
 */
abstract class Vehicle2{
    abstract void Start();
}

class Car2 extends Vehicle2{
    void Start(){
        System.out.println("Starting the Car-");
        System.out.println("Car is starting with the Key ignition");
    }
}

class MotorCylce2 extends Vehicle2{
    void Start(){
        System.out.println("Starting the Motorcycle-");
        System.out.println("Motorcycle is Starting with Kick or Switching on the button");
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Car2 c= new Car2();
        c.Start();
        System.out.println();
        MotorCylce2 m = new MotorCylce2();
        m.Start();



    }
}

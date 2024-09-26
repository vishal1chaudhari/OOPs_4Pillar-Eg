package Practice_4Pillars;
/*Design a class hierarchy for a vehicle rental system. The base class 'Vehicle'
should have common attributes like 'brand', 'model', and 'year'.
Create subclasses 'Car', 'Motorcycle', and 'Bicycle' with their own specific attributes.
Write a program to show the inheritance structure and methods.
*/
class Vehicle{
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    void Display(){
        System.out.println("Details: ");
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}

class Car extends Vehicle{

    Car(String brand, String model, int year){
        super(brand,model,year);
    }

    void Wheels(){
        System.out.println("Car has 4 Wheels and speed is 100km/h \n");
    }

}

class Motorcycle extends Vehicle{

    Motorcycle(String brand, String model, int year){
        super(brand,model,year);
    }

    void Wheels(){
        System.out.println("Motorcycle has 2 Wheels and speed is 60km/h \n");
    }

}

class Bicycle extends Vehicle{

    Bicycle(String brand, String model, int year){
        super(brand,model,year);
    }

    void Wheels(){
        System.out.println("Bicycle has 2 Wheels and speed is 20km/h \n");
    }

}

public class Problem3 {
    public static void main(String[] args) {
        Car c1 = new Car("Hyundai" ,"Creta", 2005);
        c1.Display();
        c1.Wheels();

        Motorcycle m1 = new Motorcycle("Royal Enfileld", "Hunter 350", 2021);
        m1.Display();
        m1.Wheels();

        Bicycle b1 = new Bicycle("Hero", "MotoCorp", 2023);
        b1.Display();
        b1.Wheels();

    }

}

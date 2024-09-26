package Practice_4Pillars;

/*
Create an abstract class 'Appliance' with abstract methods 'turnOn' and 'turnOff'.
Create concrete subclasses 'WashingMachine' and 'Refrigerator', each implementing these methods.
Write a program to control appliances using abstraction.
 */

import java.util.Scanner;

abstract class Application{
    abstract void turnOn();
    abstract void turnOf();
    Scanner sc=new Scanner(System.in);
}

class WashingMachine extends Application{
    void turnOn(){
        System.out.println("Washing Machine is ON...");
    }

    void turnOf(){
        System.out.println("Washing Machine is OFF...");
    }
}

class Refrigerator extends Application{
    void turnOn(){
        System.out.println("Refrigerator is ON...");
    }

    void turnOf(){
        System.out.println("Refrigerator is OFF...");
    }
}

public class Problem11 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();
        Refrigerator rf = new Refrigerator();
        System.out.println("1-Washing Machine\n2-Refrigerator");
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose the Application: ");
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("press 1 for ON or press 0 for OFF");
            int p=sc.nextInt();
            if(p==1){
                wm.turnOn();
            } else if (p==0) {
                wm.turnOf();
            }
        }
        else if(ch==2){
            System.out.println("press 1 for ON or press 0 for OFF");
            int p=sc.nextInt();
            if(p==1){
                rf.turnOn();
            } else if (p==0) {
                rf.turnOf();
            }
        }



    }
}

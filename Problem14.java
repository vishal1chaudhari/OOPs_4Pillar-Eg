package Practice_4Pillars;
/*
 In a payment processing system, create an abstract class 'Transaction' with abstract methods 'processPayment' and 'generateReceipt'.
 Create subclasses 'OnlineTransaction' and 'OfflineTransaction' to implement these methods.
 Demonstrate abstraction in a Java program.
 */

import java.util.Scanner;

abstract class Transaction{
    Scanner sc=new Scanner(System.in);
    String name;
    String UPI;
    int amount;
    abstract void processPayment();
    abstract void generateReceipt();
}

class OnlineTransaction extends Transaction{
    void processPayment(){
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter UPI: ");
        UPI = sc.next();
        System.out.print("Enter Amount: ");
        amount = sc.nextInt();
    }

    void generateReceipt(){
        System.out.println("------------------------------");
        System.out.println("Payment Done Successfully...!");
        System.out.println("Name: "+name);
        System.out.println("UPI: "+UPI);
        System.out.println("Amount: "+amount);
        System.out.println("------------------------------");
    }
}

class OfflineTransaction extends Transaction{
    void processPayment(){
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter Amount: ");
        amount = sc.nextInt();
    }

    void generateReceipt(){
        System.out.println("------------------------------");
        System.out.println("Payment Done Successfully...!");
        System.out.println("Name: "+name);
        System.out.println("Amount: "+amount);
        System.out.println("------------------------------");
    }
}
public class Problem14 {
    public static void main(String[] args) {
        OnlineTransaction ot =new OnlineTransaction();
        OfflineTransaction oft = new OfflineTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Online Transaction\n2-Offline Transaction");
        int ch=sc.nextInt();
        if(ch==1) {
            ot.processPayment();
            ot.generateReceipt();
        }
        else if(ch==2){
            oft.processPayment();
            oft.generateReceipt();
        }
        else{
            System.out.println("Invalid Option");
        }

    }
}

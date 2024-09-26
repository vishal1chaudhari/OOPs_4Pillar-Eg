package Practice_4Pillars;

/*
Create a class 'Payment' with a method 'makePayment'. Create subclasses 'CreditCardPayment' and 'CashPayment',
each overriding the 'makePayment' method. Write a program to demonstrate polymorphism by processing payments using both methods.
 */

class Payment{
    void makePayment(){
        System.out.println("Payment Processing...");
    }
}

class CreditCardPayment extends Payment{
    String cardHolderName;
    int cardNumber;

    CreditCardPayment(String cardHolderName, int cardNumber){
        this.cardHolderName=cardHolderName;
        this.cardNumber=cardNumber;
    }

    void makePayment(){     //Overriden method
        System.out.println("Card Payment is in Process...");
        System.out.println("Card Holder Name: "+cardHolderName);
        System.out.println("Card Number: "+cardNumber);
    }
}

class CashPayment extends Payment{
    float cashAmount;

    CashPayment(float amt){
        cashAmount = amt;
    }

    void makePayment(){
        System.out.println("Cash Payment is in Process...");
        System.out.println("Cash Amount: Rs."+cashAmount);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment("Vishal Chaudhari", 32439025);
        ccp.makePayment();
        System.out.println();

        CashPayment cp = new CashPayment(5400);
        cp.makePayment();

    }
}

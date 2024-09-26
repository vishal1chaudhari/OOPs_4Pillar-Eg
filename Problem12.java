package Practice_4Pillars;
/*
 Design an abstract class 'Bank' with an abstract method 'calculateInterest'.
 Create concrete subclasses 'SavingsBank' and 'LoanBank', each implementing 'calculateInterest' for different types of accounts.
 Demonstrate abstraction in a Java program.
 */
abstract class Bank{
    abstract void calculateInterest(double principle, double rate, int year);
}

class SavingBank extends Bank{
    void calculateInterest(double principle, double rate, int year){
        double interest = principle * rate * year / 100;
        System.out.println("Interest in Saving Bank: "+interest);
    }
}

class LoanBank extends Bank{
    void calculateInterest(double principle, double rate, int year){
        double interest = principle * Math.pow(1+rate/100, year)-principle;
        System.out.println("Interest in Loan Bank: "+interest);
    }
}

public class Problem12 {
    public static void main(String[] args) {
        SavingBank sb = new SavingBank();
        sb.calculateInterest(10000, 5,3);

        LoanBank lb = new LoanBank();
        lb.calculateInterest(10000, 7,3);
    }
}

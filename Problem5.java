package Practice_4Pillars;
/*
Create a 'BankAccount' superclass with attributes like 'accountNumber' and 'balance'.
Create subclasses 'SavingsAccount' and 'CheckingAccount'. Add a method 'deposit' and 'withdraw' in the superclass
and override them in the subclasses as necessary. Write a Java program to simulate transactions.
 */

import java.util.Scanner;

class BankAccount{
    long accountNumber;
    float balance;
    Scanner sc=new Scanner(System.in);
    void CreateAccount(){
        System.out.println("Enter Account No: ");
        accountNumber = sc.nextLong();
        System.out.println("Enter Balance");
        balance = sc.nextFloat();
    }

}

class SavingAccount extends BankAccount{
    float deposit;
    float withdraw;

    void Deposite(){
        System.out.println("Enter your choice: ");
        System.out.println("\n1-Deposit\n2-Withdraw");
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("Enter Amount to Deposit: ");
            deposit = sc.nextFloat();
            balance = balance + deposit;
        } else if (ch==2) {
            System.out.println("Enter amount to Withdraw: ");
            withdraw = sc.nextFloat();
            if(balance>withdraw) {
                balance = balance - withdraw;
            }else{
                System.out.println("No sufficient balance");
            }
        }
        else{
            System.out.println("Invalid Option!");
        }
    }

}

class ChekingAccount extends SavingAccount{

    void Display(){
        System.out.println("Bank Detail: ");
        System.out.println("Account No: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

public class Problem5 {
    public static void main(String[] args) {
        ChekingAccount check1 = new ChekingAccount();
        check1.CreateAccount();
        check1.Deposite();
        check1.Display();
    }
}

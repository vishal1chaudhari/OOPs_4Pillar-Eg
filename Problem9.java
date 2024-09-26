package Practice_4Pillars;
/*
In a payroll system, create a superclass 'Employee' with a method 'calculateSalary'.
Create subclasses 'FullTimeEmployee' and 'PartTimeEmployee', each implementing its own salary calculation.
Write a program to calculate and display salaries using polymorphism.
 */

import java.util.Scanner;

class Employee{
    String name;
    int Id;
    float salary;
    float pf;
    float inHandSalary;
    Scanner sc=new Scanner(System.in);

    void calculateSalary(){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Id: ");
        Id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
        System.out.print("Enter pf in percent: ");
        pf = sc.nextFloat();
    }
}

class FullTimeEmployee extends Employee{
    void calculateSalary(){
        super.calculateSalary();
        inHandSalary = salary - (pf)/100*salary;
        System.out.println("In-Hand Salary of Full time Employee: "+inHandSalary);
    }
}

class PartTImeEmployee extends Employee{
    void calculateSalary(){
        super.calculateSalary();
        if(salary>15000){
            inHandSalary = salary - (pf)/100*salary;
        }
        else{
            inHandSalary = salary;
        }
        System.out.println("In Hand salary of Part time Employee: "+inHandSalary);
    }
}

public class Problem9 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.calculateSalary();
        System.out.println();
        PartTImeEmployee pte = new PartTImeEmployee();
        pte.calculateSalary();
    }
}

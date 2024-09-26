package Practice_4Pillars;
/*
Design an abstract class 'Employee' with abstract methods 'calculateBonus' and 'getEmployeeDetails'.
Create concrete subclasses 'Developer' and 'Manager', each implementing these methods with specific logic.
Write a program to demonstrate abstraction.
 */

abstract class Employee2{
    String name;
    int id;
    int bonus;
    int salary;
    int finalsalary;
    Employee2(String name, int id, int bonus, int salary){
        this.name=name;
        this.id=id;
        this.bonus = bonus;
        this.salary = salary;
    }
    abstract void calculateBonus();
    abstract void getEmployeeDetails();
}

class Developer extends Employee2{
    Developer(String name, int id, int bonus, int salary)
    {
        super(name,id,bonus,salary);
    }
    void calculateBonus(){
        finalsalary = salary + bonus;
    }

    void getEmployeeDetails(){
        System.out.println("Developer Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("FinalSalary: "+finalsalary);
    }
}

class Manager extends Employee2{
    Manager(String name, int id, int bonus, int salary)
    {
        super(name,id,bonus,salary);
    }
    void calculateBonus(){
        finalsalary = salary + bonus;
    }

    void getEmployeeDetails(){
        System.out.println("Manager Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("FinalSalary: "+finalsalary);
    }
}

public class Problem15 {
    public static void main(String[] args) {
        Developer d = new Developer("Vishal", 101, 43500,3000);
        d.calculateBonus();
        d.getEmployeeDetails();
        System.out.println();
        Manager m = new Manager("Jayesh Sharma", 202, 64000, 3800);
        m.calculateBonus();
        m.getEmployeeDetails();
    }
}
